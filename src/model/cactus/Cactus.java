package model.cactus;

import model.plant.Plant;
import model.spec.CactusSpec;

import java.util.Date;

/**
 * Created by Dell on 25.10.2016.
 */
public class Cactus extends Plant {

    private CactusSpec cactusSpec;
    Cactus(CactusSpec cactusSpec){
        this.cactusSpec = cactusSpec;
    }

    public float getLevelOfFreshness() {
        Date date = new Date();
        int msAfterBirth = (int) (date.getTime() - cactusSpec.getBirthDay().getTime());
        // to get days, should divide on 1000 * 60 * 60 * 24
        return 100 - (msAfterBirth / (cactusSpec.getLiveDurationsHours() * 60 * 60 * 10)); // return freshness in %
    }

    @Override
    public String getType() {
        return cactusSpec.getType();
    }

    @Override
    public String getName() {
        return cactusSpec.getName();
    }

    @Override
    public int getPrice() {
        return cactusSpec.getPrice();
    }

    @Override
    public double calculatePrice(){
       double actualPrice =  cactusSpec.getPrice()*getLevelOfFreshness() + 0.5 * cactusSpec.getNeedlesLength();
        return  actualPrice;
    }
}
