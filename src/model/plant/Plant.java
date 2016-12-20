package model.plant;

import model.spec.CactusSpec;
import model.spec.Spec;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Dell on 01.11.2016.
 */
public abstract class Plant {

    protected Spec plantSpec;

    protected Plant(Spec spec){
        plantSpec = spec;
    }

    public String getType(){
        return plantSpec.getType();
    }
    public String getName(){
        return  plantSpec.getName();
    }
    public int getPrice(){
        return  plantSpec.getPrice();
    }
    public float getLevelOfFreshness(){
        Date date = new Date();
        int msAfterBirth = (int) (date.getTime() -  plantSpec.getBirthDay().getTime());
        // to get days, should divide on 1000 * 60 * 60 * 24
        return 100 - (msAfterBirth / (plantSpec.getLiveDurationsHours() * 60 * 60 * 10)); // return freshness in %
    }

    protected BigDecimal calculatePrice(int cost, float fresh, double coef, int length){
        BigDecimal price = new BigDecimal(cost);
        BigDecimal freshnessLevel = new BigDecimal(fresh/100);
        BigDecimal coefficient = new BigDecimal(coef);
        BigDecimal needlessLength = new BigDecimal(length);
        BigDecimal arg1 = price.multiply(freshnessLevel);
        BigDecimal arg2 = coefficient.multiply(needlessLength);
        return arg1.add(arg2);
    }
    public abstract BigDecimal calculatePrice();

}
