package assessmentsecA;

public class Employee {
    private String employeeId;
    private String name;
    private final static String designation = "Lab Attendant";

    Employee(){}
    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeID(){return employeeId;}
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Employee ID: "+employeeId + "\nName: "+name+"\nDesignation:"+designation;
    }
    public void displayED(){
        System.out.println("ID: "+employeeId);
        System.out.println("Nmae: "+name);
        System.out.println("designation: "+designation);
    }
}