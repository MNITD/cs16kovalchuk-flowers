package interfaces.Specs;

import enums.CactusShape;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public interface ICactusSpec extends ISpec {

    int getNeedlesLength();

    void setNeedlesLength(int needlesLength);

    CactusShape getShape();

    void setShape(CactusShape shape);
}
