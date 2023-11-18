package Practicee.CollectioFrameWork.ComparableAndComparator;

import java.util.Comparator;
public class PhoneComparator implements Comparator<Emp>{
    public int compare(Emp o1,Emp o2){
        return o1.getPhone()-o2.getPhone();
    }
}
