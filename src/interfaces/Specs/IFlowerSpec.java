package interfaces.Specs;

import enums.FlowerColor;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public interface IFlowerSpec extends ISpec {

    int getStemLength();

    void setStemLength(int stemLength);

    FlowerColor getColor();

    void setColor(FlowerColor color);
}
