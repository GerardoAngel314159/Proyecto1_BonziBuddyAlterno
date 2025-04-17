/**
*interfaz que representa a los gabinetes en general, de las computadorasque se crearan  
*/
public abstract class Gabinetes{
    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    
    public String getMarca(){
        return marca;
    }

    public String getNombre(){
        return nombre;
    }
    public Tipo getTipo(){
        return tipo;
    }
    public double getPrecio(){
        return precio;
    }
    public String getDescripcion(){
        return descripcion;
    }

    public void printNombre(){
        System.out.println("El tipo de gabinete es: " + nombre);
    }   

    public abstract void ensamblarGabinete();
}