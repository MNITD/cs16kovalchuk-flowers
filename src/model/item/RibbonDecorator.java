package model.item;

import interfaces.Item;
import model.plant.Plant;
import model.spec.Spec;

import java.math.BigDecimal;

/**
 * Created by Dell on 08.11.2016.
 */
public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item){
        super(item);
    }

    @Override
    public String getDescription() {
        return "RibbonDecorator";
    }

    @Override
    public BigDecimal price() {
        return super.price().multiply(new BigDecimal(1.2));
    }

    @Override
    public void addPlant(Plant plant) {
         super.addPlant(plant);
    }

    @Override
    public void removePlant(Plant plant) {
         super.removePlant(plant);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String getListOfPlants() {
        return super.getListOfPlants();
    }

    @Override
    public void sortByLevelOfFreshness() {
         super.sortByLevelOfFreshness();
    }

    @Override
    public Plant[] search(Spec spec) {
        return super.search(spec);
    }
}
