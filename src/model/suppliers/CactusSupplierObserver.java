package model.suppliers;

import interfaces.observer.IObservable;
import interfaces.observer.IObserver;
import model.plant.cactus.Cactus;

import java.util.ArrayList;

/**
 * Created by Dell on 24.11.2016.
 */
public class CactusSupplierObserver implements IObserver {

    private IObservable observable;
    private ArrayList<Cactus> orderedCactuses;

    public CactusSupplierObserver(IObservable observable) {
        setObservable(observable);
        orderedCactuses = new ArrayList<>();
    }

    @Override
    public void setObservable(IObservable observable) {
        observable.attach(this);
        this.observable = observable;
    }

    @Override
    public void update() {
//        orderedCactuses = observable.getPlantsList("Cactus");
    }
}
