package controler;

import enums.CactusShape;
import enums.FlowerColor;
import interfaces.Item;
import model.Order;
import model.builder.CactusSpecBuilder;
import model.builder.FlowerSpecBuilder;
import model.delivery.DHLDeliveryStrategy;
import model.item.decorators.BasketDecorator;
import model.item.Bouquet;
import model.item.decorators.PaperDecorator;
import model.item.decorators.RibbonDecorator;
import model.payment.PayPalPaymentStrategy;
import model.plant.cactus.Cactus;
import model.plant.flower.Flower;
import model.plant.flower.Lilies;
import model.plant.flower.Rose;
import model.plant.flower.Tulips;
import model.plant.Plant;
import model.spec.CactusSpec;
import model.spec.FlowerSpec;
import model.spec.Spec;
import model.suppliers.CactusSupplierObserver;
import model.suppliers.FlowerSupplierObserver;

import java.util.Date;
import java.util.Random;

/**
 * Created by Dell on 04.10.2016.
 */
public class Store {
    private Plant[] plantsArray;

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
        FlowerSpecBuilder fsBuilder = new FlowerSpecBuilder();

        fsBuilder.setStemLength(20)
                  .setType("Tulips")
                  .setLiveDurationsHours(72)
                  .setName("Tulip1")
                  .setBirthDay(new Date())
                  .setPrice(10);

        // create Tulips, that contains FlowerSpec
        Plant tulips = store.plantFactory(fsBuilder.getResult());

        // create FlowerSpec for Rose, using Builder
        fsBuilder = new FlowerSpecBuilder();
        fsBuilder.setColor(FlowerColor.YELLOW)
                .setStemLength(30)
                .setType("Rose")
                .setLiveDurationsHours(72)
                .setName("Rose1")
                .setBirthDay(new Date())
                .setPrice(15);

        // create Rose, that contains FlowerSpec
        Plant rose = store.plantFactory(fsBuilder.getResult());

        // create CactusSpec for Cactus, using Builder
        CactusSpecBuilder csBuilder = new CactusSpecBuilder();
        csBuilder.setShape(CactusShape.SQUARE_ROUND)
                .setNeedlesLength(4)
                .setType("Cactus")
                .setLiveDurationsHours(500000)
                .setName("Cactus1")
                .setBirthDay(new Date())
                .setPrice(5);

        // create Cactus, that contains CactusSpec
        Plant cactus = store.plantFactory(csBuilder.getResult());

        // add plants to bouquet
        bouquet.addPlant(tulips);
        bouquet.addPlant(rose);
        bouquet.addPlant(cactus);

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


//        store.generateFlowerSet(10);
//        Bouquet myBouquet = store.generateBouquet(6);

//        System.out.println("model.item.Bouquet structure:");
//        System.out.println(myBouquet.getListOfPlants());
//        System.out.println("model.item.Bouquet price: " + myBouquet.price()+System.getProperty("line.separator"));

//        myBouquet.sortByLevelOfFreshness();
//        System.out.println("Sorted bouquet:");
//        System.out.println(myBouquet.getListOfPlants());

//        System.out.println("Flowers in length range:");
//        System.out.println(model.item.Bouquet.getListOfFlowers(myBouquet.getFlowersByLength(20, 25)));

    }

    public Plant plantFactory(Spec spec){
        switch (spec.getType()){
            case "Tulips":
                return new Tulips((FlowerSpec) spec);

            case "Lilies":
                return new Lilies((FlowerSpec) spec);

            case "Rose":
                return new Rose((FlowerSpec) spec);

            case "Cactus":
                return new Cactus((CactusSpec) spec);

           default:
               return null;
        }
    }

    public Bouquet generateBouquet(int bouquetSize) {
        Bouquet myBouquet = new Bouquet();
        Random r = new Random();
        for (int i = 0; i < bouquetSize; i++) {
            myBouquet.addPlant(plantsArray[r.nextInt(plantsArray.length)]);
        }
        return myBouquet;
    }

    public void generateFlowerSet(int numberOfFlowers) {
        Random r = new Random();
        Date date = new Date();

        plantsArray = new Flower[numberOfFlowers];
        for (int i = 0; i < numberOfFlowers; i++) {
            Plant p;
            Spec spec = new FlowerSpec();

            //f.setPrice(r.nextInt(10) + 2);//from 2 to 12 U.S. dollars
            spec.setLiveDurationsHours(r.nextInt(48) + 10);//from 10 to 58 hours
            spec.setBirthDay(date); //birthDay to calculate freshness in % by date


            switch (r.nextInt(3)){
                case 0:
                    spec.setType("model.plant.flower.Rose");
                    spec.setName(spec.getType() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.RED);
                    p = new Rose((FlowerSpec) spec);
                    break;
                case 1:
                    spec.setType("model.plant.flower.Tulips");
                    spec.setName(spec.getType() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    p = new Tulips((FlowerSpec)spec);
                    break;
                case 2:
                    spec.setType("model.plant.flower.Lilies");
                    spec.setName(spec.getType() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.RED);
                    p = new Lilies((FlowerSpec)spec);
                    break;
                default:
                    spec.setType("Undefined");
                    spec.setName(spec.getType() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.RED);
                    p = new Flower((FlowerSpec)spec);
                    break;
            }


            plantsArray[i] = p;
        }

    }
}
