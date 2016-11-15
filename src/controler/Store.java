package controler;

import enums.FlowerColor;
import item.Bouquet;
import model.flower.Flower;
import model.flower.Lilies;
import model.flower.Rose;
import model.flower.Tulips;
import model.plant.Plant;
import model.spec.FlowerSpec;
import model.spec.Spec;

import java.util.Date;
import java.util.Random;

/**
 * Created by Dell on 04.10.2016.
 */
public class Store {
    private Plant[] plantsArray;

    public static void main(String[] args) {

        Store store = new Store();
        store.generateFlowerSet(10);
        Bouquet myBouquet = store.generateBouquet(6);

        System.out.println("item.Bouquet structure:");
        System.out.println(myBouquet.getListOfPlants());
        System.out.println("item.Bouquet price: " + myBouquet.getPrice()+System.getProperty("line.separator"));

        myBouquet.sortByLevelOfFreshness();
        System.out.println("Sorted bouquet:");
        System.out.println(myBouquet.getListOfPlants());

//        System.out.println("Flowers in length range:");
//        System.out.println(item.Bouquet.getListOfFlowers(myBouquet.getFlowersByLength(20, 25)));

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
                    spec.setType("model.flower.Rose");
                    spec.setName(spec.getType() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.RED);
                    p = new Rose((FlowerSpec) spec);
                    break;
                case 1:
                    spec.setType("model.flower.Tulips");
                    spec.setName(spec.getType() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    p = new Tulips((FlowerSpec)spec);
                    break;
                case 2:
                    spec.setType("model.flower.Lilies");
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
