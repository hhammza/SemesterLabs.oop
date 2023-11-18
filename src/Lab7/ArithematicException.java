package Lab7;

import java.util.Scanner;
import java.util.InputMismatchException;
public class ArithematicException {
    public static int quotient(int a,int b) throws ArithmeticException{
        return (a/b);
    }
    public static void main(String[] args) {
//        ArithematicException r = new ArithematicException();
//        int i = 9/0;
//        System.out.println(i);// error
//        r.quotient(0,0);// error
//        double d = 9.0/0.0;
//        System.out.println(d);//print Infinity
//        double dd = 0.0/0.0;
//        System.out.println(dd);//NaN

        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try{
                System.out.print("Please enter an integer numerator: ");
                int n1 = sc.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int n2 = sc.nextInt();

                int res = quotient(n1,n2);
                System.out.println(res);
                continueLoop = false;

            }catch(InputMismatchException e1){
                System.err.println("EX: "+e1);
                sc.nextLine();//discard input so that user can try again. Otherwise, this block will run infinite.sc.nextLine(); is called. This line is used to clear any remaining invalid input from the scanner's buffer. If you don't clear the input buffer, and you immediately try to read input again, the same invalid input that caused the exception will still be there, causing the same exception to be thrown repeatedly and creating an infinite loop.
                System.out.printf("You must enter integers. Please try again.%n%n");
            }catch(ArithmeticException e2){
                System.err.println(e2);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }
        }while(continueLoop == true);
    }
}
