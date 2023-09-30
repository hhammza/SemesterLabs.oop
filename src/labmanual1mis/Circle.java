package labmanual1mis;
import java.util.Scanner;
class CircleInfo {
    private double radius;

    /*CircleInfo(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = radius;
    }*/
    public double calArea(double radius){
        return Math.PI*radius*radius;
    }
    public double calPerimeter(double radius){
        return Math.PI * 2 * radius;
    }
}
public class Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CircleInfo c1 = new CircleInfo();
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        System.out.println("Radius is "+ r);
        System.out.printf("%s%.2f","Area is ",c1.calArea(r));
        System.out.println();
        //System.out.printf("%s%f", "Area is ", c1.calArea(r));
        System.out.printf("%s%.2f","Perimeter is ",c1.calPerimeter(r));
    }
}
//passing value to functions of calArea and calPerimeter.