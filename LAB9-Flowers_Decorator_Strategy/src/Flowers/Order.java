package Flowers;

import java.util.LinkedList;
import Flowers.Payment_Delivery_Strategy.*;
import Flowers.Decorator.*;

public class Order {
    LinkedList<Decor> items; // Decorators
    FlowerBucket flowerBucket = new FlowerBucket();
    IPayment payment;
    IDelivery delivery;
    Item currentBucket;

    public void setPaymentStrategy(IPayment payme) {
        payment = payme;
    }
    public void setDeliveryStrategy(IDelivery deliv) {
        delivery = deliv;
    }
    public void chooseDecor(LinkedList<Decor> dec){
        items = dec;}
    public double calculateTotalPrice() {
        return currentBucket.price();
    }
    public void decore(){
        currentBucket = flowerBucket;
        for (Decor d: items) {
            if ( d == Decor.BUCKET )
                currentBucket = new BucketDecorator(currentBucket);
            else if ( d == Decor.PAPER )
                currentBucket = new PaperDecorator(currentBucket);
            else if ( d == Decor.RIBBON )
                currentBucket = new RibbonDecorator(currentBucket);
        }
        System.out.println(currentBucket.getDescription());
    }
    public void processOrder() {
        if (payment == null) {
            System.out.println("Please, choose the way You want to pay.");
            return;
        }
        if (delivery == null) {
            System.out.println("Please, choose the way to deliver.");
            return;
        }
        System.out.println("Your order:");
        System.out.println();
        decore();
        System.out.println();
        delivery.deliver();
        System.out.println();
        double price = calculateTotalPrice();
        payment.pay(price);
    }
    public void addItem(Item item) {
        flowerBucket.addFlower((Flower)item);
    }
    public void removeItem(Item item){
        flowerBucket.removeFlower((Flower)item);
    }
}
