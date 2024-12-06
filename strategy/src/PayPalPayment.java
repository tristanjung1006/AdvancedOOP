// 페이팔 결제를 처리하는 클래스
public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal");
    }
}
