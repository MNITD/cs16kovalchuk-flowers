package model.builder;

import enums.FlowerColor;
import interfaces.builder.IFlowerSpecBuilder;
import model.spec.ArtificialFlowerSpec;
import model.spec.Spec;

import java.util.Date;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public class ArtificialFlowerBuilder extends AbstractSpecBuilder implements IFlowerSpecBuilder {

    public ArtificialFlowerBuilder() {
        super(new ArtificialFlowerSpec());
    }

    public IFlowerSpecBuilder setColor(FlowerColor flowerColor) {
        ((ArtificialFlowerSpec) anySpec).setColor(flowerColor);
        return this;
    }

    public IFlowerSpecBuilder setStemLength(int stemLength) {
        ((ArtificialFlowerSpec) anySpec).setStemLength(stemLength);
        return this;
    }

    @Override
    public IFlowerSpecBuilder setLiveDurationsHours(int durationsHours) {
        //class has no appropriate field
        return this;
    }


    @Override
    public IFlowerSpecBuilder setBirthDay(Date birthDay) {
        //class has no appropriate field
        return this;
    }


    @Override
    public Spec getSpec() {
        return (ArtificialFlowerSpec) anySpec;
    }

}
