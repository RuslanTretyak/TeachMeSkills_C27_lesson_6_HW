package task1;

import task1.creditCard.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(111111, 1000.50);
        CreditCard creditCard2 = new CreditCard(222222, 1213.60);
        CreditCard creditCard3 = new CreditCard(333333, 500.00);
        creditCard1.printStatus();
        creditCard2.printStatus();
        creditCard3.printStatus();
        creditCard1.addToAmount(1000.63);
        creditCard1.printStatus();
        creditCard2.addToAmount(100.20);
        creditCard2.printStatus();
        creditCard3.subtractFromAmount(200.00);
        creditCard3.printStatus();
    }
}
