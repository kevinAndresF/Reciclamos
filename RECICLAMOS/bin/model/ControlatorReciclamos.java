package model;

import java.util.ArrayList;

public class ControlatorReciclamos{
    
    ///////////////////////////////////////////////////////////////////////////////////
    //                            Variable
    ///////////////////////////////////////////////////////////////////////////////////

    private ArrayList<Product> listProduct;
    private ArrayList<Ressiduo> listRessiduo;

    ///////////////////////////////////////////////////////////////////////////////////
    //                            Methods
    ///////////////////////////////////////////////////////////////////////////////////

    public void listProduct(Product product){

        listProduct.add(product);

    }

    public boolean checkIdentifier(String identifier){

        boolean information = true;

        for(int i = 0 ; i <= listRessiduo.size() ; i++){

            String identifierCheck = listRessiduo.get(i).getIdentifier();

            if( identifierCheck == identifier){

                information = false;
                i+=listRessiduo.size();

            }


        }

        return information;

    }

    public boolean checkName(String name){

        boolean information = true;

        for(int i = 0 ; i <= listRessiduo.size() ; i++){

            String nameCheck = listRessiduo.get(i).getName();

            if( nameCheck == name){

                information = false;
                i+=listRessiduo.size();

            }


        }

        return information;

    }

    public String createResiduoBiodegradable(String name, String origin, String color, String information, String identifier, TimeDescompose timeDescompose, Product product, boolean composting){

        information = "No se creado el residuo biodegradable./n";

        if (checkIdentifier(identifier) == true && checkName(name)== true ){

            Ressiduo bio  = new Biodegradable(name, origin, color, information, identifier, timeDescompose, product, composting);

            listRessiduo.add(bio);

            information = "Se creado el residuo biodegradable./n";

        }

        return information;

    }

    public String createResiduoRecyclable(String name, String origin, String color, String information, String identifier,TimeDescompose timeDescompose, Product product, String typeRecyclable, String descriptionForIndustry, String descriptionForHome){

        information = "No se creado el residuo reciclable./n";

        if (checkIdentifier(identifier) == true && checkName(name)== true ){

            Ressiduo rec  = new Recyclable(name, origin, color, information, identifier, timeDescompose, product, typeRecyclable, descriptionForIndustry, descriptionForHome);

            listRessiduo.add(rec);

            information = "Se creado el residuo reciclable./n";
 
        }

        return information;

    }

    public String createResiduoInert(String name, String origin, String color, String information, String identifier, TimeDescompose timeDescompose, Product product, String tips){

        information = "No se creado el residuo inerte./n";

        if (checkIdentifier(identifier) == true && checkName(name) == true ){

            Ressiduo ine  = new Inert(name, origin, color, information, identifier, timeDescompose, product, tips);

            listRessiduo.add(ine);

            information = "Se creado el residuo inerte./n";
 
        }

        return information;

    }

