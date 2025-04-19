public class TUFGamingB760PlusWIFID4 implements Motherboard{

    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    String chipsetSoportado;
    
    public String getChipsetSoportado(){
        return chipsetSoportado;
    }

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
        System.out.println("El tipo de motherboard es: " + nombre);
    }   

    public void ensamblarMotherboard(){
        marca = "ASUS";
        tipo = Tipo.MOTHERBOARD;
        nombre = "TUF Gaming B760-Plus WIFI D4";
        descripcion = "Motherboard ASUS TUF Gaming B760-Plus WIFI D4";
        chipsetSoportado = "B760";
        precio = 50.0;
    }
}