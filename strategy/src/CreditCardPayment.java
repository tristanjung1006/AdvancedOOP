// 신용카드 결제를 처리하는 클래스
public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}
