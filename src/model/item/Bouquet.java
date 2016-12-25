package model.item;

import interfaces.Item;
import model.plant.Plant;
import model.spec.Spec;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.math.BigDecimal.ROUND_CEILING;

/**
 * Created by Dell on 04.10.2016.
 */
public class Bouquet implements Item {
    private ArrayList<Plant> bouquet;
    private BigDecimal price;

    public Bouquet() {
        bouquet = new ArrayList<Plant>();
        price = new BigDecimal(0);
    }

    @Override
    public void addPlant(Plant plant) {
        bouquet.add(plant);
        price = price.add(plant.getCost());
    }

    @Override
    public void removePlant(Plant plant) {
        bouquet.remove(plant);
        price = price.subtract(plant.getCost());
    }

    @Override
    public int getSize() {
        return bouquet.size();
    }

    @Override
    public String getListOfPlants() {
        String s = "";
        for (Plant p : bouquet) {
            s += "name: " + p.getName() + ", price: " + p.getPrice()
                    + ", freshness: " + p.getLevelOfFreshness()
                    + System.getProperty("line.separator");
        }
        return s;
    }

//    public static String getListOfFlowers(ArrayList<Plant> flowersList) {
//        String s = "";
//        for (Plant f : flowersList) {
//            s += "name: " + f.getName() + ", price: " + f.getPrice()
//                    + ", freshness: " + f.getLevelOfFreshness()
//                    + System.getProperty("line.separator");
//            ;
//        }
//        return s;
//    }

    @Override
    public void sortByLevelOfFreshness() {
        Collections.sort(bouquet, new Comparator<Plant>() {
            @Override
            public int compare(Plant plant1, Plant plant2) {
                return Float.compare(plant1.getLevelOfFreshness(), plant2.getLevelOfFreshness());
            }
        });
    }

    //    public ArrayList getFlowersByLength(int a, int b) {
//        ArrayList<Flower> flowersInRange = new ArrayList<Flower>();
//        for (Flower f : bouquet) {
//            if (f.getStemLength() >= a && f.getStemLength() <= b) {
//                flowersInRange.add(f);
//            }
//        }
//        return flowersInRange;
//    }
    @Override
    public Plant[] search(Spec spec) {
        ArrayList<Plant> temp = new ArrayList<>();
        int length = 0;
        for (Plant p : bouquet) {
            if (p.getPrice() != spec.getPrice()) {
                continue;
            }
            if (!p.getType().equals(spec.getType())) {
                continue;
            }
            if (!p.getName().equals(spec.getName())) {
                continue;
            }
            temp.add(p);
            length++;
        }
        Plant[] plants = new Plant[length];
        int i = 0;
        for (Plant p : temp) {
            plants[i] = p;
        }
        return plants;
    }

    @Override
    public BigDecimal price() {
        return price.setScale(2, ROUND_CEILING);
    }
}