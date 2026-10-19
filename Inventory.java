package game.inventory;

public class Inventory {
    // storing inventory items
    private Item [] items;
    private int count;
    // constructor for inventory
    public Inventory() {
        items = new Item[10];
        count = 0;
    }
    // adding item into inventory
    public void addItem(Item item){
        items[count] = item;
        count++;
    }
    // displaying all inventory items
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++){
            System.out.printf("%-15s | %-10s | Stock: %d\n",
                    items[i].getName(),
                    items[i].getGenre(),
                    items[i].getStockCount());
        }
    }
    // displaying serial codes for auditing
    public void auditSerialCodes(){
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++){
            System.out.println(items[i].getName() + " -> " + items[i].getSerialCode());
        }
    }
}
