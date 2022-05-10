package Chapter12.Exercise18;

public class Item {
    private static int uid = 1000;
    private int id; // stock number
    private String name;
    private int quantity; // stock amount

    public Item(String name) {
        this.id = uid;
        this.name = name;
        uid++;
    }

    public Item(String name, int initialQuantity) {
        this.id = uid;
        this.name = name;
        this.quantity = initialQuantity;
        uid++;
    }

    public int getStockNumber() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
