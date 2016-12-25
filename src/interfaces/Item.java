package interfaces;

import interfaces.plants.IPlant;
import model.plant.Plant;
import model.spec.Spec;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Dell on 08.11.2016.
 */
public interface Item {
     BigDecimal price();
     void addPlant(IPlant plant);
     void removePlant(IPlant plant);
     int getSize();
     String getListOfPlants();
     void sortByLevelOfFreshness();
     ArrayList<IPlant> search(Spec spec);
}
