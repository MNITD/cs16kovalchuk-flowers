package model.flower;

import enums.FlowerColor;
import model.plant.Plant;
import model.spec.FlowerSpec;

import java.util.Date;

/**
 * Created by Dell on 04.10.2016.
 */
public class Flower extends Plant {

    private FlowerSpec flowerSpec;

    public Flower(FlowerSpec flowerSpec) {
        this.flowerSpec = flowerSpec;
    }

    public FlowerColor getColor() {
        return flowerSpec.getColor();
    }

    @Override
    public String getType() {
        return flowerSpec.getType();
    }

    @Override
    public String getName() {
        return flowerSpec.getName();
    }

    @Override
    public int getPrice() {
        return flowerSpec.getPrice();
    }

    public int getStemLength() {
        return flowerSpec.getStemLength();
    }

    @Override
    public float getLevelOfFreshness() {
        Date date = new Date();
        int msAfterBirth = (int) (date.getTime() - flowerSpec.getBirthDay().getTime());
        // to get days, should divide on 1000 * 60 * 60 * 24
        return 100 - (msAfterBirth / (flowerSpec.getLiveDurationsHours() * 60 * 60 * 10)); // return freshness in %
    }

    @Override
    public double calculatePrice() {
        double actualPrice = flowerSpec.getPrice() * getLevelOfFreshness() + 0.4 * flowerSpec.getStemLength();
        return actualPrice;
    }

}
