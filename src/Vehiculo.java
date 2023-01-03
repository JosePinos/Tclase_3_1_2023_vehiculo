public class Vehiculo {

    private String marca;
    private String modelo;
    private double precioAlquiler;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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
