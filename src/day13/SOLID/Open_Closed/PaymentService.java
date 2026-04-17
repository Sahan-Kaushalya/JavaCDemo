package day13.SOLID.Open_Closed;

class PaymentService {

    /*void pay(String type) {
        if (type.equals("CARD")) {
            System.out.println("Card payment");
        } else if (type.equals("UPI")) {
            System.out.println("UPI payment");
        }
        else if (type.equals("CRYPTO")) {
            System.out.println("Crypto payment");
        }
    }*/

    void processPayment(Payment payment) {
        payment.pay();
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        /*paymentService.pay("CARD");
        paymentService.pay("UPI");*/
        paymentService.processPayment(new CardPayment());
        paymentService.processPayment(new UpiPayment());
            paymentService.processPayment(new CryptoPayment());
    }
}