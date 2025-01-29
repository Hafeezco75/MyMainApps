package Reflection;

public enum GeoZones {
    North_Central("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NorthEast("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NorthWest("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SouthEast("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SouthSouth("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SouthWest("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");


    private final String zones = "";


    GeoZones (String... Zones){
    }

    @Override
    public String toString() {
        return zones;
    }

}
