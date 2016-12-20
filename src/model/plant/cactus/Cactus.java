package model.plant.cactus;

import enums.CactusShape;
import model.plant.Plant;
import model.spec.CactusSpec;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Dell on 25.10.2016.
 */
public class Cactus extends Plant {

    public Cactus(CactusSpec cactusSpec){
        super(cactusSpec);
    }

    public int getNeedlesLength() {
        return ((CactusSpec)super.plantSpec).getNeedlesLength();
    }

    public CactusShape getShape() {
        return ((CactusSpec)super.plantSpec).getShape();
    }

    @Override
    public BigDecimal calculatePrice(){
        BigDecimal price = new BigDecimal(getPrice());
        BigDecimal freshnessLevel = new BigDecimal(getLevelOfFreshness());
        BigDecimal coefficient = new BigDecimal(0.5);
        BigDecimal needlessLength = new BigDecimal(getNeedlesLength());
        return  price.multiply(freshnessLevel).add(coefficient.multiply(needlessLength));
    }
}
