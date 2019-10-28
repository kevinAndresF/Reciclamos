package ui;

import model.ControlatorReciclamos;
import model.Biodegradable;
import model.Recyclable;
import model.TimeDescompose;
import model.Product;
import model.Ressiduo;
import model.Inert;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String [] args){

        ///////////////////////////////////////////////////////////////////////////////////
        //                            *_*
        ///////////////////////////////////////////////////////////////////////////////////

        Ressiduo helperRessiduo ;
        int electionPasar;

        ControlatorReciclamos helperGeneral = new ControlatorReciclamos();
    
        ArrayList<String> helperArrayListString = new ArrayList<String>();

        helperArrayListString.add("cascara de banano");
        helperArrayListString.add("plastico");
        helperArrayListString.add("icopor");

        Product helperProduct = new Product(helperArrayListString, "no se, esto solo es una ayuda", "12lp", "es la verga este producto");
        helperGeneral.listProduct(helperProduct);

        TimeDescompose helperTimeDescompose;

        helperTimeDescompose = new TimeDescompose(24, 4, 0);

        ControlatorReciclamos helperCreate = new ControlatorReciclamos();
        helperGeneral.createResiduoBiodegradable("cascara de banano", "Industrial", "amarillo", "Es un fruto que se da en climas colombianos", "12kpepd", helperTimeDescompose, helperProduct, true);

        helperTimeDescompose = new TimeDescompose(21, 10, 30);
        helperGeneral.createResiduoRecyclable("plastico", "Industrial", "translucido", "se utiliza en muchos productos", "84f849f", helperTimeDescompose, helperProduct, "Plastico", "con este residuo se empacan muchas cosas", "esta en las chuspas que se utilizan para botar la basura y cargar cosas del mercado");

        helperTimeDescompose = new TimeDescompose(12, 20, 1000);
        helperGeneral.createResiduoInert("icopor", "Industrial", "blanco", "se utiliza para proteger materiales delicados", "9jrfne9", helperTimeDescompose, helperProduct, "no se bro disculpa");

        Scanner reader  = new Scanner (System.in);

        String name;
        String origin = "ola";
        String color;
        String information;
        String identifier; 
        TimeDescompose timeDescompose;
        Product product = new Product(helperArrayListString, "no se, esto solo es una ayuda", "12lp", "es la verga este producto");
        boolean composting;
        String typeRecyclable = "hola";
        String descriptionForIndustry;
        String descriptionForHome;
        String tips;
        int day;
        int month;
        int years; 
        String nameProduct;
        String identifierProduct; 
        String descriptionProduct;
        String nameRessiduoProduct;

    ///////////////////////////////////////////////////////////////////////////////////
    //                            *_*
    ///////////////////////////////////////////////////////////////////////////////////

        do {
            System.out.print("Porfavor indique con un numero la opcion que desea realizar./n1.Crear residuo Biodegradable./n2.Crear residuo reciclable./n3.Crear residuo inerte./n4.Crear producto./n5.Generar reporte de los residuos registrados./n6.Buscar la información de un residuo por nombre de residuo./n7.Mostrar una lista de productos registrados./n8.Calcular el efecto nocivo de un residuo./n9.Determinar si un residuo biodegradable es aprovechable./n");
            int electionCreate = reader.nextInt();

            if(electionCreate == 1){
                
                System.out.print("porfavor ingrese el nombre: /n");
                name = reader.next();

                System.out.print("elija que opcion de origen tiene el residuo: /n1.Industrial/n2.municipal/n3.Domiciliario/n4.Hospitalario/n5.Construccion/n: ");

                int electionCreateOrigin = reader.nextInt();

                if(electionCreateOrigin == 1){

                    origin = "Industrial";

                }
                else if(electionCreateOrigin == 2){

                    origin = "Municipal";

                }
                else if(electionCreateOrigin == 3){

                    origin = "Domiliario";

                }
                else if(electionCreateOrigin == 4){

                    origin = "Hospital";

                }
                else if(electionCreateOrigin == 5){

                    origin = "Construccion";

                }
                
                System.out.print("porfavor ingrese el color: /n");
                color = reader.next();
                System.out.print("porfavor ingrese la informacion: /n");
                information = reader.next();
                System.out.print("porfavor ingrese el identificador: /n");
                identifier = reader.next();
                System.out.print("porfavor ingrese dias, enter, meses, enter, años de descomposicion: /n");
                day = reader.nextInt();
                month = reader.nextInt();
                years = reader.nextInt();
                timeDescompose = new TimeDescompose(day, month, years);
                System.out.print("estos son los productos actualmente: /n"+helperGeneral.getProducts());
                System.out.print("si alguno de estos productos produce este residuo ingrese /n1./nsi va a crear un nuevo producto ingresa 2/: /n");
                int electionCreateProduct = reader.nextInt();
                if(electionCreateProduct == 1){

                    System.out.print("porfavor ingrese el nombre de el producto a el cual le corresponde este residuo: /n");
                    nameProduct = reader.next();
                    product = helperGeneral.getProduct(nameProduct);

                }

                if(electionCreateProduct == 2){

                    System.out.print("porfavor ingrese el nombre del producto: /n");
                    nameProduct = reader.next();
                    System.out.print("porfavor ingrese el identificador del producto: /n");
                    identifierProduct = reader.next();
                    System.out.print("porfavor ingrese la descripcion del producto: /n");
                    descriptionProduct = reader.next();
                    ArrayList<String> helperinfinit = new ArrayList<String>();
                    int helperI = 0;
                    while(helperI == 0){

                        System.out.print("porfavor ingrese el nombre del residuo del producto: /n");
                        nameRessiduoProduct = reader.next();
                        helperinfinit.add(nameRessiduoProduct);
                        
                        System.out.print("si hay otros residuos generados por este producto ingrese 0 y si no hay mas ingrese cualquier otro numero: /n");
                        helperI = reader.nextInt();
                        
                    }
                    helperGeneral.createProduct(helperinfinit, nameProduct, identifierProduct, descriptionProduct);
                    product = new Product(helperinfinit, nameProduct, identifierProduct, descriptionProduct);
                }

                
                System.out.print("porfavor ingrese /n1.si es apto para compostage: /n2.no es apto. /n");
                int electionI = reader.nextInt();
                composting = false;
                if (electionI == 1 ){

                    composting= true;
                }
                System.out.print(helperGeneral.createResiduoBiodegradable(name, origin, color, information, identifier, timeDescompose, product, composting));               

            }

            else if(electionCreate == 2){

                
                System.out.print("porfavor ingrese el nombre: /n");
                name = reader.next();

                System.out.print("elija que opcion de origen tiene el residuo: /n1.Industrial/n2.municipal/n3.Domiciliario/n4.Hospitalario/n5.Construccion/n: ");

                int electionCreateOrigin = reader.nextInt();

                if(electionCreateOrigin == 1){

                    origin = "Industrial";

                }
                else if(electionCreateOrigin == 2){

                    origin = "Municipal";

                }
                else if(electionCreateOrigin == 3){

                    origin = "Domiliario";

                }
                else if(electionCreateOrigin == 4){

                    origin = "Hospital";

                }
                else if(electionCreateOrigin == 5){

                    origin = "Construccion";

                }
                
                System.out.print("porfavor ingrese el color: /n");
                color = reader.next();
                System.out.print("porfavor ingrese la informacion: /n");
                information = reader.next();
                System.out.print("porfavor ingrese el identificador: /n");
                identifier = reader.next();
                System.out.print("porfavor ingrese dias, enter, meses, enter, años de descomposicion: /n");
                day = reader.nextInt();
                month = reader.nextInt();
                years = reader.nextInt();
                timeDescompose = new TimeDescompose(day, month, years);
                System.out.print("estos son los productos actualmente: /n"+helperGeneral.getProducts());
                System.out.print("si alguno de estos productos produce este residuo ingrese /n1./nsi va a crear un nuevo producto ingresa 2/: /n");
                int electionCreateProduct = reader.nextInt();
                if(electionCreateProduct == 1){

                    System.out.print("porfavor ingrese el nombre de el producto a el cual le corresponde este residuo: /n");
                    nameProduct = reader.next();
                    product = helperGeneral.getProduct(nameProduct);

                }

                if(electionCreateProduct == 2){

                    System.out.print("porfavor ingrese el nombre del producto: /n");
                    nameProduct = reader.next();
                    System.out.print("porfavor ingrese el identificador del producto: /n");
                    identifierProduct = reader.next();
                    System.out.print("porfavor ingrese la descripcion del producto: /n");
                    descriptionProduct = reader.next();
                    ArrayList<String> helperinfinit = new ArrayList<String>();
                    int helperI = 0;
                    while(helperI == 0){

                        System.out.print("porfavor ingrese el nombre del residuo del producto: /n");
                        nameRessiduoProduct = reader.next();
                        helperinfinit.add(nameRessiduoProduct);
                        
                        System.out.print("si hay otros residuos generados por este producto ingrese 0 y si no hay mas ingrese cualquier otro numero: /n");
                        helperI = reader.nextInt();
                        
                    }
                    helperGeneral.createProduct(helperinfinit, nameProduct, identifierProduct, descriptionProduct);
                    product = new Product(helperinfinit, nameProduct, identifierProduct, descriptionProduct);
                }
                System.out.print("ingresa el numero correspondiente al tipo de resiclable: /n1.Papel /n2.Vidrio /n3.Carton /n4.Platico /n5.Metal");
                int electionType = reader.nextInt();
                if(electionType == 1){

                    typeRecyclable = "Papel";

                }
                if(electionType == 2){

                    typeRecyclable = "Vidrio";

                }
                if(electionType == 3){

                    typeRecyclable = "Carton";

                }
                if(electionType == 4){

                    typeRecyclable = "Plastico";

                }
                if(electionType == 5 ){

                    typeRecyclable = "Metal";

                }

                System.out.print("ingrese la descripcion de la industria: /n");
                descriptionForIndustry = reader.next();

                System.out.print("ingrese la descripcion del hogar : /n");
                descriptionForHome = reader.next();

                System.out.print(helperGeneral.createResiduoRecyclable(name, origin, color, information, identifier, timeDescompose, product, typeRecyclable, descriptionForIndustry, descriptionForHome));

            }

            else if(electionCreate == 3){
                
                System.out.print("porfavor ingrese el nombre: /n");
                name = reader.next();

                System.out.print("elija que opcion de origen tiene el residuo: /n1.Industrial/n2.municipal/n3.Domiciliario/n4.Hospitalario/n5.Construccion/n: ");

                int electionCreateOrigin = reader.nextInt();

                if(electionCreateOrigin == 1){

                    origin = "Industrial";

                }
                else if(electionCreateOrigin == 2){

                    origin = "Municipal";

                }
                else if(electionCreateOrigin == 3){

                    origin = "Domiliario";

                }
                else if(electionCreateOrigin == 4){

                    origin = "Hospital";

                }
                else if(electionCreateOrigin == 5){

                    origin = "Construccion";

                }
                
                System.out.print("porfavor ingrese el color: /n");
                color = reader.next();
                System.out.print("porfavor ingrese la informacion: /n");
                information = reader.next();
                System.out.print("porfavor ingrese el identificador: /n");
                identifier = reader.next();
                System.out.print("porfavor ingrese dias, enter, meses, enter, años de descomposicion: /n");
                day = reader.nextInt();
                month = reader.nextInt();
                years = reader.nextInt();
                timeDescompose = new TimeDescompose(day, month, years);
                System.out.print("estos son los productos actualmente: /n"+helperGeneral.getProducts());
                System.out.print("si alguno de estos productos produce este residuo ingrese /n1./nsi va a crear un nuevo producto ingresa 2/: /n");
                int electionCreateProduct = reader.nextInt();
                if(electionCreateProduct == 1){

                    System.out.print("porfavor ingrese el nombre de el producto a el cual le corresponde este residuo: /n");
                    nameProduct = reader.next();
                    product = helperGeneral.getProduct(nameProduct);

                }

                if(electionCreateProduct == 2){

                    System.out.print("porfavor ingrese el nombre del producto: /n");
                    nameProduct = reader.next();
                    System.out.print("porfavor ingrese el identificador del producto: /n");
                    identifierProduct = reader.next();
                    System.out.print("porfavor ingrese la descripcion del producto: /n");
                    descriptionProduct = reader.next();
                    ArrayList<String> helperinfinit = new ArrayList<String>();
                    int helperI = 0;
                    while(helperI == 0){

                        System.out.print("porfavor ingrese el nombre del residuo del producto: /n");
                        nameRessiduoProduct = reader.next();
                        helperinfinit.add(nameRessiduoProduct);
                        
                        System.out.print("si hay otros residuos generados por este producto ingrese 0 y si no hay mas ingrese cualquier otro numero: /n");
                        helperI = reader.nextInt();
                        
                    }
                    helperGeneral.createProduct(helperinfinit, nameProduct, identifierProduct, descriptionProduct);
                    product = new Product(helperinfinit, nameProduct, identifierProduct, descriptionProduct);
                }

                System.out.print("porfavor ingrese el tips: /n");
                tips = reader.next();

                System.out.print(helperGeneral.createResiduoInert(name, origin, color, information, identifier, timeDescompose, product, tips));



            }

            else if(electionCreate == 4){

                System.out.print("porfavor ingrese el nombre del producto: /n");
                nameProduct = reader.next();
                System.out.print("porfavor ingrese el identificador del producto: /n");
                identifierProduct = reader.next();
                System.out.print("porfavor ingrese la descripcion del producto: /n");
                descriptionProduct = reader.next();
                ArrayList<String> helperinfinit = new ArrayList<String>();
                int helperI = 0;
                while(helperI == 0){

                    System.out.print("porfavor ingrese el nombre del residuo del producto: /n");
                    nameRessiduoProduct = reader.next();
                    helperinfinit.add(nameRessiduoProduct);
                        
                    System.out.print("si hay otros residuos generados por este producto ingrese 0 y si no hay mas ingrese cualquier otro numero: /n");
                    helperI = reader.nextInt();

                }

                System.out.print(helperGeneral.createProduct(helperinfinit, nameProduct, identifierProduct, descriptionProduct));

            }

            else if(electionCreate == 5){
                
                System.out.print(helperGeneral.informationAll());

            }

            else if(electionCreate == 6){

                System.out.print("ingrese el nombre del residuo a buscar: /n");
                name = reader.next();
                System.out.print(helperGeneral.getInformationForName(name));

            }

            else if(electionCreate == 7){

                System.out.print(helperGeneral.getProducts()); 

            }

            else if(electionCreate == 8){

                System.out.print("ingrese el nombre del residuo a buscar: /n");
                name = reader.next();
                System.out.print(helperGeneral.effectHarmfulRessiduo(name));

            }

            else if(electionCreate == 9){

                System.out.print("ingrese el nombre del residuo a buscar: /n");
                name = reader.next();
                System.out.print(helperGeneral.usableBiodegradable(name));

            }

            
            System.out.print("Si desea seguir creando llamadas telefonicas porfavor elija./n0.Seguir creando llamadas./nOtro numero diferente del 0 para dejar de seguir creando llamadas");
            electionPasar = reader.nextInt();
        }while(electionPasar!=0);


        System.out.print("gracias por usar esta aplicacion hecha por Kevin Andrés Fernández Noguera");

        

    }

}
