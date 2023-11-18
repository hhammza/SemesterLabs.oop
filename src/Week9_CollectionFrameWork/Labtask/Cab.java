package Week9_CollectionFrameWork.Labtask;

public class Cab<T> {
    private String id;
    private Location location;
    private boolean availability;

    Cab(){

    }

    public Cab(String id, Location location, boolean availability) {
        this.id = id;
        this.location = location;
        this.availability = availability;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "id='" + id + '\'' +
                ", location=" + location +
                ", availability=" + availability +
                '}';
    }
}
