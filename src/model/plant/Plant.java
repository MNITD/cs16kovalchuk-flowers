package model.plant;

import interfaces.plants.IPlant;
import model.spec.Spec;
import model.utilities.PriceCalculator;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Dell on 01.11.2016.
 */
public abstract class Plant implements IPlant{

    protected Spec plantSpec;

    protected Plant(Spec spec){
        plantSpec = spec;
    }

    public String getType(){
        return plantSpec.getType().toString();
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

}
