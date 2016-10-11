/**
 * Created by Dell on 11.10.2016.
 */
public class Rose extends Flower {
    private String type = "Rose";
    private int price = 15;

    @Override
    public String getType(){
        return  type;
    }

    @Override
    public int getPrice(){
        return  price;
    }
}
