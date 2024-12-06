class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // 결제수단 설정
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // 결제 처리
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
