package ProblemsSolve;

public enum ProblemType {

    FINANCIAL("Financial"),
    SPIRITUAL("Spiritual"),
    EDUCATION("Education"),
    BUSINESS("Business"),
    TECHNICAL("Technical");

    private final String caseType;

    private ProblemType(String caseType) {
        this.caseType = caseType;
    }


    public String toString() {
        String caseType;
        switch (this) {
            case FINANCIAL: caseType = "Financial"; break;
            case SPIRITUAL: caseType = "Spiritual"; break;
            case EDUCATION: caseType = "Education"; break;
            case BUSINESS: caseType = "Business"; break;
            case TECHNICAL: caseType = "Technical"; break;
            default: throw new IllegalArgumentException("Unrecognized problem type: " + this);
        }
        return caseType;

    }
}
