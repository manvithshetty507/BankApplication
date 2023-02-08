public interface BankInterface {

    int getBalance();
    String deposit(int amount);
    String Withdrawal(int amount,String enteredPassword);
    double calculateInterest(int time);
}
