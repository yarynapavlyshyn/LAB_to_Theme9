package Flowers;
import Flowers.Enums.*;

public class CactusFlower extends Flower {
    FlowerColor color = FlowerColor.GREEN;
    int length = 26;
    boolean isFresh = true;
    double price = 80.50;
    FlowerType type = FlowerType.CACTUS;

    public CactusFlower(){
        FlowerSpec sp = new FlowerSpec(color, length, isFresh, price, type);
        this.setSpec(sp);
    }
    public CactusFlower(FlowerSpec spec) {
        super(spec);
    }

    public double price(){
        return this.getPrice();
    }
    public String getDescription(){
        return "Cactus. ";
    }
    public static void main(String[] args){

        CactusFlower roma = new CactusFlower();
        System.out.println(roma.toString());
    }
}
