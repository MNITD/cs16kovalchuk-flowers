package model.item;

import interfaces.Item;
import model.plant.Plant;
import model.spec.Spec;

import java.math.BigDecimal;

/**
 * Created by Dell on 08.11.2016.
 */
abstract class ItemDecorator implements Item {
    private Item item;
    ItemDecorator(Item item){
        this.item = item;
    }

    public abstract String getDescription();

    @Override
    public BigDecimal price(){
        return item.price();
    }
    @Override
    public void addPlant(Plant plant) {
         item.addPlant(plant);
    }

    @Override
    public void removePlant(Plant plant) {
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
    public Plant[] search(Spec spec) {
        return item.search(spec);
    }
}
