package ElecronicStore;

import java.util.ArrayList;
import java.util.List;

public class Items extends ShoppingCart{

    private int quantityOfProductSelected;
    private Product product;
    private List<Product> produces = new ArrayList<>();

    public void addProductToItems(int productId, String productName, int price, String productDescription){
        Product products = new Product();
        products.setProductId(productId);
        products.setProductName(productName);
        products.setPrice(price);
        products.setProductDescription(productDescription);
        produces.add(products);
    }

    public void removeProductFromItems(int productId){
        for(Product product : produces){
            if(product.getProductId() == productId){
                produces.remove(product);
            }
        }
    }

    public void setQuantityOfProductSelected(int quantityOfProductSelected) {
        this.quantityOfProductSelected = quantityOfProductSelected;
    }

    public int getQuantityOfProductSelected() {
        return quantityOfProductSelected;
    }

}
