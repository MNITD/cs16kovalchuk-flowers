package model.spec;

import enums.CactusShape;

/**
 * Created by Dell on 25.10.2016.
 */
public class CactusSpec extends Spec {

    private CactusShape shape;
    private int needlesLength;

    public CactusSpec(){
        //super();
    }

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
