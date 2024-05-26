package PaymentProcessing;

public class Bkash implements PaymentStrat{

    @Override
    public boolean pay(double amnt) {
        System.out.println("paying in BKash");
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }
    
}
