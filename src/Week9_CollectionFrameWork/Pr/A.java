package Week9_CollectionFrameWork.Pr;

import java.util.ArrayList;
import java.util.Collections;

public class A {
    public static void main(String[] args) {
//        ArrayList a = new ArrayList();
//        a.add(2222);
//        a.add("H");
//        System.out.println(a.size());
//        for(int i = 0; i < a.size(); i++){
//            System.out.println(a.get(i));
//        }

//        ArrayList<String> s = new ArrayList<>();
//        ArrayList<Boolean> b = new ArrayList<>();

        ArrayList<Integer> l = new ArrayList<>();
        //add
        l.add(1);
        l.add(6);
        l.add(3);
        System.out.println(l);

        //get
        System.out.println(l.get(0));

        //add element in between
        l.add(0,0);
        System.out.println(l);

        //set element
        l.set(0,4);
        System.out.println(l);

        //delete element
        l.remove(0);
        System.out.println(l);

        //size
        System.out.println(l.size());

        //loops
        for (int i = 0; i<l.size(); i++){
            System.out.print(l.get(i)+"  ");
        }
        System.out.println();

        //sorting
        Collections.sort(l);
        System.out.println(l);

    }
}
