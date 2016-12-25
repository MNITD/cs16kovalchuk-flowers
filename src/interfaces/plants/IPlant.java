package interfaces.plants;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public interface IPlant {
    String getType();
    String getName();
    BigDecimal getCost();
    float getLevelOfFreshness();
}
