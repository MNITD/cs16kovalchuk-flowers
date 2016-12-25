package model.spec;

import enums.PlantsTypes;

import java.util.Date;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public abstract class PlantSpec extends Spec {
    private String name;
    private int price;
    private int liveDurationsHours;
    private Date birthDay;
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

    public int getLiveDurationsHours() {
        return liveDurationsHours;
    }

    public void setLiveDurationsHours(int liveDurationsHours) {
        this.liveDurationsHours = liveDurationsHours;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public PlantsTypes getType() {
        return type;
    }

    public void setType(PlantsTypes type) {
        this.type = type;
    }
}
