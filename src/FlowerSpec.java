import java.util.Date;

/**
 * Created by Dell on 23.10.2016.
 */
public class FlowerSpec {
    private String name;
    private int price;
    private int liveDurationsHours;
    private int freshness;
    private int stemLength;
    private Date birthDay;
    private Flower.FlowerColor color;
    private String type;

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLiveDurationsHours() {
        return liveDurationsHours;
    }

    public void setLiveDurationsHours(int liveDurationsHours) {
        this.liveDurationsHours = liveDurationsHours;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Flower.FlowerColor getColor() {
        return color;
    }

    public void setColor(Flower.FlowerColor color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
