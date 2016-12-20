package model.builder;

import enums.FlowerColor;
import interfaces.builder.IFlowerSpecBuilder;
import interfaces.builder.ISpecBuilder;
import model.spec.FlowerSpec;
import model.spec.Spec;

import java.util.Date;

/**
 * Created by Dell on 20.12.2016.
 */
public class FlowerSpecBuilder implements IFlowerSpecBuilder {
    private FlowerSpec flowerSpec;

    public FlowerSpecBuilder() {
        this.flowerSpec = new FlowerSpec();
    }

    @Override
    public ISpecBuilder setType(String type) {
        flowerSpec.setType(type);
        return this;
    }

    @Override
    public ISpecBuilder setLiveDurationsHours(int durationsHours) {
        flowerSpec.setLiveDurationsHours(durationsHours);
        return this;
    }

    @Override
    public ISpecBuilder setName(String name) {
        flowerSpec.setName(name);
        return this;
    }

    @Override
    public ISpecBuilder setBirthDay(Date birthDay) {
        flowerSpec.setBirthDay(birthDay);
        return this;
    }

    @Override
    public ISpecBuilder setPrice(int price) {
        flowerSpec.setPrice(price);
        return this;
    }

    @Override
    public IFlowerSpecBuilder setColor(FlowerColor flowerColor) {
        flowerSpec.setColor(flowerColor);
        return this;
    }

    @Override
    public IFlowerSpecBuilder setStemLength(int stemLength) {
        flowerSpec.setStemLength(stemLength);
        return this;
    }

    @Override
    public Spec getResult() {
        return flowerSpec;
    }
}
