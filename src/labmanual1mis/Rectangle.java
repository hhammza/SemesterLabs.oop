package labmanual1mis;
import java.util.Scanner;
class RectangleInfo{
    private String color;
    private double length;
    private double width;
    RectangleInfo(String color,double length, double width){
        this.color = color;
        this.length = length;
        this.width = width;
    }
    public String getColor(){return color;}
    public void setColor(){
        this.color = color;
    }
    public double getLength(){return length;}
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){return width;}
    public void setWidth(double width){
        this.width = width;
    }
    public double calArea(){
        return length*width;
    }
    public double calPerimeter(){
        return 2 * (length + width);
    }
}

public class Rectangle {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.printf("Enter Length: ");
        int l = sc1.nextInt();
        System.out.printf("Enter Width: ");
        int w = sc1.nextInt();
        System.out.printf("Enter Color: ");
        String s = sc2.next();
        System.out.println("enter Width2: ");
        int w2 = sc1.nextInt();

        RectangleInfo r1 = new RectangleInfo(s, l, w);

        RectangleInfo r2 = new RectangleInfo(s, l, w2);

        System.out.println("Color is "+ s);
        System.out.println("Length is "+ l);
        System.out.println("Width is "+ w);
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println(r2.getWidth());

        System.out.printf("%s%.2f","Area is ",r1.calArea());
        System.out.println();
        System.out.printf("%s%.2f","Perimeter is ",r1.calPerimeter());
    }
}

//Passing values to constructor rather than functions.