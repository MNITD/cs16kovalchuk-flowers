package model.spec;

import java.util.Date;

/**
 * Created by Dell on 25.10.2016.
 */
public abstract class Spec {
    private String name;
    private int price;
    private int liveDurationsHours;
    private Date birthDay;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
