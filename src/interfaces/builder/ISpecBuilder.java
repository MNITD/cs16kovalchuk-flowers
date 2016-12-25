package interfaces.builder;

import enums.PlantsTypes;
import model.spec.Spec;

import java.util.Date;

/**
 * Created by Dell on 20.12.2016.
 */
public interface ISpecBuilder {
    ISpecBuilder setType(PlantsTypes type);
    ISpecBuilder setLiveDurationsHours(int durationsHours);
    ISpecBuilder setName(String name);
    ISpecBuilder setBirthDay(Date birthDay);
    ISpecBuilder setPrice(int price);
    Spec getSpec();
}
