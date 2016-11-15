package model.payment;

import interfaces.IPayment;

/**
 * Created by Dell on 08.11.2016.
 */
public class CreditCartPaymentStrategy implements IPayment {
    @Override
    public double pay() {
        return 0;
    }
}
