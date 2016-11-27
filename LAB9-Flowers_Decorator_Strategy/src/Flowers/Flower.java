package Flowers;
import Flowers.Enums.*;
import Flowers.Decorator.Item;

public abstract class Flower extends Item {
    protected FlowerSpec spec;

    public Flower(FlowerSpec sp){spec = sp;}
    public Flower(){}

    public FlowerSpec getSpec() {return spec;}
    public void setSpec(FlowerSpec sp) {spec = sp;}

    public abstract double price();

    public FlowerColor getColor () {
        return spec.getColor();
    }
    public double getLength() {
        return spec.getLength();
    }
    public boolean isFresh() {
        return spec.isFresh();
    }
    public double getPrice() {
        return spec.getPrice();
    }
    public FlowerType getType () {
        return spec.getType();
    }

    public void setColor(FlowerColor fc) {spec.setColor(fc);}
    public void setLength(double l) {
        spec.setLength(l);
    }
    public void setIsFresh(boolean isFr) {spec.setIsFresh(isFr);}
    public void setPrice(double pr) {
        spec.setPrice(pr);
    }
    public void setType (FlowerType ft) {spec.setType(ft);}

    public String toString() {
        return spec.toString();
    }
}