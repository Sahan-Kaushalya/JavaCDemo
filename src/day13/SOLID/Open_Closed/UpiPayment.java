package day13.SOLID.Open_Closed;

class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("UPI payment");
    }

    public void processPayment(Payment payment) {
        payment.pay();
    }
}