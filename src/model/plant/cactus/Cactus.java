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
        return calculatePrice(getPrice(), getLevelOfFreshness(), 0.2, getNeedlesLength());
    }
}
