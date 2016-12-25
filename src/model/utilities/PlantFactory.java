package model.utilities;

import enums.FlowerColor;
import enums.PlantsTypes;
import interfaces.plants.IPlant;
import model.plant.Plant;
import model.plant.adapters.ArtificialFlower;
import model.plant.cactus.Cactus;
import model.plant.flower.Flower;
import model.plant.flower.Lilies;
import model.plant.flower.Rose;
import model.plant.flower.Tulips;
import model.spec.ArtificialFlowerSpec;
import model.spec.CactusSpec;
import model.spec.FlowerSpec;
import model.spec.Spec;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Created by D1mD1m on 12/25/2016.
 */
public abstract class PlantFactory {
    public static IPlant produce(Spec spec){
        switch (spec.getType()){
            case FLOWER_TULIP:
                return new Tulips((FlowerSpec) spec);

            case FLOWER_LILIE:
                return new Lilies((FlowerSpec) spec);

            case FLOWER_ROSE:
                return new Rose((FlowerSpec) spec);

            case CACTUS_UNCPECIFIED:
                return new Cactus((CactusSpec) spec);

            case FLOWER_ARTIFICIAL_UNCPECIFIED:
                return new ArtificialFlower((ArtificialFlowerSpec) spec);

            default:
                return null;
        }
    }

    public void generateFlowerSet(int numberOfFlowers) {
        Random r = new Random();
        Date date = new Date();

        ArrayList <IPlant> plantsArray = new ArrayList<>(numberOfFlowers);
        for (int i = 0; i < numberOfFlowers; i++) {
            Plant p;
            Spec spec = new FlowerSpec();

            spec.setLiveDurationsHours(r.nextInt(48) + 10);//from 10 to 58 hours
            spec.setBirthDay(date); //birthDay to calculate freshness in % by date

            switch (r.nextInt(5)){
                case 0:
                    spec.setType(PlantsTypes.FLOWER_ROSE);
                    spec.setName(spec.getType().toString() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.RED);
                    p = new Rose((FlowerSpec) spec);
                    break;
                case 1:
                    spec.setType(PlantsTypes.FLOWER_TULIP);
                    spec.setName(spec.getType().toString() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    p = new Tulips((FlowerSpec)spec);
                    break;
                case 2:
                    spec.setType(PlantsTypes.FLOWER_LILIE);
                    spec.setName(spec.getType().toString() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.RED);
                    p = new Lilies((FlowerSpec)spec);
                    break;
                case 3:
                    spec.setType(PlantsTypes.CACTUS_UNCPECIFIED);
                    spec.setName(spec.getType().toString() + i);
                    ((CactusSpec)spec).setNeedlesLength(r.nextInt(5)+2); //from 2 to 7 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.RED);
                    p = new Lilies((FlowerSpec)spec);
                    break;
                case 4:
                    spec.setType(PlantsTypes.FLOWER_ARTIFICIAL_UNCPECIFIED);
                    spec.setName(spec.getType().toString() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.BLUE);
                    p = new Lilies((FlowerSpec)spec);
                    break;
                default:
                    spec.setType(PlantsTypes.FLOWER_UNCPECIFIED);
                    spec.setName(spec.getType().toString() + i);
                    ((FlowerSpec)spec).setStemLength(r.nextInt(20)+10); //from 10 to 30 cm
                    ((FlowerSpec)spec).setColor(FlowerColor.RED);
                    p = new Flower((FlowerSpec)spec);
                    break;
            }
            plantsArray.add(i,p);
        }

    }


}
