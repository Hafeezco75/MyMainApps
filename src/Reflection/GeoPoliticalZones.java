package Reflection;

public enum GeoPoliticalZones {


    North_Central("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NorthEast("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NorthWest("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SouthEast("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SouthSouth("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SouthWest("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");


    private String politicalZones = "";


    GeoPoliticalZones (String politicalZones){
        this.politicalZones = politicalZones;
    }


    GeoPoliticalZones(String benue, String fct, String kogi, String kwara, String nasarawa, String niger, String plateau) {
    }

    GeoPoliticalZones(String adamawa, String bauchi, String borno, String gombe, String taraba, String yobe) {
    }

    GeoPoliticalZones(String abia, String anambra, String ebonyi, String enugu, String imo) {
    }


    public final String getPoliticalZones() {
        return politicalZones;
    }


    public String toString() {
        String politicalZones = "";
        switch (this) {
            case North_Central: getPoliticalZones(); break;
            case NorthEast: getPoliticalZones(); break;
            case NorthWest: getPoliticalZones(); break;
            case SouthEast: getPoliticalZones(); break;
            case SouthSouth: getPoliticalZones(); break;
            case SouthWest: getPoliticalZones(); break;
            default: throw new IllegalArgumentException("Invalid political zone" + this);
        }
        return politicalZones;
    }


}
