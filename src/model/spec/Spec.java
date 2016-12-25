package model.spec;

import enums.PlantsTypes;
import interfaces.Specs.ISpec;

/**
 * Created by Dell on 25.10.2016.
 * private String name;
 * private int price;
 * private int liveDurationsHours;
 * private Date birthDay;
 * private String type;
 */
public abstract class Spec implements ISpec {
    private String name;
    private int price;
    private PlantsTypes type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PlantsTypes getType() {
        return type;
    }

    public void setType(PlantsTypes type) {
        this.type = type;
    }
}
