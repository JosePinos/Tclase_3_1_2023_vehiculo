public class Autobus extends Vehiculo{

    private int numPlazas;

    public Autobus(String marca, String modelo, double precioAlquiler, int numPlazas){

        super(marca, modelo, precioAlquiler);
        if(numPlazas < 0){
            throw new IllegalArgumentException("Places must be > 0");
        }
        this.numPlazas = numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        if(numPlazas < 0){
            throw new IllegalArgumentException("Places must be > 0");
        }
        this.numPlazas = numPlazas;
    }

    @Override
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Plazas: " + numPlazas);
    }

}
