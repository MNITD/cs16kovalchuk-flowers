package model.item.decorators;

import interfaces.Item;
import interfaces.plants.IPlant;
import model.spec.Spec;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Dell on 08.11.2016.
 */
abstract class ItemDecorator implements Item {
    protected Item item;
//    ItemDecorator(Item item){
//        this.item = item;
//    }

    public abstract String getDescription();

    @Override
    public BigDecimal price() {
        return item.price();
    }

    @Override
    public void addPlant(IPlant plant) {
        item.addPlant(plant);
    }

    @Override
    public void removePlant(IPlant plant) {
        item.removePlant(plant);
    }

    @Override
    public int getSize() {
        return item.getSize();
    }

    @Override
    public String getListOfPlants() {
        return item.getListOfPlants();
    }

    @Override
    public void sortByLevelOfFreshness() {
        item.sortByLevelOfFreshness();
    }

    @Override
    public ArrayList<IPlant> search(Spec spec) {
        return item.search(spec);
    }
}
