package Flowers;
import Flowers.Enums.*;
import Flowers.Decorator.Item;
import java.util.ArrayList;

public class FlowerBucket extends Item {
    private int defaultSize = 10;

    private int insertIndex = -1; // insert, or better create method length()
    private Flower[] a = new Flower[defaultSize];
    double price = 0;
    int size = 0;

    public String getDescription() {
        String toRet = "FlowerBucket with such flowers: \n";
        if (size == 0) return "YOUR ORDER IS EMPTY!!";
        toRet += a[0].getType()+"\n";
        for (int i = 1; i < size; ++i){
            toRet += a[i].getType()+"\n";
        }
        return toRet;
    }

    public void addFlower(Flower nw) {
        checkSize();
        a[++insertIndex] = nw;
        price += nw.price();
        ++size;
    }
    public void removeFlower(Flower toRemove) {
        int i = 0;
        while (i < size) {
            if (a[i].getType() == toRemove.getType()){
                --size;
                break;}
            ++i;
        }
        if (i == size) return;
        // i - index of el to remove
        --size;

        while (i < size){
            a[i] = a[i+1];
            ++i;
        }
        a[size] = null;
    }
    public double price(){
        return price;
    }

    public ArrayList<Flower> getFlower(FlowerType type){

        ArrayList<Flower> tmp = new ArrayList<>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getSpec().getType().equals(type)) {
                tmp.add(a[i]);
            }
        }
        return tmp;
    }
    public Flower[] searchFlower(FlowerSpec flower){

        Flower[] tmp = new Flower[defaultSize];
        int pos = 0;
        for (int i = 0; i < insertIndex; i++) {
            FlowerSpec flowerToSearch = a[i].getSpec();
            if (flowerToSearch.getType() != (flower.getType()))
                continue;
            if (flowerToSearch.getColor() != flower.getColor())
                continue;
            if (flowerToSearch.getLength() != flower.getLength())
                continue;
            tmp[pos] = a[i];
            pos++;
        }
        return tmp;
    }
    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }
}