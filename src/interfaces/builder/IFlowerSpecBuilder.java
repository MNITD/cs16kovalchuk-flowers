package interfaces.builder;

import enums.FlowerColor;

/**
 * Created by Dell on 20.12.2016.
 */
public interface IFlowerSpecBuilder extends ISpecBuilder {
    IFlowerSpecBuilder setColor(FlowerColor flowerColor);

    IFlowerSpecBuilder setStemLength(int stemLength);
}
