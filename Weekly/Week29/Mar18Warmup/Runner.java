package Week29.Mar18Warmup;
import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Food("apple", .75));
        items.add(new Food("Milk", 2.99));
        items.add(new Toy("Game", "ABC inc", 19.99));
        items.add(new Toy("Puzzle", "DEF inc", 15.99));
        for(Item i : items){
            System.out.println(i);
            System.out.println();
        }
    }
}

abstract class Item{
    private String name;
    private double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return "The price is: " + price;
    }
}

class Toy extends Item{
    String company;

    public Toy(String name, String company, double price){
        super(name, price);
        this.company = company;
        
    }
    public String toString(){
        return "This toy is a " + super.getName() + " and is made by  " +  company + "\n" + super.toString();
    }
}

class Food extends Item{
    public Food(String name, double price){
        super(name, price);
    }
    public String toString(){
        return "This food item is " + super.getName() + "\n" + super.toString();
    }
}