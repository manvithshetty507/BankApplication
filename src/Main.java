import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name,password and balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBI_account myAcc = new SBI_account(name,balance,password);
        //get your acc no
        System.out.println("Your account is created :" + myAcc.getAccountNumber());
        //getBalance
        System.out.println("Your Balance" + myAcc.getBalance());

        //deposite


        //withdraw
        System.out.println("Enter amount for withdraw");
        int amount = sc.nextInt();
        System.out.println("Your password");
        String pass = sc.next();

        System.out.println(myAcc.Withdrawal(amount,pass));

        //Interest



    }
}
