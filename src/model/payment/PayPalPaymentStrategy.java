package model.payment;

import interfaces.strategy.IPayment;

/**
 * Created by Dell on 08.11.2016.
 */
public class PayPalPaymentStrategy implements IPayment {

    @Override
    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return "PayPalPaymentStrategy";
    }
}
