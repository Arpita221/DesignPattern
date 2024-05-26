package PaymentProcessing;

public class Paypal implements PaymentStrat {

    @Override
    public boolean pay(double amnt) {
        System.out.println("Paying in paypal");
        
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }
    
}
