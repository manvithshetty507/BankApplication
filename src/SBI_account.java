import java.util.UUID;

public class SBI_account implements BankInterface{

    private String name;
    private String AccountNumber;
    private int Balance;
    private Double RateOfInterest;
    private String password;

    public SBI_account(String name, int balance, String password) {
        this.name = name;
        Balance = balance;
        this.password = password;

        this.RateOfInterest = 6.6;
        this.AccountNumber = String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public Double getRateOfInterest() {
        return RateOfInterest;
    }

    public void setRateOfInterest(Double rateOfInterest) {
        RateOfInterest = rateOfInterest;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int getBalance() {
        return this.Balance;
    }

    @Override
    public String deposit(int amount) {
        this.Balance += amount;
        return "money credited" + amount;
    }

    @Override
    public String Withdrawal(int amount,String enteredPassword) {
        if(enteredPassword.equals(password)){
            if(Balance < amount){
                return "Insufficient Balance";
            }
            else{
                Balance -= amount;
                return "Money debited" + amount;
            }
        }
        else{
            return "Wrong Credentials";
        }
    }

    @Override
    public double calculateInterest(int time) {

        return (Balance*RateOfInterest*time)/100;
    }
}
