package Practicee.ArrayArrayLists;

public class Array2 {
    public static void main(String[] args) {
        int array_length = 10;
        int[] a = new int[array_length];
        int sum = 0;

        System.out.printf("%s %8s\n","Number","Sum");
        for (int i = 0; i < a.length; i++){
            a[i] = i;
            sum += a[i];
            System.out.printf("%d %13d\n",i,sum);
        }
        System.out.println();
        System.out.printf("%s %8d\n","Total:",sum);
    }
}
