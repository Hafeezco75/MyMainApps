package ElecronicStore;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Users {

    private final List<Product> productList = new ArrayList<Product>();

    public void addProduct(int productId,String productName, int price, String productDescription){
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);
        product.setProductDescription(productDescription);
        product.setProductCategory(product.getProductCategory());
        productList.add(product);
    }

    public void removeProduct(int productId){
        for(Product product : productList){
            if(product.getProductId() == productId){
                productList.remove(product);
            }
        }
    }

}
