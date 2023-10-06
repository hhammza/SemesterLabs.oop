package assessmentsecA;
import java.util.Arrays;
public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;
    private int s = 5;

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    Lab(){

    }
    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant){
        this.labID = labID;
        this.computers = new Computer[s];
        this.status = status;
        this.labAttendant = labAttendant;
    }
    public void addComputer(Computer computer){
        if( s < 5){
            computers[s++] = computer;
        }
    }
    //chat gpt:
    public boolean removeComputer(String computerNumber){
        for (int i = 0; i<computers.length;i++) {
            if (computerNumber.equals(computers[i].getComputerNumber())){
                for(int j = i; j<computers.length-1;j++){
                    computers[j] = computers[j + 1];
                }
                computers = Arrays.copyOf(computers,computers.length-1);
                return true;
            }
        }
        return false;
    }

    public Computer getComputer(String computerNumber){
        for (Computer comp: computers){
            if(computerNumber.equals(comp.getComputerNumber())) {
                return comp;
            }
        }
        return null;
    }

    public void changeLabStatus(LabStatus newstatus){
        this.status = newstatus;
    }


    public  void setLabAttendantDetails(){
        Employee labAttendant = new Employee("11", "hamza");
    }
    public Employee getLabAttendantDetails(){return labAttendant;}
   /* public void displayLD(){
        System.out.println(" labID: "+ labID);
        System.out.println("status: "+status);
        labAttendant.displayED();
        System.out.println("Computer Details:");
        for (Computer comp: computers){
            if (comp != null){
                comp.displayCD();
            }
        }
    }*/
   public void displayLD() {
       System.out.println("Lab ID: " + labID);
       System.out.println("Lab Status: " + status);
       System.out.println("Lab Attendant: Ali");
       labAttendant.displayED();
       System.out.println("Computers in the Lab:");
       for (Computer computer : computers) {
           if (computer != null) {
               computer.displayCD();
           }
       }
   }
}