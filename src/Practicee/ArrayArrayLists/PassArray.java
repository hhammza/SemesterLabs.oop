package Practicee.ArrayArrayLists;

public class PassArray {
    public static void main(String[] args) {
        double[] d = {1,2,3,4,5};

        System.out.println("Before modification:");
        for(double dd : d){
            System.out.printf(dd+"   ");
        }

        modifyArray(d);
        System.out.println("\nAfter modification:");
        for(double dd: d){
            System.out.printf(dd+"   ");
        }

        modifyElement(d[3]);
        System.out.print("Array after modify element:"+d[3]);

    }
    public static void modifyArray(double[] b){
        for(int i = 0; i < b.length; i++){
            b[i] *= 2;
        }
    }
    public static void modifyElement(double b){
        b *= 2;
        System.out.println("\nModified Element:"+b);
    }
}
