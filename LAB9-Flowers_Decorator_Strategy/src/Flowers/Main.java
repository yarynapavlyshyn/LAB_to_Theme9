package Flowers;

import java.util.LinkedList;
import Flowers.Payment_Delivery_Strategy.*;
import Flowers.Decorator.Item;
import Flowers.Decorator.Decor;


public class Main {
    public static void main(String args[]){
        Order order = new Order();
        Item r1 = new RomashkaFlower();
        Item r2 = new RomashkaFlower();
        Item c1 = new CactusFlower();

        order.addItem(r1);
        order.addItem(r2);
        order.addItem(c1);

        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        order.setDeliveryStrategy(new PostDeliveryStrategy());

        LinkedList<Decor> decor = new LinkedList<>();
        decor.add(Decor.BUCKET);
        decor.add(Decor.RIBBON);

        order.chooseDecor(decor);
        order.processOrder();
    }
}