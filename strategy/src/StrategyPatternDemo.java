public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // 신용 카드 결제
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9101-1121"));
        cart.checkout(300);

        // 페이팔 결제
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(150);
    }
}
