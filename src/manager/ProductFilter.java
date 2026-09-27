package manager;

import model.ClothingItem;
import java.util.List;
import java.util.function.Predicate;

public class ProductFilter {
    public List<ClothingItem> filter(List<ClothingItem> products, Predicate<ClothingItem> condition) {
        return products.stream().filter(condition).toList();
    }
}
