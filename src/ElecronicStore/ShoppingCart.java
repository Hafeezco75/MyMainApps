package ElecronicStore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart extends Customers{
    private Items items;

    private List<Items> itemsList = new ArrayList<>();


    public void addItemToShoppingCart(Items items) {
        Items itemsLength = new Items();
        itemsLength.setQuantityOfProductSelected(items.getQuantityOfProductSelected());
        itemsList.add(itemsLength);
    }

}
