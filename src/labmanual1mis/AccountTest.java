package labmanual1mis;
import java.sql.SQLOutput;
import java.util.Scanner;
class BankAccountA {
    private double balance;
    private String name;
    BankAccountA(double balance, String name){
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = balance - amount;
    }
    public void showBalance(double balance){
        System.out.println("The balance is "+this.balance);
    }
}

public class AccountTest{

    public static void main(String[] args){
        AccountTest o = new AccountTest();
        o.input();
    }
    public void input(){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.printf("Number of inputs: ");
        int p = sc1.nextInt();
        for (int i = 0; i < p; i++){
            System.out.printf("Enter Balance and 0 to end this: ");
            double x = sc1.nextDouble();
            if (x == 0){
                System.out.println("Terminated...");
                break;
            }
            System.out.printf("Enter Name: ");
            String n = sc2.next();
            BankAccountA b1 = new BankAccountA(x,n);
            System.out.printf("Enter Amount: ");
            double ammount = sc1.nextDouble();

            System.out.println("Press 1: To Deposit.");
            System.out.println("Press 2: To Withdraw.");
            System.out.println("Press 3: To View current balance.");
            System.out.printf("Enter Choice: ");
            int choice = sc1.nextInt();
            if (choice == 1){
                b1.deposit(ammount);
                b1.showBalance(ammount);
            }
            else if(choice == 2){
                b1.withdraw(ammount);
                b1.showBalance(ammount);
            }
            else if (choice == 3){
                b1.showBalance(ammount);
            }else{
                System.out.println("No choice selected.");
            }
        }
    }
}


/*package labmanual1mis;
import java.util.Scanner;

class BankAccountA {
    private double balance;
    private String name;

    BankAccountA(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = balance - amount;
    }

    public void showBalance() { // Removed the balance parameter
        System.out.println("The balance is " + balance); // Use the instance variable balance
    }
}

public class AccountTest {

    public static void main(String[] args) {
        AccountTest o = new AccountTest();
        o.input();
    }

    public void input() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.printf("Enter Balance: ");
        double x = sc1.nextDouble();
        System.out.printf("Enter Name: ");
        String n = sc2.next();
        BankAccountA b1 = new BankAccountA(x, n);
        System.out.printf("Enter Amount: ");
        double amount = sc1.nextDouble();

        System.out.println("Press 1: To Deposit.");
        System.out.println("Press 2: To Withdraw.");
        System.out.println("Press 3: To View current balance.");
        System.out.printf("Enter Choice: ");
        int choice = sc1.nextInt();
        if (choice == 1) {
            b1.deposit(amount);
            b1.showBalance();
        } else if (choice == 2) {
            b1.withdraw(amount);
            b1.showBalance();
        } else if (choice == 3) {
            b1.showBalance();
        } else {
            System.out.println("No choice selected.");
        }
    }
}*/

