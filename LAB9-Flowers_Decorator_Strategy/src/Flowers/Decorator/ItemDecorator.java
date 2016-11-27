package Flowers.Decorator;

public abstract class ItemDecorator extends Item {
    Item item;
    public ItemDecorator(Item itm){
        item = itm;
    }
    public abstract String getDescription();
}
