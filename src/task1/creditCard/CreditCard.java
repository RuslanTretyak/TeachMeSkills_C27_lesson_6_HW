package task1.creditCard;

public class CreditCard {
    public int accountNumber;
    public double currentAmount;

    public CreditCard(int accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void addToAmount(double sumToAdd) {
        this.currentAmount += sumToAdd;
        System.out.println("\nна счет " + this.accountNumber + " зачислено " + sumToAdd);
    }

    public void subtractFromAmount(double sumToSubtract) {
        if (this.currentAmount > sumToSubtract) {
            this.currentAmount -= sumToSubtract;
            System.out.println("\nсо счета " + this.accountNumber + " списано " + sumToSubtract);
        } else {
            System.out.println("\nсчет " + this.accountNumber + ": недостаточно средств");
        }
    }

    public void printStatus() {
        System.out.println("\nсчет: " + this.accountNumber + "\nтекущая сумма: " + this.currentAmount);
    }
}
