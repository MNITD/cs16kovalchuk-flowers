package item;

/**
 * Created by Dell on 08.11.2016.
 */
public abstract class ItemDecorator extends Item{
    private Item item;
    ItemDecorator(Item item){
        this.item = item;
    }
}