    public String getInformationForName(String name){

        String informacion = "";
        

        for(int i =0; i<=listRessiduo.size();i++){
            String nameHelper =  listRessiduo.get(i).getName();
            if( name == nameHelper){

                if (listRessiduo.get(i) instanceof Inert){
                    
                    informacion = "El nombre del residuo es: "+name+
                    "/nOrigen: "+listRessiduo.get(i).getOrigin()+
                    "/nColor: "+listRessiduo.get(i).getColor()+
                    "/nInformacion"+listRessiduo.get(i).getInformation()+
                    "/nIdentificador"+listRessiduo.get(i).getIdentifier()+
                    "/nTiempo descomposicion: "+"/nDias: "+listRessiduo.get(i).getTimeDescompose().getDay()+
                    "/nMeses: "+listRessiduo.get(i).getTimeDescompose().getMonth()+
                    "/nAños: "+listRessiduo.get(i).getTimeDescompose().getYears();

                    Inert helper2 = (Inert) listRessiduo.get(i);

                    informacion = informacion+"tips: "+helper2.getTips();

                    
                }

                else if (listRessiduo.get(i) instanceof Recyclable){
                    
                    informacion = "El nombre del residuo es: "+name+
                    "/nOrigen: "+listRessiduo.get(i).getOrigin()+
                    "/nColor: "+listRessiduo.get(i).getColor()+
                    "/nInformacion"+listRessiduo.get(i).getInformation()+
                    "/nIdentificador"+listRessiduo.get(i).getIdentifier()+
                    "/nTiempo descomposicion: "+"/nDias: "+listRessiduo.get(i).getTimeDescompose().getDay()+
                    "/nMeses: "+listRessiduo.get(i).getTimeDescompose().getMonth()+
                    "/nAños: "+listRessiduo.get(i).getTimeDescompose().getYears();

                    Recyclable helper2 = (Recyclable) listRessiduo.get(i);

                    informacion = informacion+"/nTipo: "+helper2.getTypeRecyclable()+
                    "/nDescripcion de la industria: "+helper2.getDescriptionForIndustry()+
                    "/nDescripcion de la casa: "+helper2.getDescriptionForHome();

                    
                }

                else if (listRessiduo.get(i) instanceof Biodegradable){

                    String composting = "No apto para el compostage";
                    
                    informacion = "El nombre del residuo es: "+name+
                    "/nOrigen: "+listRessiduo.get(i).getOrigin()+
                    "/nColor: "+listRessiduo.get(i).getColor()+
                    "/nInformacion"+listRessiduo.get(i).getInformation()+
                    "/nIdentificador"+listRessiduo.get(i).getIdentifier()+
                    "/nTiempo descomposicion: "+"/nDias: "+listRessiduo.get(i).getTimeDescompose().getDay()+
                    "/nMeses: "+listRessiduo.get(i).getTimeDescompose().getMonth()+
                    "/nAños: "+listRessiduo.get(i).getTimeDescompose().getYears();

                    Biodegradable helper2 = (Biodegradable) listRessiduo.get(i);

                    if(helper2.getComposting() == true ){

                        composting = "Apto para el compostage";

                    }

                    informacion = informacion+"/nTipo: "+composting;

                    
                }

            }
            
        }

        return informacion;

    }

    public String getProducts(){

        String information = "";

        for(int i = 0 ; i<=listProduct.size(); i++){

            information = information+"/nNombre del producto: "+listProduct.get(i).getName()+
            "/nIdentificador del producto: "+listProduct.get(i).getIdentifier()+
            "/nDesscription del producto: "+listProduct.get(i).getDescription();

            for(int i1 = 0 ; i1 <= listProduct.get(i).getListResiduo().size(); i1++){

                information = information+"Reciduo generado: "+listProduct.get(i).getListResiduo().get(i1);

            }


        }

        return information;

    }

    public void addResiduoToProduct(String identifier, String name){

        for(int i = 0 ; i<=listProduct.size(); i++){

            if(listProduct.get(i).getIdentifier() == identifier){

                listProduct.get(i).getListResiduo().add(name);

            }

        }

    }

    public String createProduct(ArrayList listResiduo, String name, String identifier, String description){

        String menssage = "No se creo producto";

        boolean information = true;

        for(int i = 0 ; i <= listProduct.size() ; i++){

            String identifierCheck = listProduct.get(i).getIdentifier();

            if( identifierCheck == identifier){

                information = false;
                i+=listProduct.size();

            }


        }
        
        if(information == true){

            Product productNew = new Product(listResiduo, name, identifier, description);

            listProduct.add(productNew);

            menssage = "Se creo producto";

        }
        return menssage;
    }

