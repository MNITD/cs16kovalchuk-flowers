package item;

/**
 * Created by Dell on 08.11.2016.
 */
public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item){
        super(item);
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double price() {
        return 0;
    }
}
