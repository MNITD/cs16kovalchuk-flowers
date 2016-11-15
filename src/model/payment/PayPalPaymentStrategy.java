package model.payment;

import interfaces.IPayment;

/**
 * Created by Dell on 08.11.2016.
 */
public class PayPalPaymentStrategy implements IPayment {
    @Override
    public double pay() {
        return 0;
    }
}
