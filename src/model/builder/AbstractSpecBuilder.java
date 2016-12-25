package model.builder;

import enums.PlantsTypes;
import interfaces.builder.ISpecBuilder;
import model.spec.Spec;

import java.util.Date;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public abstract class AbstractSpecBuilder implements ISpecBuilder {
    protected Spec anySpec;

    public AbstractSpecBuilder(Spec someSpec){
        this.anySpec = someSpec;
    }

    @Override
    public ISpecBuilder setType(PlantsTypes type) {
        anySpec.setType(type);
        return this;
    }

    @Override
    public ISpecBuilder setLiveDurationsHours(int durationsHours) {
        anySpec.setLiveDurationsHours(durationsHours);
        return this;
    }

    @Override
    public ISpecBuilder setName(String name) {
        anySpec.setName(name);
        return this;
    }

    @Override
    public ISpecBuilder setBirthDay(Date birthDay) {
        anySpec.setBirthDay(birthDay);
        return this;
    }

    @Override
    public ISpecBuilder setPrice(int price) {
        anySpec.setPrice(price);
        return this;
    }

    @Override
    public Spec getSpec() {
        return anySpec;
    }

}
