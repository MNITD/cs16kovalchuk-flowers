package model.spec;

import enums.FlowerColor;

/**
 * Created by Dell on 23.10.2016.
 */
public class FlowerSpec extends Spec {

    private int stemLength;
    private FlowerColor color;

    public FlowerSpec() {
        //super();
    }

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
