public class Turismo extends  Vehiculo{
    private int numPuertas;

    public Turismo(String marca, String modelo, double precioAlquiler, int numPuertas){
        super(marca, modelo, precioAlquiler);

        if(numPuertas < 0){
            throw new IllegalArgumentException("Doors number must be >= 0");
        }
        this.numPuertas = numPuertas;

    }

    public void setNumPuertas(int numPuertas){
        if(numPuertas < 0){
            throw new IllegalArgumentException("Doors number must be >= 0");
        }
        this.numPuertas = numPuertas;
    }

    @Override
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Puertas: " + numPuertas);
    }








}
