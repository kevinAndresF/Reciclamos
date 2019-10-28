package model;

import java.util.ArrayList;

public class Product{

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Variable
    ///////////////////////////////////////////////////////////////////////////////////

    private ArrayList<String> listResiduo;

    private String name;
    private String identifier;
    private String description;


    ///////////////////////////////////////////////////////////////////////////////////
    //                            Methods
    ///////////////////////////////////////////////////////////////////////////////////

    public Product(ArrayList listResiduo, String name, String identifier, String description){

        this.listResiduo = listResiduo;
        this.name = name;
        this.identifier = identifier;
        this.description = description;

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return the listResiduo
     */
    public ArrayList<String> getListResiduo() {
        return listResiduo;
    }
}