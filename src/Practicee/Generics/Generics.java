package Practicee.Generics;

import java.util.ArrayList;
import java.util.List;

class Printer<T> {
    T i ;

    public Printer(T i) {
        this.i = i;
    }

    public T getI() {
        return i;
    }
}

class Printer1<T extends Animal> {//upper bound.
    T i ;

    public Printer1(T i) {
        this.i = i;
    }

    public T getI() {
        return i;
    }
}

class Animal{
    public void p(){
        System.out.println("animal");
    }
}

class Cat extends Animal{
    public void pp(){
        System.out.println("cat");
    }
}
class Dog extends Animal{
    public void ppp(){
        System.out.println("dog");
    }
}

public class Generics {
    public static void main(String[] args) {
        Printer<Integer> p = new Printer<>(2);
        Printer<Double> d = new Printer<>(33.5);
        System.out.println(p.getI());
        System.out.println(d.getI());

        ArrayList<Cat> c = new ArrayList<>();
        c.add(new Cat());
//        c.add(new Dog());  //error

        ArrayList<Object> o = new ArrayList<>();
        o.add(new Cat());
       Cat myCat = (Cat)o.get(0);

        System.out.println(shout(123,"54"));

        ArrayList<Cat> cc = new ArrayList<>();
        cc.add(new Cat());
        pppp(cc);

    }

    public static<T , V> T shout(T thing, V thing1){
        System.out.println("fu"+ thing);
        System.out.println("fu"+thing1);
        return thing;
    }
    public static void print(List<?> l){
        System.out.println("ggg"+l);
    }
    public static void pppp(List<? extends Animal> l){
        System.out.println("hhh"+l);
    }
}
