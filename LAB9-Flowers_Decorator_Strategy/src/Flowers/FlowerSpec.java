package Flowers;
import Flowers.Enums.*;

public class FlowerSpec {
    private FlowerColor color;
    private double length;
    private boolean fresh;
    private double price;
    private FlowerType type;

    public FlowerSpec (FlowerColor color, double length, boolean fresh, double price, FlowerType type) {
        this.color = color;
        this.length = length;
        this.fresh = fresh;
        this.price = price;
        this.type = type;
    }
    public FlowerColor getColor () {
        return color;
    }
    public double getLength() {
        return length;
    }
    public boolean isFresh() {
        return fresh;
    }
    public double getPrice() {
        return price;
    }
    public FlowerType getType () {
        return type;
    }

    public void setColor (FlowerColor fc) {
        color = fc;
    }
    public void setLength(double l) {
        length = l;
    }
    public void setIsFresh(boolean isFr) {
        fresh = isFr;
    }
    public void setPrice(double pr) {
        price = pr;
    }
    public void setType (FlowerType ft) {
        type = ft;
    }

    public String toString() {
        return "Type - " + getType() + ", price - " + String.valueOf(getPrice()) +
                " $, color - " + getColor() + ", is fresh - " + String.valueOf(isFresh()) +
                ", height - " + String.valueOf(getLength()) + " cm.";
    }
}