    public String informationAll(){

        String informacion = "";
        

        for(int i =0; i<=listRessiduo.size();i++){

                if (listRessiduo.get(i) instanceof Inert){
                    
                    informacion = "El nombre del residuo es: "+listRessiduo.get(i).getName()+
                    "/nOrigen: "+listRessiduo.get(i).getOrigin()+
                    "/nColor: "+listRessiduo.get(i).getColor()+
                    "/nInformacion"+listRessiduo.get(i).getInformation()+
                    "/nIdentificador"+listRessiduo.get(i).getIdentifier()+
                    "/nTiempo descomposicion: "+"/nDias: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getDay())+
                    "/nMeses: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getMonth())+
                    "/nAños: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getYears());

                    Inert helper2 = (Inert) listRessiduo.get(i);

                    informacion = informacion+"tips: "+helper2.getTips();

                    
                }

                else if (listRessiduo.get(i) instanceof Recyclable){
                    
                    informacion = "El nombre del residuo es: "+listRessiduo.get(i).getName()+
                    "/nOrigen: "+listRessiduo.get(i).getOrigin()+
                    "/nColor: "+listRessiduo.get(i).getColor()+
                    "/nInformacion"+listRessiduo.get(i).getInformation()+
                    "/nIdentificador"+listRessiduo.get(i).getIdentifier()+
                    "/nTiempo descomposicion: "+"/nDias: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getDay())+
                    "/nMeses: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getMonth())+
                    "/nAños: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getYears());

                    Recyclable helper2 = (Recyclable) listRessiduo.get(i);

                    informacion = informacion+"/nTipo: "+helper2.getTypeRecyclable()+
                    "/nDescripcion de la industria: "+helper2.getDescriptionForIndustry()+
                    "/nDescripcion de la casa: "+helper2.getDescriptionForHome();

                    
                }

                else{

                    String composting = "No apto para el compostage";
                    
                    informacion = "El nombre del residuo es: "+listRessiduo.get(i).getName()+
                    "/nOrigen: "+listRessiduo.get(i).getOrigin()+
                    "/nColor: "+listRessiduo.get(i).getColor()+
                    "/nInformacion"+listRessiduo.get(i).getInformation()+
                    "/nIdentificador"+listRessiduo.get(i).getIdentifier()+
                    "/nTiempo descomposicion: "+"/nDias: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getDay())+
                    "/nMeses: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getMonth())+
                    "/nAños: "+String.valueOf(listRessiduo.get(i).getTimeDescompose().getYears());

                    Biodegradable helper2 = (Biodegradable) listRessiduo.get(i);

                    if(helper2.getComposting()== true ){

                        composting = "Apto para el compostage";

                    }

                    informacion = informacion+"/nTipo: "+composting;
                }
            }

            return informacion;
    }

    public String effectHarmfulRessiduo(String name){

        String information = "";
        int day;
        int month;
        int years;
        int daysAll;
        int effectN = 0;


        for(int i = 0 ; i <= listRessiduo.size(); i++){

            String nameHelper = listRessiduo.get(i).getName();

            if ( name == nameHelper){

                if(listRessiduo.get(i).getOrigin() == "Industrial" ){

                    day = listRessiduo.get(i).getTimeDescompose().getDay();
                    month = listRessiduo.get(i).getTimeDescompose().getMonth();
                    years = listRessiduo.get(i).getTimeDescompose().getYears();

                    daysAll = day + (30*month) + (365 * years);
                    
                    
                    effectN = daysAll * (10/100);
                    
                    if(listRessiduo.get(i) instanceof Recyclable){

                        effectN = effectN - daysAll * (2/100);
                    }

                    else if(listRessiduo.get(i) instanceof Biodegradable){

                        Biodegradable helperN = (Biodegradable) listRessiduo.get(i);

                        if(helperN.getComposting() == true ){

                            effectN = effectN - daysAll * (1/100);

                        }
                    
                    }

                }

                else if(listRessiduo.get(i).getOrigin() == "Domiliario" ){

                    day = listRessiduo.get(i).getTimeDescompose().getDay();
                    month = listRessiduo.get(i).getTimeDescompose().getMonth();
                    years = listRessiduo.get(i).getTimeDescompose().getYears();

                    daysAll = day + (30*month) + (365 * years);
                    
                    effectN = daysAll * (5/100); 
                    
                    if(listRessiduo.get(i) instanceof Recyclable){

                        effectN = effectN - daysAll * (2/100);
                    }

                    else if(listRessiduo.get(i) instanceof Biodegradable){

                        Biodegradable helperN = (Biodegradable) listRessiduo.get(i);

                        if(helperN.getComposting() == true ){

                            effectN = effectN - daysAll * (1/100);

                        }
                    
                    }

                }

                else if(listRessiduo.get(i).getOrigin() == "Municipal" ){

                    day = listRessiduo.get(i).getTimeDescompose().getDay();
                    month = listRessiduo.get(i).getTimeDescompose().getMonth();
                    years = listRessiduo.get(i).getTimeDescompose().getYears();

                    daysAll = day + (30*month) + (365 * years);
                    
                    effectN = daysAll * (12/100); 
                    
                    if(listRessiduo.get(i) instanceof Recyclable){

                        effectN = effectN - daysAll * (2/100);
                    }

                    else if(listRessiduo.get(i) instanceof Biodegradable){

                        Biodegradable helperN = (Biodegradable) listRessiduo.get(i);

                        if(helperN.getComposting() == true ){

                            effectN = effectN - daysAll * (1/100);

                        }
                    
                    }

                }

                else if(listRessiduo.get(i).getOrigin() == "Construccion" ){

                    day = listRessiduo.get(i).getTimeDescompose().getDay();
                    month = listRessiduo.get(i).getTimeDescompose().getMonth();
                    years = listRessiduo.get(i).getTimeDescompose().getYears();

                    daysAll = day + (30*month) + (365 * years);
                    
                    effectN = daysAll * (8/100);    
                    
                    if(listRessiduo.get(i) instanceof Recyclable){

                        effectN = effectN - daysAll * (2/100);
                    }

                    else if(listRessiduo.get(i) instanceof Biodegradable){

                        Biodegradable helperN = (Biodegradable) listRessiduo.get(i);

                        if(helperN.getComposting() == true ){

                            effectN = effectN - daysAll * (1/100);

                        }
                    
                    }

                }

                else if(listRessiduo.get(i).getOrigin() == "Hospital" ){

                    day = listRessiduo.get(i).getTimeDescompose().getDay();
                    month = listRessiduo.get(i).getTimeDescompose().getMonth();
                    years = listRessiduo.get(i).getTimeDescompose().getYears();

                    daysAll = day + (30*month) + (365 * years);
                    
                    effectN = daysAll * (15/100);   
                    
                    if(listRessiduo.get(i) instanceof Recyclable){

                        effectN = effectN - daysAll * (2/100);
                    }

                    else if(listRessiduo.get(i) instanceof Biodegradable){

                        Biodegradable helperN = (Biodegradable) listRessiduo.get(i);

                        if(helperN.getComposting() == true ){

                            effectN = effectN - daysAll * (1/100);

                        }
                    
                    }

                }

                information = "el efecto nocivo del residuo es : "+ effectN+" dias."; 

            }

        }
        return information;

    }

