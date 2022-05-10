package Chapter12.Exercise18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InventoryApp {
    private Scanner scanner = new Scanner(System.in);
    private Inventory inventory;

    public InventoryApp() {
        initInventory();
        runApp();
    }

    private void initInventory() {
        inventory = new Inventory();
        inventory.addItem(new Item("Basketball", 50));
        inventory.addItem(new Item("Mountain Bike", 10));
        inventory.addItem(new Item("Scuba Gear", 20));
        inventory.addItem(new Item("Camping Tent", 25));
    }
    
    private void runApp() {
        clearScreen();
        displayPrompt();
        int prompt = displayInputPrompt("Enter input: ");
        doAction(prompt);
    }

    private void displayPrompt() {
        System.out.println("-".repeat(30));
        System.out.println("Select Option:");
        System.out.println("-".repeat(30));
        System.out.println("1. Add Item");
        System.out.println("2. Discontinue Item");
        System.out.println("3. Display Item Stock");
        System.out.println("-".repeat(30));
        System.out.println("0. Exit Application");
        System.out.println("-".repeat(30));
    }

    private int displayInputPrompt(String promptMessage) {
        System.out.printf("> %s ", promptMessage);

        int response = -1;
        
        try {
            response = scanner.nextInt();
            
            if(response < 0) {
                System.out.printf("%s\n", "You have entered an invalid input.");
                System.out.printf("%s\n", "Please try again");
                pressAnyKey(scanner);
            }
        } catch(InputMismatchException e) {
            System.out.printf("%s\n", "You have entered an invalid input.");
            System.out.printf("%s\n", "Please try again");
            pressAnyKey(scanner);
        }
        
        return response;
    }

    private void doAction(int action) {
        switch(action) {
            case 1: showAddItemPrompt(); break;
            case 2: showDiscontinueItemPrompt(); break;
            case 3: showDisplayItemStockPrompt(); break;
        }
    }

    private void showAddItemPrompt() {
        clearScreen();
        System.out.println("-".repeat(30));
        System.out.println("Add Item");
        System.out.println("-".repeat(30));
        System.out.print("Item Name: ");
        String name = scanner.next();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        Item item = new Item(name, quantity);
        clearScreen();
        if(inventory.addItem(item)) {
            System.out.printf("Item [%s] %s has been added with initial quantity of %s to the inventory.\n", item.getStockNumber(), item.getName(), item.getQuantity());
        }
        pressAnyKey(scanner);
    }

    private void showDiscontinueItemPrompt() {
        clearScreen();
        System.out.println("-".repeat(30));
        System.out.println("Discontinue Item");
        System.out.println("-".repeat(30));
        System.out.print("Enter Stock #: ");
        int stockNumber = scanner.nextInt();
        Item item = inventory.findItem(stockNumber);

        clearScreen();
        System.out.printf("Do you wish to disable Item [%s] %s? [Y/n]: ", item.getStockNumber(), item.getName());
        if(scanner.next().equalsIgnoreCase("y")) {
            String outputMessage = String.format("Item [%s] %s has been added disabled.\n", item.getStockNumber(), item.getName());
            inventory.discontinueItem(item);
            clearScreen();
            System.out.print(outputMessage);
        }
        else {
            clearScreen();
        }

        pressAnyKey(scanner);

    }

    private void showDisplayItemStockPrompt() {
        
    }





























    private void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private void pressAnyKey(Scanner scanner) {
        try{
            System.out.print("Press [Enter] to continue...");
            System.in.read();
            scanner.nextLine();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String...args) {
        new InventoryApp().runApp();
    }
}
