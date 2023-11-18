package Lab5Inheritance;

public class Employee extends Person{
    String ssn;
    double basicSalary;

    //Person(String name, String email, String address){
    // this.name = name;
    // this.email = email;
    // this.address = address;
    // }

    Employee(String name, String email, String address, String ssn, double basicSalary){
        super(name, email, address);
        this.ssn = ssn;
        this.basicSalary = basicSalary;
    }

    public double calSalary(){ return basicSalary; }
}
