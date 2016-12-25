package model.spec;

import enums.CactusShape;
import interfaces.Specs.ICactusSpec;

/**
 * Created by Dell on 25.10.2016.
 */
public class CactusSpec extends PlantSpec implements ICactusSpec{

    private CactusShape shape;
    private int needlesLength;

    public int getNeedlesLength() {
        return needlesLength;
    }

    public void setNeedlesLength(int needlesLength) {
        this.needlesLength = needlesLength;
    }

    public CactusShape getShape() {
        return shape;
    }

    public void setShape(CactusShape shape) {
        this.shape = shape;
    }


}
