package Week9_CollectionFrameWork.Labtask;

import java.util.ArrayList;
import java.util.Collections;

public class Manager {

    Cab c = new Cab();
    static ArrayList<Cab> a;

    Manager(ArrayList a){
        this.a = a;
    }

    public Cab findNearest(ArrayList<Cab> aa,Location p){
        Cab nearest = null;
        double minDistance = 500;
        for(Cab cab: aa){
            if(cab.getLocation() != null){
               double d = Math.sqrt(Math.pow((cab.getLocation().getDistance()-p.getDistance()),2)+Math.pow((cab.getLocation().getDistance()-p.getDistance()),2));
//                System.out.print(d +"    ");
//                System.out.println();
               if(d<minDistance) {
                   minDistance = d;
                   nearest = cab;
               }
            }
        }
        return nearest;
    }

//    public Cab findNearest(ArrayList<Cab> aa, Location p) {
//        Cab nearest = null;
//        double minDistance = Double.MAX_VALUE; // Initialize with a large value
//        for (Cab cab : aa) {
//            if (cab.getLocation() != null) {
//                double dx = cab.getLocation().getDistance() - p.getDistance();
//                double dy = cab.getLocation().getDistance() - p.getDistance();
//                double d = Math.sqrt(dx * dx + dy * dy);
//                System.out.print(d + "    ");
//                System.out.println();
//                if (d < minDistance) {
//                    minDistance = d;
//                    nearest = cab;
//                }
//            }
//        }
//        return nearest;
//    }


    public ArrayList sort(ArrayList a){
        Collections.sort(a);
        return a;
    }

    public static void print(){
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "c=" + c +
                '}';
    }
}
