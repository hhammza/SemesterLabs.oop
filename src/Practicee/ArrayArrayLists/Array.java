package Practicee.ArrayArrayLists;

public class Array {
    public static void main(String[] args) {
        final int Final_Size = 10;
        int[] a = new int[Final_Size];

        System.out.printf("%s %8s\n","Index","Values");
        for(int i = 0; i < a.length; i++){
            a[i] = 2+2*i;
            System.out.printf("%d %7d\n", i, a[i]);
        }

//        System.out.printf("%s %8s\n","Index","Values");
//
//        for(int i=0; i<a.length; i++){
//            a[i]=2+2*i;
//
//            System.out.printf("%d %7d\n",i,a[i]);
    }
}
