package manager;
import model.ClothingItem;
import java.util.List;
public class InventoryManager {
    private Manager<ClothingItem> inventory = new Manager<>();

    public void addStock(ClothingItem item){
        inventory.add(item);
    }
    public ClothingItem getItemById(String id) {
        List<ClothingItem> found = inventory.find(i -> i.getId().equals(id));
        return found.isEmpty() ? null : found.get(0);
    }

    public boolean checkStock(String itemId, int requiredQty) {
        ClothingItem item = getItemById(itemId);
        return item != null && item.getQuantity() >= requiredQty;
    }

    public boolean removeStock(String itemId, int qty) {
        ClothingItem item = getItemById(itemId);
        if (item != null && item.getQuantity() >= qty) {
            item.setQuantity(item.getQuantity() - qty);
            return true;
        }
        return false;
    }

    public void restoreStock(String itemId, int qty) {
        ClothingItem item = getItemById(itemId);
        if (item != null) {
            item.setQuantity(item.getQuantity() + qty);
        }
    }

    public void displayInventory() {
        System.out.println("\n--- DANH SÁCH TỒN KHO HỆ THỐNG ---");
        for (ClothingItem item : inventory.getAll()) {
            item.displayInfo();
        }
    }

    public List<ClothingItem> getAllItems() {
        return inventory.getAll();
    }
}

