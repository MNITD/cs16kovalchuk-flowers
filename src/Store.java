import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dell on 04.10.2016.
 */
public class Store {
    private Flower[] flowersArray;

    public static void main(String[] args) {

        Store store = new Store();
        store.generateFlowerSet(10);
        Bouquet myBouquet = store.generateBouquet(6);

        System.out.println("Bouquet structure:");
        System.out.println(myBouquet.getListOfFlowers());
        System.out.println("Bouquet price: " + myBouquet.getPrice()+System.getProperty("line.separator"));

        myBouquet.sortByFreshness();
        System.out.println("Sorted bouquet:");
        System.out.println(myBouquet.getListOfFlowers());

        System.out.println("Flowers in length range:");
        System.out.println(Bouquet.getListOfFlowers(myBouquet.getFlowersByLength(20, 25)));

    }

    public Bouquet generateBouquet(int bouquetSize) {
        Bouquet myBouquet = new Bouquet();
        Random r = new Random();
        for (int i = 0; i < bouquetSize; i++) {
            myBouquet.addFlower(flowersArray[r.nextInt(flowersArray.length)]);
        }
        return myBouquet;
    }

    public void generateFlowerSet(int numberOfFlowers) {
        Random r = new Random();
        Date date = new Date();

        flowersArray = new Flower[numberOfFlowers];
        for (int i = 0; i < numberOfFlowers; i++) {
            Flower f;
            FlowerSpec flowerSpec = new FlowerSpec();

            //f.setPrice(r.nextInt(10) + 2);//from 2 to 12 U.S. dollars
            flowerSpec.setLiveDurationsHours(r.nextInt(48) + 10);//from 10 to 58 hours
            flowerSpec.setFreshness(r.nextInt(4)+6);
            flowerSpec.setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
            flowerSpec.setBirthDay(date); //birthDay to calculate freshness in % by date
            flowerSpec.setColor(Flower.FlowerColor.RED);

            switch (r.nextInt(3)){
                case 0:
                    flowerSpec.setType("Rose");
                    flowerSpec.setName(flowerSpec.getType() + i);
                    f = new Rose(flowerSpec);
                    break;
                case 1:
                    flowerSpec.setType("Tulips");
                    flowerSpec.setName(flowerSpec.getType() + i);
                    f = new Tulips(flowerSpec);
                    break;
                case 2:
                    flowerSpec.setType("Lilies");
                    flowerSpec.setName(flowerSpec.getType() + i);
                    f = new Lilies(flowerSpec);
                    break;
                default:
                    flowerSpec.setType("Undefined");
                    flowerSpec.setName(flowerSpec.getType() + i);
                    f = new Flower(flowerSpec);
                    break;
            }


            flowersArray[i] = f;
        }

    }
}
