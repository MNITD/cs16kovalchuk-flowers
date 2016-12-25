package model.builder;

import enums.FlowerColor;
import interfaces.builder.IFlowerSpecBuilder;
import model.spec.FlowerSpec;

import java.util.Date;

/**
 * Created by Dell on 20.12.2016.
 */
public class FlowerSpecBuilder extends AbstractPlantBuilder implements IFlowerSpecBuilder{

    public FlowerSpecBuilder() {
        super(new FlowerSpec());
    }

    public IFlowerSpecBuilder setColor(FlowerColor flowerColor) {
        ((FlowerSpec)anySpec).setColor(flowerColor);
        return this;
    }

    public IFlowerSpecBuilder setStemLength(int stemLength) {
        ((FlowerSpec)anySpec).setStemLength(stemLength);
        return this;
    }

}
