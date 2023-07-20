package hw5;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(111, 1000);
        CreditCard card2 = new CreditCard(222, 1500);
        CreditCard card3 = new CreditCard(333, 2000);

        card1.enrollMoney(100);
        card2.enrollMoney(200);
        card3.withdrawMoney(1900);

        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();

    }
}
