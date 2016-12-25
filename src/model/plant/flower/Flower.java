package model.plant.flower;

import enums.FlowerColor;
import interfaces.plants.IFlower;
import model.plant.Plant;
import model.spec.FlowerSpec;
import model.utilities.PriceCalculator;

import java.math.BigDecimal;

/**
 * Created by Dell on 04.10.2016.
 */
public class Flower extends Plant implements IFlower {

    public Flower(FlowerSpec flowerSpec) {
        super(flowerSpec);
    }

    public FlowerColor getColor() {
        return ((FlowerSpec) super.plantSpec).getColor();
    }

    public int getStemLength() {
        return ((FlowerSpec) super.plantSpec).getStemLength();
    }

    @Override
    public BigDecimal getCost() {
        return PriceCalculator.calculatePrice(getPrice(), getLevelOfFreshness(), 0.3, getStemLength());
    }

}
