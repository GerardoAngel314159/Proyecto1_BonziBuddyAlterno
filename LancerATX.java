public class LancerATX implements Gabinetes{

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

    public void ensamblarGabinete(){
        marca = "Yeyian";
        tipo = Tipo.GABINETE;
        nombre = "Lancer ATX";
        descripcion = "";
        precio = 50.0;
    }

}