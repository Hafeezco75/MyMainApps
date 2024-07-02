package ElecronicStore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BillingInformation extends Customers {

    private String receiverName;
    private String receiverPhonenumber;
    private String receiverDeliveryAddress;
    private CreditCardInformation creditCardInformation;
    private List<CreditCardInformation> creditCardInformationList = new ArrayList<>();


    public void addCreditCardInformation(int cardCvv, LocalDate cardExpirationYear, LocalDate cardExpirationMonth, Long creditCardNumber, String nameOnCard,CardType cardType) {
        CreditCardInformation creditCard = new CreditCardInformation(cardCvv,cardExpirationYear,cardExpirationMonth,creditCardNumber,nameOnCard,cardType);
        creditCard.setCardCvv(cardCvv);
        creditCard.setCardExpirationYear(cardExpirationYear);
        creditCard.setCardExpirationMonth(cardExpirationMonth);
        creditCard.setCreditCardNumber(creditCardNumber);
        creditCard.setNameOnCard(nameOnCard);
        creditCard.setCardType(cardType);
        creditCardInformationList.add(creditCard);
    }

    public void removeCreditCardInformation(int cardCvv) {
        for (CreditCardInformation creditCard : creditCardInformationList) {
            if (creditCard.getCardCvv() == cardCvv) {
                creditCardInformationList.remove(creditCard);
            }
        }
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverPhonenumber(String receiverPhonenumber) {
        this.receiverPhonenumber = receiverPhonenumber;
    }

    public void setReceiverDeliveryAddress(String receiverDeliveryAddress) {
        this.receiverDeliveryAddress = receiverDeliveryAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverPhonenumber() {
        return receiverPhonenumber;
    }

    public String getReceiverDeliveryAddress() {
        return receiverDeliveryAddress;
    }

    public CreditCardInformation getCreditcardInformation() {
        return creditCardInformation;
    }


}
