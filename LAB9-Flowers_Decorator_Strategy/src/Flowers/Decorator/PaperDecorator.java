package Flowers.Decorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item){
        super(item);
    }
    public double price(){
        return 13 + this.item.price();
    }
    public String getDescription(){
        return item.getDescription()+ "\nDecorate with paper.";
    }
}
