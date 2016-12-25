package model.builder;

import enums.CactusShape;
import interfaces.builder.ICactusSpecBuilder;
import model.spec.CactusSpec;
import model.spec.Spec;

import java.util.Date;

/**
 * Created by Dell on 20.12.2016.
 */
public class CactusSpecBuilder extends AbstractPlantBuilder implements ICactusSpecBuilder{


    public CactusSpecBuilder() {
        super(new CactusSpec());
    }


    public ICactusSpecBuilder setShape(CactusShape shape) {
        ((CactusSpec)anySpec).setShape(shape);
        return this;
    }

    public ICactusSpecBuilder setNeedlesLength(int needlesLength) {
        ((CactusSpec)anySpec).setNeedlesLength(needlesLength);
        return this;
    }


}
