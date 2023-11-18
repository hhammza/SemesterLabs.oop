package Practicee.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Box{
    //biggest class of all java classes.
    Object container;

    Box(Object container){
        this.container = container;
    }

    public Object getContainer(){
        return this.container;
    }
    @Override
    public String toString() {
        return "container=" + container;
    }
}

class Box1<T>{
    T container;

    public Box1(T container) {
        this.container = container;
    }

    public T getContainer() {
        return container;
    }

    public void perform(){
        if (container instanceof String){
            System.out.println(((String) container).length());
        }else if(container instanceof Integer){
            System.out.println(container);
        }
    }

    @Override
    public String toString() {
        return "container=" + container ;
    }
}
public class Demo {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>(); //only string can be added.
        s.add("JJJ");

        List s1 = new ArrayList(); //can add any object.
        s1.add("hhh");

        //not type safe.
        Box box = new Box("Water");
        Box box1 = new Box(3);
        Box[] b = new Box[10];
        System.out.println(b.length);
        System.out.println(box.container.getClass().getName());

        b[0] = new Box("hhh");
        b[1] = new Box(111);
        System.out.println(b[0]);
        System.out.println(b[0].getContainer());
        System.out.println(b[1].getContainer());
        box.container = 123;
        b[0].container = 123;

        Box1<Integer> b1 = new Box1<>(123);
        Box1<String> b2 = new Box1<>("kkk");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.container.getClass().getName());
        b1.container = 456;
        b2.container = "lll";
        Box1<Boolean> b3 = new Box1<>(true);
        System.out.println(b3);
        System.out.println();

        b1.perform();
        b2.perform();
    }
}
