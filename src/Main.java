import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
        Vehiculo vh1 = new Autobus("MAZDA",
                "012S",123.6,10);

        Vehiculo vh2 = new Turismo("NEW CARRERA",
                "FDF6",47.6,2);

        if(vh1 instanceof Autobus){
            System.out.println("El vehículo es un autobus");
            vh1.imprimirAtributos();
        }


        System.out.println("\n-----------------------------------------\n");
        if(vh2 instanceof Turismo){
            System.out.println("El vehículo es de Turismo");
            vh2.imprimirAtributos();
        }
        */

        /*
        List listaVehiculos = new ArrayList();

        listaVehiculos.add( new Vehiculo("Mercedes","E",55) );
        listaVehiculos.add( new Autobus("Mercedes","M20",100,20) );
        listaVehiculos.add( new Turismo("BMW","525",50,4) );
        listaVehiculos.add( new Turismo("AUDI","A4",55,4) );

        imprimirLista((ArrayList)listaVehiculos );
        */
        Scanner sc = new Scanner(System.in);
        List listaVehiculos = new ArrayList();


        int opcion = 1;
        while(opcion != 4){
            opcion = menuVehiculos();
            System.out.println("\n");
            switch(opcion){

                case 1:{
                    String marca_aux, modelo_aux;     double precio_alquiler;

                    //**************************************************************
                    System.out.println("\n\tAGREGAR VEHÍCULO");
                    int tipo_vehiculo;
                    System.out.println("1) agregar vehículo");
                    System.out.println("2) agregar autobus");
                    System.out.println("3) agregar turismo");
                    System.out.print(">");
                    tipo_vehiculo = sc.nextInt();
                    sc.nextLine();//limpio del caracter sobrante
                    //**************************************************************

                    System.out.print("\nIngrese la marca del vehículo: ");
                    marca_aux = sc.nextLine();

                    System.out.print("\nIngrese el modelo del vehículo: ");
                    modelo_aux = sc.nextLine();

                    System.out.print("\nIngrese el precio del vehículo: ");
                    precio_alquiler = sc.nextDouble();
                    //**************************************************************


                    if(tipo_vehiculo == 1){
                        listaVehiculos.add( new Vehiculo(marca_aux, modelo_aux, precio_alquiler) );
                    }else if (tipo_vehiculo == 2){
                        int numPlazas_aux=0;

                        System.out.print("\nIngrese el número de plazas del autobus: ");
                        numPlazas_aux = sc.nextInt();

                        listaVehiculos.add( new Autobus(marca_aux, modelo_aux, precio_alquiler, numPlazas_aux) );

                    }else if(tipo_vehiculo == 3){
                        int numPuertas_aux = 0;

                        System.out.print("\nIngrese el número de puertas del turismo: ");
                        numPuertas_aux = sc.nextInt();

                        listaVehiculos.add( new Turismo(marca_aux, modelo_aux, precio_alquiler, numPuertas_aux) );

                    }else{
                        System.out.println("ESE VEHÍCULO NO EXISTE");
                    }


                }
                break;//FIN DEL CASE 1


                case 2:{
                    System.out.println("\n\tELIMINAR VEHÍCULO");
                    System.out.println("Lista de vehículos para posible eliminación (solo 1 cada vez)");
                    imprimirLista((ArrayList)listaVehiculos );          System.out.println();

                    int index = 0;
                    System.out.print("Ingrese el índice del vehículo que desea eliminar: ");
                    index = sc.nextInt();

                    listaVehiculos.remove(index);

                    System.out.println("\nRESULTADO TRAS LA ELIMINACIÓN");
                    imprimirLista((ArrayList)listaVehiculos );
                }
                break;//FIN DEL CASE 2


                case 3:{
                    System.out.println("\n\tMOSTRAR VEHÍCULOS");

                    imprimirLista((ArrayList)listaVehiculos );
                }
                break;//FIN DEL CASE 3


                case 4:{
                    System.out.println("\n\tGRACIAS POR SU PREFERENCIA");
                }
                break;

            }//fin del switch
        }

    }




    private static void imprimirLista(ArrayList lista){
        for(int i = 0; i < lista.size(); i++){
            Vehiculo v = (Vehiculo)lista.get(i);
            System.out.println("\tVehículo: " + (i+1));
            v.imprimirAtributos();
            System.out.println();
        }
    }


    public static int menuVehiculos(){
        int opcion = 0;
        System.out.println("\n\tMENÚ DE VEHÍCULOS");
        System.out.println("1) Agregar Vehículo");
        System.out.println("2) Eliminar Vehículo");
        System.out.println("3) Mostrar Vehículos");
        System.out.println("4) SALIR");
        System.out.print(">");
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();

        return  opcion;
    }


}