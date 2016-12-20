package model.delivery;

import interfaces.IDelivery;
import interfaces.Item;

import java.util.LinkedList;

/**
 * Created by Dell on 08.11.2016.
 */
public class DHLDeliveryStrategy implements IDelivery {

    @Override
    public void delivery(LinkedList<Item> items) {

    }

    @Override
    public String toString() {
        return "DHLDeliveryStrategy";
    }
}
