package Practicee.ArrayArrayLists;

public class BarChart {
    public static void main(String[] args) {
        int size = 10;
        int[] a = {0,0,0,0,0,0,1,2,4,2,1};

        System.out.println("Grade Distribution:");

        for(int count = 0; count < a.length; count++){
            if(count == 10){
                System.out.printf("%5d:", 100);
            } else {
                System.out.printf("%02d-%02d:", count*10,count*10+9);
            }
            for(int star =0; star < a[count]; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
