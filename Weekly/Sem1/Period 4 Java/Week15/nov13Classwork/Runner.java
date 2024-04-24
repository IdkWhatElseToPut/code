package Week15.nov13Classwork;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Item[] myItems = new Item[10];
        myItems[0] = new Item("book", 9.99);
        myItems[1] = new Item("potato", 1.22);
        myItems[2] = new Item("keyboard", 150.00);
        myItems[3] = new Item("pen", .99);
        myItems[4] = new Item("phone", 1000.00);
        myItems[5] = new Item("shoes", 100.00);
        myItems[6] = new Item("computer", 3000.00);
        myItems[7] = new Item("wallet", 20.00);
        myItems[8] = new Item("toothbrush", 2.00);
        myItems[9] = new Item("backpack", 30.00);

        Scanner scan = new Scanner(System.in);

        int input;
        do {
            System.out.println("1. Print all items, 2. Find items by price, 3. Find items by name, 4. Exit");
            input = scan.nextInt();

            switch (input) {
                case 1:
                    for (int i=0; i<myItems.length; i++) {
                        String txt = myItems[i].toString();
                        System.out.println(txt);
                    }
                    break;
                case 2:
                    System.out.println("Enter a price: ");
                    double searchPrice = scan.nextDouble();
                    for (int i=0; i<myItems.length; i++) {
                        if (searchPrice == myItems[i].getPrice()) {
                            System.out.println(myItems[i].toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter a product name: ");
                    String searchName = scan.next();
                    for (int i=0; i<myItems.length; i++) {
                        if (searchName.equals(myItems[i].getName())) {
                            System.out.println(myItems[i].toString());
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please enter 1, 2, 3, or 4.");
            }
        } while (input != 4);
    }
}
