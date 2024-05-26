package PaymentProcessing;

public class CreditCard implements PaymentStrat {

    @Override
    public boolean pay(double amnt) {
        System.out.println("Paying in credit card");
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }
    
}
