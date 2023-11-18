package Practicee.CollectioFrameWork.ComparableAndComparator;

public class Emp implements Comparable<Emp>{
    private String name;
    private int Id;
    private int phone;

    @Override
    public int compareTo(Emp o) {
        return this.getId()-o.getId();
    }

    public Emp(String name, int id, int phone) {
        this.name = name;
        Id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", phone=" + phone +
                '}';
    }



}
