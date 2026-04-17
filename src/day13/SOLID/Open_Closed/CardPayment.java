package day13.SOLID.Open_Closed;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Card payment");
    }

    public void processPayment(Payment payment) {
        payment.pay();
    }
}