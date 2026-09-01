import payment.*;

public class PaymentTest {

    public static void main(String[] args) {

        PaymentMethod p = new CreditCard();
        p.pay(2500);

        p = new UPI();
        p.pay(1200);
    }
}