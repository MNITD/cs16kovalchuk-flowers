package model.utilities;

import java.math.BigDecimal;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public abstract class PriceCalculator {
    public static BigDecimal calculatePrice(int cost, float fresh, double coef, int length) {
        BigDecimal price = new BigDecimal(cost);
        BigDecimal freshnessLevel = new BigDecimal(fresh / 100);
        BigDecimal coefficient = new BigDecimal(coef);
        BigDecimal needlessLength = new BigDecimal(length);
        BigDecimal arg1 = price.multiply(freshnessLevel);
        BigDecimal arg2 = coefficient.multiply(needlessLength);
        return arg1.add(arg2);
    }
}
