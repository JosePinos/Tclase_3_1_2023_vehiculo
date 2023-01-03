public class Vehiculo {

    private String marca;
    private String modelo;
    private double precioAlquiler;

    public Vehiculo(String marca, String modelo, double precioAlquiler) {
        this.marca = marca;
        this.modelo = modelo;

        if(precioAlquiler < 0.0){
            throw new IllegalArgumentException("Rent price must be >= 0.0");
        }
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler){
        if(precioAlquiler < 0.0){
            throw new IllegalArgumentException("Rent price must be >= 0.0");
        }

        this.precioAlquiler = precioAlquiler;
    }


    public void imprimirAtributos(){
        System.out.println("Modelo: " + modelo + "\nMarca: " + marca + "\tPrecio Alquiler: " + precioAlquiler);
    }







}
