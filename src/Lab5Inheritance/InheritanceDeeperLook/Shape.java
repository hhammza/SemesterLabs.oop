package Lab5Inheritance.InheritanceDeeperLook;

public class Shape {
    static int y = 10;
    protected int x = 1;
    Point centerpoint;

    protected double calArea(){ return 0;}
    public int getX(){return x;}
    public void setX(int x){this.x = x;}
    public String toString(){ return String.valueOf(x);}
    public static int min(int x, int y){return x>y?y:x;}
    public final int sum(int a, int b){return a+b;}
}
