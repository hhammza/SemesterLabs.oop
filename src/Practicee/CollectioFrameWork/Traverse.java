package Practicee.CollectioFrameWork;

import java.util.*;

public class Traverse {
    public static void main(String[] args) {

        //type safe collection  //ArrayList
        ArrayList<String> name = new ArrayList<>();//we can add only string bcz it is type safe.

        //add
        name.add("Mala");
        name.add("Hamza");
        name.add("Mashal");
        name.add("Saleaha");
        name.add("Mala");

        //for each loop
        for(String str: name){
            System.out.print(str+"\t"+str.length()+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("________________________________________________");

        //traversing using Iterator: forward traversing.
        Iterator<String> itr = name.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        //backward traversal of collection: ListIterator
        ListIterator<String> litr = name.listIterator(name.size());
        while(litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }
        System.out.println("----------------------------------------");

        //Enumeration
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        Enumeration<String> en = vector.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        System.out.println("**************************************");

        //for each method:
       name.forEach(str -> {
           System.out.println(str);
       });
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

       //TreeSet:
        TreeSet<String> ts = new TreeSet<>();
        ts.addAll(name);
        ts.forEach(e -> {
            System.out.println(e);
        });

    }
}
