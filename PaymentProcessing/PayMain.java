package PaymentProcessing;

class PayMain {
    private PaymentStrat paymentStrat;

    public void setPaymentStrat(PaymentStrat paymentStrat) {
        this.paymentStrat = paymentStrat;
    }

    public boolean makePayment(double amnt) {
        if (paymentStrat == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        return paymentStrat.pay(amnt);
    }

    public static void main(String[] args) {
        PayMain paymain = new PayMain();

        paymain.setPaymentStrat(new CreditCard());
        paymain.makePayment(500);

        paymain.setPaymentStrat(new Bank());
        paymain.makePayment(500);

        paymain.setPaymentStrat(new Paypal());
        paymain.makePayment(500);

        paymain.setPaymentStrat(new Bkash());
        paymain.makePayment(500);
    }
}
