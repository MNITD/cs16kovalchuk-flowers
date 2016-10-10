import java.util.Comparator;
import java.util.Date;

/**
 * Created by Dell on 04.10.2016.
 */
public class Flower {
    private String name;
    private int price;
    private int liveDurationsHours;
    private int freshness;
    private int stemLength;
    private Date birthDay;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setStemLength(int length) {
        stemLength = length;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setLiveDuration(int liveDuration) {
        this.liveDurationsHours = liveDuration;
    }

    public void setBirthDayDate(Date d) {
        birthDay = d;
    }

    public float getLevelOfFreshness() {
        Date date = new Date();
        int msAfterBirth = (int) (date.getTime() - birthDay.getTime());
        // to get days, should divide on 1000 * 60 * 60 * 24
        return 100 - (msAfterBirth / (liveDurationsHours * 60 * 60 * 10)); // return freshness in %
    }

}
