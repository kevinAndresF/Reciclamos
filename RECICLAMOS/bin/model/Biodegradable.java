package model;

public class Biodegradable extends Ressiduo{

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Variable
    ///////////////////////////////////////////////////////////////////////////////////

    private boolean composting;

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Methods
    ///////////////////////////////////////////////////////////////////////////////////

    public Biodegradable(String name, String origin, String color, String information, String identifier, TimeDescompose timeDescompose, Product product, boolean composting){

        super(name, origin, color, information, identifier, timeDescompose, product);
        this.composting = composting;

    }

    public boolean getComposting(){
        return composting;
    }
    
}