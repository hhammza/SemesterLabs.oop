package Practicee.CollectioFrameWork.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableAndComparator {
    public static void main(String[] args) {
        ArrayList<Emp> emp = new ArrayList<>();
        emp.add(new Emp("m",109,108));
        emp.add(new Emp("i",20,102));
        emp.add(new Emp("a",103,10));
        System.out.println(emp);

        //comparator 
        Collections.sort(emp,new NameComparator());
        System.out.println(emp);

        //comparable (ID)
        Collections.sort(emp);
        System.out.println(emp);

    }
}
