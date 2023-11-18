package Week9_CollectionFrameWork.Labtask;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Cab> a = new ArrayList<>();
        Manager m = new Manager(a);

        a.add(new Cab("101",new Location(12),true));
        a.add(new Cab("102",new Location(22),true));
        a.add(new Cab("103",new Location(20),true));
        a.add(new Cab("104",new Location(28),true));
        a.add(new Cab("105",new Location(30),true));
        a.add(new Cab("106",new Location(18),true));

//        System.out.println(a);
//        Manager.print();
        System.out.print(m.findNearest(a, new Location(2)));

    }
}
