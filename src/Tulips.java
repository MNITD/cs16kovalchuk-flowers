/**
 * Created by Dell on 11.10.2016.
 */
public class Tulips extends  Flower {
    private String type = "Tulips";
    private int price = 5;

    @Override
    public String getType(){
        return  type;
    }
    @Override
    public int getPrice(){
        return  price;
    }
}
