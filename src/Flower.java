import java.util.Comparator;
import java.util.Date;

/**
 * Created by Dell on 04.10.2016.
 */
public class Flower {

    public enum FlowerColor {
        RED,
        BLUE,
        YELLOW,
        WHITE;

        public String toString() {
            return this.toString();
        }
    }

    private FlowerSpec flowerSpec;

    public Flower(FlowerSpec flowerSpec) {
        this.flowerSpec = flowerSpec;
    }

    public FlowerColor getColor() {
        return flowerSpec.getColor();
    }

    public String getType() {
        return flowerSpec.getType();
    }

    public String getName() {
        return flowerSpec.getName();
    }

    public int getPrice() {
        return flowerSpec.getPrice();
    }

    public int getFreshness() {
        return flowerSpec.getFreshness();
    }

    public int getStemLength() {
        return flowerSpec.getStemLength();
    }

    public float getLevelOfFreshness() {
        Date date = new Date();
        int msAfterBirth = (int) (date.getTime() - flowerSpec.getBirthDay().getTime());
        // to get days, should divide on 1000 * 60 * 60 * 24
        return 100 - (msAfterBirth / (flowerSpec.getLiveDurationsHours() * 60 * 60 * 10)); // return freshness in %
    }

}