    public String usableBiodegradable(String name){

        String information = "/nEl residuo biodegradable no es aprovechable";

        for(int i = 0 ; i <= listRessiduo.size(); i++){

            String nameHelper = listRessiduo.get(i).getName();

            if(listRessiduo.get(i) instanceof Biodegradable ){

                if( listRessiduo.get(i).getTimeDescompose().getYears() < 1){

                    Biodegradable helperN = (Biodegradable) listRessiduo.get(i);

                    if(helperN.getComposting() == true ){

                        information = "/nEl residuo biodegradable es aprovechable";

                    }

                }

            }

        }

        return information;
        
        

    }
    
    public String listRessiduoHarmful(String name){
        
        String information = "/nlos residuos mas nocivos de mayor a menor son: ";
        int helperNoIdea = 1;

        for(int i = 0; i<= listProduct.size(); i++){

            String nameHelper  = listProduct.get(i).getName();

            if(name == nameHelper){

                for(int i1 = 0 ; i1<= listRessiduo.size(); i1++){

                    String nameRessiduo = listRessiduo.get(i).getName();

                    for(int i2 = 0 ; i2 <= listProduct.get(i).getListResiduo().size() ; i2++){

                        String nameRessiduoTheProduct = listProduct.get(i).getListResiduo().get(i2);

                        if(nameRessiduo == nameRessiduoTheProduct){

                            information = information+helperNoIdea+"."+effectHarmfulRessiduo(nameRessiduo)+"/n";

                            helperNoIdea++;

                        }

                    }

                }

            }

        }

        return information;

    }

    public Product getProduct(String name){

        ArrayList<String> helperN = new ArrayList<String>();
        Product information = new Product(helperN, "hola", "hola", "hola"); ;
        

        for(int i = 0 ; i< listProduct.size(); i++){

            String nameCheck = listProduct.get(i).getName();

            if(name == nameCheck ){

                information = new Product(listProduct.get(i).getListResiduo(), listProduct.get(i).getName(), listProduct.get(i).getIdentifier(), listProduct.get(i).getDescription());

            }

        }

        return information;
    }


    


    

    

}