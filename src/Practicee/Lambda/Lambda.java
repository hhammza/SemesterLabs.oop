package Practicee.Lambda;

interface Printable{
    void print();
}

interface Printable1{
    void print(String ss);
}

interface Printable2{
    String p(String s, int i);
}

class Cat implements Printable{
    @Override
    public void print(){
        System.out.println("Meow");
    }
}
class Cat1 implements Printable1{
    @Override
    public void print(String s){
        System.out.println("Meow");
    }
}
class Cat2 implements Printable2{
    @Override
    public String p(String s, int i) {
        return "ppp";
    }
}
public class Lambda {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.print();
        printThings(myCat);
        Printable p = new Cat();
        printThings(p);

        Printable pp = new Printable() {
            @Override
            public void print() {
                System.out.println("Meow  Meow");
            }
        };
        myCat.print();
        printThings(p);
        printThings(pp);

        Printable lambda = () -> System.out.println("Meeeeeee");
        printThings(lambda);
        printThings(() -> System.out.println("MeowMeowMeow"));

        Printable1 l = (s) -> System.out.println("Moooo " +s);
        printTh(l);
        printTh((s) -> System.out.println("Mooooooooooo "+s));

        Printable2 ll = (s,i) -> {
            System.out.print("mmmm\t");
            return "aaa " + s +" "+i;
        };
        String s = pp(ll);
        System.out.println(s);

        String ppp = pp((ss,i) -> {
            System.out.print("sssss\t");
            return ""+ss+" "+i;
        });
        System.out.println(ppp);

    }

    static void printThings(Printable p){
        p.print();
    }
    static void printTh(Printable1 p){
        p.print("!");
    }
    static String pp(Printable2 p){
        return p.p("jjj",8);
    }
}
