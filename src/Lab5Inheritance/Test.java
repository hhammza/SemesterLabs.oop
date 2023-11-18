package Lab5Inheritance;

public class Test {
    public static void main(String[] args){
        D r=new D(7,8,9);
        A r1 = new A(1);
        B r2 = new B(2,3);
        C r3 = new C(4,5,6);
        Person r4 = new Person("hamza", "SP23-BCS-086","Lahore");
        Employee r5 = new Employee("Kaashir", "SP23-BCS-060", "Karachi", "060",1000.10);

        System.out.println(r4.getName());
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}
