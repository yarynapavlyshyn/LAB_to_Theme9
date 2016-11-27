package Flowers.Decorator;

public class BucketDecorator extends ItemDecorator {
    public BucketDecorator(Item item){
        super(item);
    }
    public double price(){
        return 4 + this.item.price();
    }
    public String getDescription(){
        return item.getDescription()+ "\nDecorate the bucket. ";
    }
}
