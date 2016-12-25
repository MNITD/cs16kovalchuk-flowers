package model.spec;

import enums.FlowerColor;
import enums.PlantsTypes;
import interfaces.Specs.IFlowerSpec;

import java.util.Date;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public class ArtificialFlowerSpec extends Spec implements IFlowerSpec {
    private String name;
    private int price;
    private PlantsTypes type;
    private int stemLength;
    private FlowerColor color;

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
        return 0;
    }

    public void setLiveDurationsHours(int liveDurationsHours) {
    }

    public Date getBirthDay() {
        return new Date();
    }

    public void setBirthDay(Date birthDay) {
    }

    public PlantsTypes getType() {
        return type;
    }

    public void setType(PlantsTypes type) {
        this.type = type;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

}
