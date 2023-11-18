package Practicee.CollectioFrameWork;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        //type safe collection  //ArrayList
        ArrayList<String> name = new ArrayList<>();//we can add only string bcz it is type safe.

        //add
        name.add("Mala");
        name.add("Hamza");
        name.add("Mashal");
        name.add("Saleaha");
        name.add("Mala");
        System.out.println(name);
        System.out.println();

        //Un type safe collection   //LinkedList
        LinkedList l = new LinkedList();

        //add
        l.add("Mala");
        l.add("Hamza");
        l.add(18);
        l.add("Mala");
        l.add(18.10);
        l.add(0,null);//add at given index.
        l.add(true);

        //get
        System.out.println(name.get(1));//get buy index.
        System.out.println(name.get(0));
        System.out.println(l.get(0));
        System.out.println();

        //remove
        l.remove("null");//remove by passing object.
        l.remove(3);//remove by passing index.
        System.out.println(l);
        System.out.println();

        //size
        System.out.println("Size name:"+name.size());
        System.out.println("Size l:"+l.size());
        System.out.println();

        //contains : return true or false
        //type ka equals method call krta hai check krne ke liye
        System.out.println(name.contains("Mala"));
        System.out.println(name.contains("Ali"));
        System.out.println(l.contains("Hamza"));
        System.out.println(l.contains(18.10));
        System.out.println();

        //check for empty:
        System.out.println(name.isEmpty());
        System.out.println(l.isEmpty());
        System.out.println();

        //indexOf:
        System.out.println(l.indexOf("Mala"));
        System.out.println(l.indexOf("null"));//if not present in the list returns -1.
        System.out.println();

        //set
        l.set(0,"Mack");
        System.out.println(l);
        System.out.println();

        //clear
        l.clear();
        System.out.println(l);
        System.out.println();

        //vector
        Vector<String> v = new Vector<>();
        v.addAll(name);
        System.out.println(v);

        System.out.println("______________________________________________________________");

        //Hashcode : stores values in unordered manner.
        HashSet<Double> n = new HashSet<>();
        n.add(14.14);
        n.add(34.12354);
       // n.add(new Double(2354.235));            //warning
        n.add(99.99);
        n.add(234.234);
        n.add(99.9);
        n.add(99.99);
        n.add(5.3);
        System.out.println(n);
        System.out.println();

        //TreeSet:
        TreeSet<Double> t = new TreeSet<>();
        t.addAll(n);
        System.out.println(t);
        System.out.println();



    }
}
