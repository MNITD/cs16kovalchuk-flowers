package interfaces.plants;

import enums.CactusShape;
import model.spec.CactusSpec;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public interface ICactus extends IPlant {
    public int getNeedlesLength();
    public CactusShape getShape();
}
