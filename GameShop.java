import game.inventory.Item;
import game.inventory.Inventory;
public class GameShop {
    public static void main(String[] args){
        // creating inventory object
        Inventory shop = new Inventory();
        // creating game items
        Item i1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item i2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item i3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");
        // adding items to inventory
        shop.addItem(i1);
        shop.addItem(i2);
        shop.addItem(i3);
        // displaying inventory
        shop.displayAll();
        System.out.println();
        // selling some copies
        i1.sell(4);
        i2.sell(6);
        System.out.println();
        // displaying updated inventory
        shop.displayAll();
        System.out.println();
        // auditing serial codes
        shop.auditSerialCodes();
        // System.out.println(i1.getSerialCode());
        // This fails because getSerialCode() is package-private.
    }
}
