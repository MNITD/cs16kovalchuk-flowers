package model;

import interfaces.IDelivery;
import interfaces.IObservable;
import interfaces.IObserver;
import interfaces.IPayment;
import interfaces.Item;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Dell on 24.11.2016.
 */
public class Order implements IObservable {
    private ArrayList<IObserver>listeners;
    private ArrayList<Item>items;
    private IDelivery delivery;
    private IPayment payment;

    public  Order(){
        listeners = new ArrayList<>();
        items = new ArrayList<>();
    }

    // add listener of order
    @Override
    public void attach(IObserver observer) {
        listeners.add(observer);
    }

    // remove listener of order
    @Override
    public void unpin(IObserver observer) {
        listeners.remove(observer);
    }

    // notify all listeners
    @Override
    public void notifyAllObservers() {
        for(IObserver observer : listeners){
            observer.update();
        }
    }

    public void setPaymentStrategy(IPayment payment){
        this.payment = payment;
    }

    public void setDeliveryStrategy(IDelivery delivery){
        this.delivery = delivery;
    }

    public BigDecimal calculateTotalPrice(){
        BigDecimal totalPrice = new BigDecimal(0);
        for(Item item : items){
            totalPrice = totalPrice.add(item.price());
        }
        return totalPrice;
    }

    // return report(statistics) of order
    private String getOrderReport(){
        String result =  "Number of items in order: " + items.size() + System.getProperty("line.separator")+
                "List of items: " +   System.getProperty("line.separator");
        for(Item i : items){
            result += i.getListOfPlants();
        }
        result += "Total price: "+ calculateTotalPrice() + System.getProperty("line.separator")+
                "Delivery strategy: " + delivery.toString() +  System.getProperty("line.separator")+
                "Payment strategy: " + payment.toString();
        return result;
    }

    // process order, notify listeners, return report
    public String processOrder(){
        notifyAllObservers();

        return getOrderReport();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
