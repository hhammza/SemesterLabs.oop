package Lab6;

public class CountedProduct extends Product{
    int count;

    public CountedProduct(String id, String name, double price, int count){
        super(id, name, price);
        this.count = count;
    }
    public double getNetPrice(){ return count*price;}
    public String toString(){
        return super.toString()+"Count: "+count;
    }
}
