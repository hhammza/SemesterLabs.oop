package assessmentsecA;

public class Computer {
    private String computerNumber;//unique identifier
    private String IcdModel;//LCD
    private int ramSize;//in GBs
    private int handSize;//in GBs
    private boolean hasGPU;//true or false

    Computer(){

    }

    public String getIcdModel() {
        return IcdModel;
    }

    public void setIcdModel(String icdModel) {
        IcdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHandSize() {
        return handSize;
    }

    public void setHandSize(int handSize) {
        this.handSize = handSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public Computer(String computerNumber, String icdModel, int ramSize, int handSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        IcdModel = icdModel;
        this.ramSize = ramSize;
        this.handSize = handSize;
        this.hasGPU = hasGPU;
    }



    public String getComputerNumber(){return computerNumber;}
    public void setComputerNumber(String number){this.computerNumber = computerNumber;}

    //public boolean isHasGPU() {
      //  return hasGPU;
    //}
    @Override
    public boolean equals(Object obj){
        Computer obj1 = (Computer) obj;
        if(this.getComputerNumber().equals(obj1.getComputerNumber()) && this.getIcdModel().equals(obj1.getIcdModel())){
            return true;
        }else{
            return false;
        }
    }
    /* public boolean equals(Object o){
        Music obj = (Music) o;
        if (this.getTitle().equals(obj.getTitle()) && this.getArtist().equals(obj.getArtist()))
            return true;
        else return false;
    }
    public  Music equals(Music dur1, Music dur2){
        if (dur1.getDuration()<dur2.getDuration())
            return dur2;
        else return dur1;
    }*/

    public Computer clone(){
        return new Computer (this.computerNumber, this.IcdModel, this.ramSize, this.handSize, this.hasGPU);
    }
    public void displayCD(){
        System.out.println("computerNumber: "+computerNumber);
        System.out.println("IcdModel: "+IcdModel);
        System.out.println("ramSize; "+ramSize+"GB");
        System.out.println("handSize: "+handSize+"GB");
        System.out.println("hasGPU: "+hasGPU);
    }


}
