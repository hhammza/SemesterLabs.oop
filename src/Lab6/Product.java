package Lab6;

public abstract class Product {
    String id;
    String name;
    double price;

    Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId(){ return id;}
    public void setId(String id){ this.id = id;}
    public String getName(){return name;}
    public void setName(String name){ this.name = name;}
    public double getPrice(){ return price;}
    public abstract double getNetPrice();

    public String toString(){
        return String.format("ID: "+id+"Name: "+name+"Price: "+price);
    }
    public boolean equals(Object o){
        Product p = (WeightedProducts) o;
        return p.id.equals(this.id);
    }

}