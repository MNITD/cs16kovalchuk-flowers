package model.spec;

import enums.FlowerColor;
import interfaces.Specs.IFlowerSpec;

/**
 * Created by Dell on 23.10.2016.
 */
public class FlowerSpec extends PlantSpec implements IFlowerSpec {

    private int stemLength;
    private FlowerColor color;

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }
}
