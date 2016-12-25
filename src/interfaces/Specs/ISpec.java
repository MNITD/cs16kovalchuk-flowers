package interfaces.Specs;

import enums.PlantsTypes;

import java.util.Date;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public interface ISpec {

    String getName();
    void setName(String name);
    int getPrice();
    void setPrice(int price);
    int getLiveDurationsHours();
    void setLiveDurationsHours(int liveDurationsHours);
    Date getBirthDay();
    void setBirthDay(Date birthDay);
    PlantsTypes getType();
    void setType(PlantsTypes type);
}
