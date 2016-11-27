package Flowers.Decorator;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item){
        super(item);
    }
    public double price(){
        return 40 + this.item.price();
    }
    public String getDescription(){
        return item.getDescription()+ "\nDecorate with ribbon. ";
    }
}
