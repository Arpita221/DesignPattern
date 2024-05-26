package PaymentProcessing;

public class Bank implements PaymentStrat {

    @Override
    public boolean pay(double amnt) {
     System.out.println("PAying in Bank");
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }

    
}
