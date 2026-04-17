package day13.SOLID.Open_Closed;

class CryptoPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Crypto payment");
    }

    public void processPayment(Payment payment) {
        payment.pay();
    }
}