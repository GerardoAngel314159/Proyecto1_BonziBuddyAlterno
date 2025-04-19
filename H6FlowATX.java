public class H6FlowATX implements Gabinetes{

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
        marca = "NZXT";
        tipo = Tipo.GABINETE;
        nombre = "H6 Flow ATX";
        descripcion = "";
        precio = 50.0;
    }

}