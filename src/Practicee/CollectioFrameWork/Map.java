package Practicee.CollectioFrameWork;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Map {
    public static void main(String[] args) {

        HashMap<String,Integer> courses = new HashMap<>();
        //adding elements:
        courses.put("Core Java",101);
        courses.put("Basic Python",100);
        courses.put("JavaFX",102);
        courses.put("Web Development",103);
        courses.put("Web Development",104);
        courses.put("PHP",104);

        System.out.println(courses);
        System.out.println();

//        courses.forEach((e1,e2)->{  //e1 = key, e2 = value.
//            System.out.println(e1+" => "+e2);
//        });

        courses.forEach((key,value)->{
            System.out.println(key+" => "+value);
        });
        System.out.println();

        //keySet
        //Entry Set

        //get : pass key to get value.
        System.out.println(courses.get("PHP"));
    }
}
