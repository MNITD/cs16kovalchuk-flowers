package model.builder;

import enums.CactusShape;
import interfaces.builder.ICactusSpecBuilder;
import interfaces.builder.ISpecBuilder;
import model.spec.CactusSpec;
import model.spec.Spec;

import java.util.Date;

/**
 * Created by Dell on 20.12.2016.
 */
public class CactusSpecBuilder implements ICactusSpecBuilder {
    private CactusSpec cactusSpec;

    public CactusSpecBuilder(){
        cactusSpec = new CactusSpec();
    }

    @Override
    public ISpecBuilder setType(String type) {
        cactusSpec.setType(type);
        return this;
    }

    @Override
    public ISpecBuilder setLiveDurationsHours(int durationsHours) {
        cactusSpec.setLiveDurationsHours(durationsHours);
        return this;
    }

    @Override
    public ISpecBuilder setName(String name) {
        cactusSpec.setName(name);
        return this;
    }

    @Override
    public ISpecBuilder setBirthDay(Date birthDay) {
        cactusSpec.setBirthDay(birthDay);
        return this;
    }

    @Override
    public ISpecBuilder setPrice(int price) {
        cactusSpec.setPrice(price);
        return this;
    }

    @Override
    public ICactusSpecBuilder setShape(CactusShape shape) {
        cactusSpec.setShape(shape);
        return this;
    }

    @Override
    public ICactusSpecBuilder setNeedlesLength(int needlesLength) {
        cactusSpec.setNeedlesLength(needlesLength);
        return this;
    }

    @Override
    public Spec getResult() {
        return cactusSpec;
    }


}
