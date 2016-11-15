package model.plant;

/**
 * Created by Dell on 01.11.2016.
 */
public abstract class Plant {

    public abstract String getType();
    public abstract String getName();
    public abstract int getPrice();
    public abstract double calculatePrice();
    public abstract float getLevelOfFreshness();

}
