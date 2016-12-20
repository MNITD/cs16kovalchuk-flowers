package model.suppliers;

import interfaces.IObservable;
import interfaces.IObserver;
import model.plant.flower.Flower;

import java.util.ArrayList;

/**
 * Created by Dell on 24.11.2016.
 */
public class FlowerSupplierObserver implements IObserver {

    private IObservable observable;
    private ArrayList<Flower> orderedFlowers;

    public FlowerSupplierObserver(IObservable observable){
        setObservable(observable);
        orderedFlowers = new ArrayList<>();
    }

    @Override
    public void setObservable(IObservable observable) {
        observable.attach(this);
        this.observable  = observable;
    }

    @Override
    public void update() {
//        orderedFlowers = observable.getPlantsList("Flower");
    }
}
