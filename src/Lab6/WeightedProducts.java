package Lab6;

public class WeightedProducts extends Product{
    double weight;
    WeightedProducts(String id, String name, double price, double weight){
        super(id, name, price);
        this.weight = weight;
    }
    public double getNetPrice(){return weight*price;}
    public String toString(){ return super.toString()+"Weight: "+weight;}

}
