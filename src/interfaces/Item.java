package interfaces;

import model.plant.Plant;
import model.spec.Spec;

import java.math.BigDecimal;

/**
 * Created by Dell on 08.11.2016.
 */
public interface Item {
     BigDecimal price();
     void addPlant(Plant plant);
     void removePlant(Plant plant);
     int getSize();
     String getListOfPlants();
     void sortByLevelOfFreshness();
     Plant[] search(Spec spec);
}
