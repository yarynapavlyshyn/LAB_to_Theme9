package Flowers;
import Flowers.Enums.*;

public class RomashkaFlower extends Flower {
    FlowerColor color = FlowerColor.WHITE;
    double length = 42.5;
    boolean isFresh = true;
    double price = 25.25;
    FlowerType type = FlowerType.ROMASHKA;

    public RomashkaFlower(){
        FlowerSpec sp = new FlowerSpec(color, length, isFresh, price, type);
        this.setSpec(sp);
    }
    public RomashkaFlower(FlowerSpec spec){
        super(spec);
    }

    public String getDescription(){
        return "Romashka. ";
    }

    public double price() {
        return this.getPrice();
    }
    public static void main(String[] args){

        RomashkaFlower roma = new RomashkaFlower();
        System.out.println(roma.toString());
    }
}
