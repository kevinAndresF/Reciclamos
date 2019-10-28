package model;

public class Ressiduo{
    
    ///////////////////////////////////////////////////////////////////////////////////
    //                            Variable
    ///////////////////////////////////////////////////////////////////////////////////

    private String name;
    private String origin;
    private String color;
    private String information;
    private String identifier;
    private TimeDescompose timeDescompose;
    private Product product;

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Constants
    ///////////////////////////////////////////////////////////////////////////////////

    public static final String INDUSTRIAL = "Industrial";
    public static final String DOMICILIARY = "Domiliario";
    public static final String MUNICIPAL = "Municipal";
    public static final String BUILDING = "Construccion";
    public static final String HOSPITAL = "Hospital";

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Methods
    ///////////////////////////////////////////////////////////////////////////////////

    public Ressiduo(String name, String origin, String color, String information, String identifier, TimeDescompose timeDescompose, Product product){

        this.name = name;
        this.origin = origin;
        this.color = color;
        this.information = information;
        this.identifier = identifier;
        this.timeDescompose = timeDescompose;
        this.product = product;

    }

    public TimeDescompose getTimeDescompose(){
        return timeDescompose;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the information
     */
    public String getInformation() {
        return information;
    }

    /**
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

} 