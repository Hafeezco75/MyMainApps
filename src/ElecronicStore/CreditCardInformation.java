package ElecronicStore;

import java.time.LocalDate;

public class CreditCardInformation extends BillingInformation {

    private int cardCvv;
    private LocalDate cardExpirationYear;
    private LocalDate cardExpirationMonth;
    private Long creditCardNumber;
    private String nameOnCard;
    private CardType cardType;

    public CreditCardInformation(int cardCvv,LocalDate cardExpirationYear,LocalDate cardExpirationMonth, Long creditCardNumber, String nameOnCard, CardType cardType) {
        this.cardCvv = cardCvv;
        this.cardExpirationYear = cardExpirationYear;
        this.cardExpirationMonth = cardExpirationMonth;
        this.creditCardNumber = creditCardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }

    public int getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(int cardCvv) {
        this.cardCvv = cardCvv;
    }

    public LocalDate getCardExpirationYear() {
        return cardExpirationYear;
    }

    public void setCardExpirationYear(LocalDate cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }

    public LocalDate getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    public void setCardExpirationMonth(LocalDate cardExpirationMonth) {
        this.cardExpirationMonth = cardExpirationMonth;
    }

    public Long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(Long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }



}
