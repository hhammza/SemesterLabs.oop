package assessmentsecA;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Demo {
    public static void main(String[] args) {

        Computer c1 = new Computer("C001", "LCD-001", 8, 512, true);
        Computer c2 = new Computer("C002", "LCD-001", 16, 256, false);
        Employee e1 = new Employee("12", "hamza");
        Lab l1 = new Lab("L001", new Computer[]{c1, c2}, LabStatus.OPERATIONAL, e1);
        University u1 = new University();

        u1.addLabs(l1);
        System.out.println("Fetching Lab Details:");
        l1.displayLD();
        System.out.println();
        System.out.println("Fetching Computer Details:");
        c1.displayCD();
        System.out.println();
        System.out.println("Fetching Employee Details:");
        e1.displayED();

    }
}
