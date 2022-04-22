package Chapter10.Exercise16;

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
        
    }

    public static void main(String...args) {
        new InventoryApp().runApp();
    }
}
