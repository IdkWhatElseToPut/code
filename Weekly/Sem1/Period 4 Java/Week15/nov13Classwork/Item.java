package Week15.nov13Classwork;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        String str = name  + " : " + price;
	    return str;
    }

}
