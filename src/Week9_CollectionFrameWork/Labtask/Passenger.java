package Week9_CollectionFrameWork.Labtask;

public class Passenger {
    private String name;
    private Location loc;

    public Passenger(String name, Location loc) {
        this.name = name;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }
}
