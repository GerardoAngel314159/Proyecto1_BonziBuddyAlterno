public class ROGMaximusZ790Hero implements Motherboard{

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
        nombre = "ROG Maximus Z790 Hero";
        descripcion = "Motherboard ASUS ROG Maximus Z790 Hero";
        chipsetSoportado = "Z790";
        precio = 50.0;
    }
}