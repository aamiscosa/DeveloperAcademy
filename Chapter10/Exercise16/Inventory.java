package Chapter10.Exercise16;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> itemList;
    
    public Inventory() {
        itemList = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        return itemList.add(item);
    }

    public void discontinueItem(Item item) {
        item.setName("discontinued");
        item.setQuantity(0);
    }

    public Item findItem(int stockNumber) {
        return itemList.stream().filter(e -> e.getStockNumber() == stockNumber).findFirst().get();
    }
}
