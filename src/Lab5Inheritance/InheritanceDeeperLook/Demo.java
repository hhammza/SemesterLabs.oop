package Lab5Inheritance.InheritanceDeeperLook;

public class Demo {
    public static void main(String[] args) {
        Vehicle v1; //= new Vehicle();
        v1 = new TwoWheelVehicle();
        Shape obj = new Shape();
        Shape2D obj1 = new Shape2D(); //is a shape
        Shape3D obj2 = new Shape3D(); //is a shape
        Circle obj3 = new Circle();
        Rectangle obj4 = new Rectangle();

        System.out.println(v1);
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj1.min(2,3));
    }
}
