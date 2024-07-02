package ElecronicStore;

import java.util.ArrayList;
import java.util.List;

public class Customers extends Users {

    private BillingInformation billingInformation;
    private ShoppingCart shoppingCart;

    private List<BillingInformation> billingInformationList = new ArrayList<>();
    private List<ShoppingCart> shoppingCartList = new ArrayList<>();

    public void registerBillingInformation(String receiverName,String receiverPhonenumber,String receiverDeliveryAddress,CreditCardInformation creditCardInformation) {
        BillingInformation billingInformations = new BillingInformation();
        billingInformations.setReceiverName(receiverName);
        billingInformations.setReceiverPhonenumber(receiverPhonenumber);
        billingInformations.setReceiverDeliveryAddress(receiverDeliveryAddress);
        billingInformationList.add(billingInformations);
    }

    public void removeBillingInformation(BillingInformation billingInformation) {
        if (billingInformationList.contains(billingInformation)) {
            billingInformationList.remove(billingInformation);
        }
    }

    public void addShoppingCart(Items items) {
        ShoppingCart shoppings = new ShoppingCart();
        shoppings.addItemToShoppingCart(items);
        shoppingCartList.add(shoppings);
    }

    public void removeShoppingCart(ShoppingCart shoppingCart) {
        if (shoppingCartList.contains(shoppingCart)) {
            shoppingCartList.remove(shoppingCart);
        }
    }

}
