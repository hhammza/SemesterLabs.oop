package Practicee.ArrayArrayLists;

public class TwoD {
    public static void main(String[] args) {
        int[][] a1 = {{1,2,3},{4,5,6}};
        int[][] a2 = {{1,2},{3},{4,5,6}};

        System.out.println("Array1 by row");
        outputArray(a1);

        System.out.println("Array2 by row");
        outputArray(a2);
    }
    public static void outputArray(int[][] a){
        for(int row = 0; row < a.length; row++){
            for(int column = 0; column < a[row].length; column++){
                System.out.printf("%d  ", a[row][column]);
            }
            System.out.println();
        }
    }
}
