public class MAGB760TomahawkWIFIDDR4 implements Motherboard{

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
        marca = "MSI";
        tipo = Tipo.MOTHERBOARD;
        nombre = "MAG B760 Tomahawk WIFI DDR4";
        descripcion = "Motherboard MSI MAG B760 Tomahawk WIFI DDR4";
        chipsetSoportado = "B760";
        precio = 236.15;
    }
}