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
        BigDecimal price = new BigDecimal(getPrice());
        BigDecimal freshnessLevel = new BigDecimal(getLevelOfFreshness());
        BigDecimal coefficient = new BigDecimal(0.4);
        BigDecimal needlessLength = new BigDecimal(getStemLength());
        return  price.multiply(freshnessLevel).add(coefficient.multiply(needlessLength));
    }

}
