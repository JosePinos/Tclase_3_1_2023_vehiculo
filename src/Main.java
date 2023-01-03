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
            menuVehiculos();
            System.out.println("\n");
            switch(opcion){

                case 1:{
                    System.out.println("\n\tAGREGAR VEHÍCULO");
                    int tipo_vehiculo;
                    System.out.println("1) agregar vehículo");
                    System.out.println("2) agregar autobus");
                    System.out.println("3) agregar turismo");
                    System.out.println(">");
                    tipo_vehiculo = sc.nextInt();

                    if(tipo_vehiculo == 1){

                    }else if (tipo_vehiculo == 2){

                    }else if(tipo_vehiculo == 3){

                    }else{
                        System.out.println("ESE VEHÍCULO NO EXISTE");
                    }


                }
                break;


                case 2:{
                    System.out.println("\n\tELIMINAR VEHÍCULO");
                }
                break;


                case 3:{
                    System.out.println("\n\tMOSTRAR VEHÍCULOS");

                    imprimirLista((ArrayList)listaVehiculos );
                }
                break;


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
        System.out.println(">");
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();

        return  opcion;
    }


}