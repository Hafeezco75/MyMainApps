package ElecronicStore;

public enum CardType {

    MASTERCARD("MasterCard"),
    VISACARD("VisaCard"),
    VERVE("Verve"),
    AMERICA_EXPRESS("America Express");

    private final String cardVersions;

    private CardType(String cardVersions) {
        this.cardVersions = cardVersions;
    }


    public String toString() {
        String cardVersions;
        switch (this) {
            case MASTERCARD: cardVersions = "MasterCard"; break;
            case VISACARD: cardVersions = "VisaCard"; break;
            case VERVE: cardVersions = "Verve"; break;
            case AMERICA_EXPRESS: cardVersions = "America Express"; break;
            default: throw new IllegalArgumentException("Invalid card version: " + this);
        }
        return cardVersions;
    }


}
