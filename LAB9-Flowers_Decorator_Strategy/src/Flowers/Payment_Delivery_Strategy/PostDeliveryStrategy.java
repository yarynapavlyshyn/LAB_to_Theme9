package Flowers.Payment_Delivery_Strategy;

public class PostDeliveryStrategy implements IDelivery {
    public void deliver(){
        System.out.println("DELIVERY: post.");
    }
}