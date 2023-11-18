package Practicee.ArrayArrayLists;

public class VariableLengthArgumentLists {
    public static void main(String[] args) {

        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.println(average(d1));
        System.out.println(average(d1,d2));
        System.out.println(average(d1,d2,d3));
        System.out.println(average(d1,d2,d3,d4));

    }
    public static double average(double ...d){
        double total = 0;
        for(double dd: d){
         total +=dd;
        }
        return total/d.length;
    }
}
