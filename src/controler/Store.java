package controler;

import enums.CactusShape;
import enums.FlowerColor;
import enums.PlantsTypes;
import interfaces.Item;
import interfaces.builder.IFlowerSpecBuilder;
import interfaces.plants.IPlant;
import model.Order;
import model.builder.ArtificialFlowerBuilder;
import model.builder.CactusSpecBuilder;
import model.builder.FlowerSpecBuilder;
import model.delivery.DHLDeliveryStrategy;
import model.item.decorators.BasketDecorator;
import model.item.Bouquet;
import model.item.decorators.PaperDecorator;
import model.item.decorators.RibbonDecorator;
import model.payment.PayPalPaymentStrategy;
import model.suppliers.CactusSupplierObserver;
import model.suppliers.FlowerSupplierObserver;
import model.utilities.PlantFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Created by Dell on 04.10.2016.
 */
public class Store {
    private ArrayList<IPlant> plantsArray;

    public static void main(String[] args) {

        Store store = new Store();

        // create Order (Observable)
        Order order = new Order();

        // create Suppliers (Observers)
        CactusSupplierObserver cactusSupplier = new CactusSupplierObserver(order);
        FlowerSupplierObserver flowerSupplier = new FlowerSupplierObserver(order);

        order.attach(cactusSupplier);
        order.attach(flowerSupplier);

        // create Bouquet, that will contains flowers and cactus
        Item bouquet = new Bouquet();

        // create FlowerSpec for Tulips
        IFlowerSpecBuilder fsBuilder = new FlowerSpecBuilder();

        fsBuilder.setStemLength(20)
                .setColor(FlowerColor.BLUE)
                .setType(PlantsTypes.FLOWER_TULIP)
                .setLiveDurationsHours(72)
                .setName("Tulip1")
                .setBirthDay(new Date())
                .setPrice(10);

        // create Tulips, that contains FlowerSpec
        IPlant tulips = PlantFactory.produce(fsBuilder.getSpec());

        fsBuilder = new ArtificialFlowerBuilder();
        fsBuilder.setStemLength(20)
                .setColor(FlowerColor.BLUE)
                .setType(PlantsTypes.FLOWER_ARTIFICIAL_UNCPECIFIED)
                .setLiveDurationsHours(72)
                .setName("ArtificialTulip1")
                .setBirthDay(new Date())
                .setPrice(20);
        IPlant artificialTulip = PlantFactory.produce(fsBuilder.getSpec());

        // create FlowerSpec for Rose, using Builder
        fsBuilder = new FlowerSpecBuilder();
        fsBuilder.setColor(FlowerColor.YELLOW)
                .setStemLength(30)
                .setType(PlantsTypes.FLOWER_ROSE)
                .setLiveDurationsHours(72)
                .setName("Rose1")
                .setBirthDay(new Date())
                .setPrice(15);

        // create Rose, that contains FlowerSpec
        IPlant rose = PlantFactory.produce(fsBuilder.getSpec());

        // create CactusSpec for Cactus, using Builder
        CactusSpecBuilder csBuilder = new CactusSpecBuilder();
        csBuilder.setShape(CactusShape.SQUARE_ROUND)
                .setNeedlesLength(4)
                .setType(PlantsTypes.CACTUS_UNCPECIFIED)
                .setLiveDurationsHours(500000)
                .setName("Cactus1")
                .setBirthDay(new Date())
                .setPrice(5);

        // create Cactus, that contains CactusSpec
        IPlant cactus = PlantFactory.produce(csBuilder.getSpec());

        // add plants to bouquet
        bouquet.addPlant(tulips);
        bouquet.addPlant(rose);
        bouquet.addPlant(cactus);
        bouquet.addPlant(artificialTulip);

        // print total price of bouquet
        System.out.println("Bouquet price: " + bouquet.price());

        // decorate bouquet with three decorators
        bouquet = new BasketDecorator(new PaperDecorator(new RibbonDecorator(bouquet)));

        // print total price of bouquet, including price of basket, paper and ribbon
        System.out.println("Bouquet price, including decorators: " + bouquet.price());

        order.addItem(bouquet);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());

        // process order and print report
        System.out.println(order.processOrder());

    }



    public Bouquet generateBouquet(int bouquetSize) {
        Bouquet myBouquet = new Bouquet();
        Random r = new Random();
        for (int i = 0; i < bouquetSize; i++) {
            myBouquet.addPlant(plantsArray.get(r.nextInt(plantsArray.size())));
        }
        return myBouquet;
    }
}
