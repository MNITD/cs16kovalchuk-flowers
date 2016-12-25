package model.item.decorators;

import interfaces.Item;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_CEILING;

/**
 * Created by Dell on 08.11.2016.
 */
public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return "BasketDecorator";
    }

    @Override
    public BigDecimal price() {
        BigDecimal coefficient = new BigDecimal(1.25);
        BigDecimal price = item.price().multiply(coefficient);
        return price.setScale(2, ROUND_CEILING);
    }

}
