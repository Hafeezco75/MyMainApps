package ElecronicStore;

public enum ProductCategory {

    ELECTRONICS("Electronics"),
    GROCERIES("Groceries"),
    UTENSILS("Utensils"),
    CLOTHING("Clothing");

    private final String produce;

    private ProductCategory(String produce) {
        this.produce = produce;
    }

    public String toString() {
        String produce;
        switch (this) {
            case ELECTRONICS: produce = "Electronics"; break;
            case GROCERIES: produce = "Groceries"; break;
            case UTENSILS: produce = "Utensils"; break;
            case CLOTHING: produce = "Clothing"; break;
            default: throw new IllegalArgumentException("Unrecognized product category: " + this);
        }
        return produce;
    }
}
