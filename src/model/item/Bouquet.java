package model.item;

import interfaces.Item;
import interfaces.plants.IPlant;
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
    private ArrayList<IPlant> bouquet;
    private BigDecimal price;

    public Bouquet() {
        bouquet = new ArrayList<IPlant>();
        price = new BigDecimal(0);
    }

    @Override
    public void addPlant(IPlant plant) {
        bouquet.add(plant);
        price = price.add(plant.getCost());
    }

    @Override
    public void removePlant(IPlant plant) {
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
        for (IPlant p : bouquet) {
            s += "name: " + p.getName() + ", price: " + p.getCost().setScale(2, ROUND_CEILING)
                    + ", freshness: " + p.getLevelOfFreshness()
                    + System.getProperty("line.separator");
        }
        return s;
    }


    @Override
    public void sortByLevelOfFreshness() {
        Collections.sort(bouquet, new Comparator<IPlant>() {
            @Override
            public int compare(IPlant plant1, IPlant plant2) {
                return Float.compare(plant1.getLevelOfFreshness(), plant2.getLevelOfFreshness());
            }
        });
    }

    @Override
    public ArrayList<IPlant> search(Spec spec) {
        ArrayList<IPlant> temp = new ArrayList<>();
        for (IPlant p : bouquet) {
            if (p.getCost().intValue() != spec.getPrice()) {
                continue;
            }
            if (!p.getType().equals(spec.getType())) {
                continue;
            }
            if (!p.getName().equals(spec.getName())) {
                continue;
            }
            temp.add(p);
        }
        return temp;
    }

    @Override
    public BigDecimal price() {
        return price.setScale(2, ROUND_CEILING);
    }
}