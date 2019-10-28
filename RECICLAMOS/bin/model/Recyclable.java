package model;

public class Recyclable extends Ressiduo{

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Variable
    ///////////////////////////////////////////////////////////////////////////////////

    private String typeRecyclable;
    private String descriptionForIndustry;
    private String descriptionForHome;

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Constant
    ///////////////////////////////////////////////////////////////////////////////////

    public static final String PAPER = "Papel";
    public static final String GLASS = "Vidrio";
    public static final String PAPERBOARD = "Carton";
    public static final String PLASTIC = "Plastico";
    public static final String METAL = "Metal";


    ///////////////////////////////////////////////////////////////////////////////////
    //                            Methods
    ///////////////////////////////////////////////////////////////////////////////////

    public Recyclable(String name, String origin, String color, String information, String identifier,TimeDescompose timeDescompose, Product product, String typeRecyclable, String descriptionForIndustry, String descriptionForHome){

        super(name, origin, color, information, identifier, timeDescompose, product);
        this.typeRecyclable = typeRecyclable;
        this.descriptionForIndustry = descriptionForIndustry;
        this.descriptionForHome = descriptionForHome;

    }

    /**
     * @return the typeRecyclable
     */
    public String getTypeRecyclable() {
        return typeRecyclable;
    }

    /**
     * @return the descriptionForIndustry
     */
    public String getDescriptionForIndustry() {
        return descriptionForIndustry;
    }

    /**
     * @return the descriptionForHome
     */
    public String getDescriptionForHome() {
        return descriptionForHome;
    }
    
}