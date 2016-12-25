package interfaces.plants;

import enums.FlowerColor;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public interface IFlower extends IPlant {
    FlowerColor getColor();

    int getStemLength();
}
