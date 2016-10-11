/**
 * Created by Dell on 11.10.2016.
 */
public class Lilies extends Flower {
    public String type = "Lilies";
    private int price = 10;

    @Override
    public String getType(){
        return  type;
    }
    @Override
    public int getPrice(){
        return  price;
    }
}
