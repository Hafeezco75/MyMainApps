package ElecronicStore;

import java.util.ArrayList;
import java.util.List;

import static ElecronicStore.ProductCategory.*;

public class Product extends Items {

    private int productId;
    private String productName;
    private int price;
    private String productDescription;
    private ProductCategory productCategory;
    private List<ProductCategory> productCategories = new ArrayList<>();

    public void addProductCategoryToProduct(ProductCategory productCategory) {
        productCategories.add(productCategory);
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduct_description() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

}
