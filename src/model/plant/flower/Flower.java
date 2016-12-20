package model.plant.flower;

import enums.FlowerColor;
import model.plant.Plant;
import model.spec.FlowerSpec;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Dell on 04.10.2016.
 */
public class Flower extends Plant {

    public Flower(FlowerSpec flowerSpec) {
        super(flowerSpec);
    }

    public FlowerColor getColor() {
        return ((FlowerSpec)super.plantSpec).getColor();
    }

    public int getStemLength() {
        return ((FlowerSpec)super.plantSpec).getStemLength();
    }

    @Override
    public BigDecimal calculatePrice() {
        return calculatePrice(getPrice(), getLevelOfFreshness(), 0.3, getStemLength());
    }

}
