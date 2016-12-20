package interfaces.builder;

import enums.CactusShape;

/**
 * Created by Dell on 20.12.2016.
 */
public interface ICactusSpecBuilder extends ISpecBuilder {
    ICactusSpecBuilder setShape(CactusShape shape);
    ICactusSpecBuilder setNeedlesLength(int needlesLength);
}
