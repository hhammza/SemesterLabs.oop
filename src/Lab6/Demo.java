package Lab6;

public class Demo {
    public static void main(String[] args){
        InventoryManagement i = new InventoryManagement(100);
        i.add(new WeightedProducts("1", "p1", 12, 10.0));
        i.add(new CountedProduct("2", "cp1", 20, 12));

        i.displayList();

        //i.remove(new WeightedProducts("1", "p1", 12, 10.0));
        //i.displayList();
    }
}
