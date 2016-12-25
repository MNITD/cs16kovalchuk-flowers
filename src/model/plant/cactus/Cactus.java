package model.plant.cactus;

import enums.CactusShape;
import interfaces.plants.ICactus;
import model.plant.Plant;
import model.spec.CactusSpec;
import model.utilities.PriceCalculator;

import java.math.BigDecimal;

/**
 * Created by Dell on 25.10.2016.
 */
public class Cactus extends Plant implements ICactus {

    public Cactus(CactusSpec cactusSpec) {
        super(cactusSpec);
    }

    public int getNeedlesLength() {
        return ((CactusSpec) super.plantSpec).getNeedlesLength();
    }

    public CactusShape getShape() {
        return ((CactusSpec) super.plantSpec).getShape();
    }

    @Override
    public BigDecimal getCost() {
        return PriceCalculator.calculatePrice(getPrice(), getLevelOfFreshness(), 0.2, getNeedlesLength());
    }
}
