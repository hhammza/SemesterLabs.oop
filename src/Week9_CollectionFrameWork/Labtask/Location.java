package Week9_CollectionFrameWork.Labtask;

public class Location {
   private int distance;

    public Location(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Location{" +
                "distance=" + distance +
                '}';
    }
}
