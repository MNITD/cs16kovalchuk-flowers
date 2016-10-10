import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Dell on 04.10.2016.
 */
public class Bouquet {
    private ArrayList<Flower> bouquet;
    private int price = 0;
    private int size = 0;

    public Bouquet() {
        bouquet = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        bouquet.add(flower);
        size += 1;
        price += flower.getPrice();
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return price;
    }

    public String getListOfFlowers() {
        String s = "";
        for (Flower f : bouquet) {
            s += "name: " + f.getName() + ", price: " + f.getPrice()
                    + ", length:" + f.getStemLength() + ", freshness: " + f.getFreshness()
                    + System.getProperty("line.separator");
            ;
        }
        return s;
    }
    public static String getListOfFlowers(ArrayList<Flower>flowersList) {
        String s = "";
        for (Flower f : flowersList) {
            s += "name: " + f.getName() + ", price: " + f.getPrice()
                    + ", length:" + f.getStemLength() + ", freshness: " + f.getFreshness()
                    + System.getProperty("line.separator");
            ;
        }
        return s;
    }

    public void sortByFreshness() {
        Collections.sort(bouquet, new Comparator<Flower>() {
            @Override
            public int compare(Flower flower1, Flower flower2) {
                return Integer.compare(flower1.getFreshness(), (flower2.getFreshness()));
            }
        });
    }

    public ArrayList getFlowersByLength(int a, int b) {
        ArrayList<Flower> flowersInRange = new ArrayList<Flower>();
        for (Flower f : bouquet) {
            if (f.getStemLength() >= a && f.getStemLength() <= b) {
                flowersInRange.add(f);
            }
        }
        return flowersInRange;
    }
}