public class Main {
    public static void main(String[] args) {

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

    }
}