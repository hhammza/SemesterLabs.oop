package labmanual1mis;
import java.util.Scanner;
class BankAccountB{
    private int accountNumber;
    private String title;
    private double balance;

    BankAccountB(int accountNumber, String title, double balance){
        this.accountNumber = accountNumber;
        this.title = title;
        this.balance = balance;
    }
    public int getAccountNumber(){return accountNumber;}
    public void setAccountNumber(int a){
        this.accountNumber = a;
    }
    public String getTitle(){return title;}
    public void setTitle(String s){
        this.title = s;
    }
    public double getBalance(){return balance;}
    public void setBalance(double b){
        this.balance = balance;
    }
    public String toString(){
        return accountNumber + "  " + title + "  " + balance;
    }
}

public class BankTest {
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    public void input(){
        System.out.println("Enter Account Number:  ");
        int n = sc1.nextInt();
        System.out.println("Enter Title:  ");
        String s = sc2.next();
        System.out.println("Enter Balance:  ");
        double b = sc1.nextInt();

    }
    public static void main(String[] args){
        BankAccountB obj = new BankAccountB(34, "Jadu", 5000);
        System.out.println(obj);

    }
}
