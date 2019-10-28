package model;

public class Inert extends Ressiduo{

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Variable
    ///////////////////////////////////////////////////////////////////////////////////

    private String tips;

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Methods
    ///////////////////////////////////////////////////////////////////////////////////

    public Inert(String name, String origin, String color, String information, String identifier, TimeDescompose timeDescompose, Product product, String tips){

        super(name, origin, color, information, identifier, timeDescompose, product);
        this.tips = tips;

    }

    /**
     * @return the tips
     */
    public String getTips() {
        return tips;
    }
    
    
}