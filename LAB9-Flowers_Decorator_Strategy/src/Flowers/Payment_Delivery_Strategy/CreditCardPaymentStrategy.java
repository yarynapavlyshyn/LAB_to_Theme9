package Flowers.Payment_Delivery_Strategy;

public class CreditCardPaymentStrategy implements IPayment {
    public void pay(double price) {
        System.out.println( "PAYMENT: by credit card.\nPrice: "+ price);
    }
}