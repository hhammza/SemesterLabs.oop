package assessmentsecA;

public class University {
    private Lab[] labs;
    private int si = 5;

    public Lab[] getLabs() {
        return labs;
    }

    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    public void addLabs(Lab lab){
        if (si < 5){
            labs[si++] = lab;
        }
    }
    public boolean removeLab(Lab lab){
        for (int i = 0; i < labs.length; i++){
            if (lab.getLabID().equals(labs[i].getLabID())){
                for (int j=i; j < labs.length-1; j++){
                    labs[j] = labs[j+1];
                }
                labs[--si] = null;
                return false;
            }

        }
        return true;
    }
    public Lab getLab(Lab lab){
        for (int i = 0; i < labs.length; i++){
            if (lab.getLabID().equals(labs[i].getLabID())) {
                return lab;
            }
        }
    return null;
    }
}
