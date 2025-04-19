public class WesternHDD500GB implements HDD{

    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    String tipoAlmacenamiento;
    int capacidadAlmacenamiento;
    
    public int getCapacidadAlmacenamiento(){
        return capacidadAlmacenamiento;
    }

    public String getMarca(){
        return marca;
    }

    public String getTipoAlmacenamiento(){
        return tipoAlmacenamiento;
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
        System.out.println("El tipo de HDD es: " + nombre);
    } 

    public void ensamblarHDD(){
        marca = "Western Digital Blue";
        tipo = Tipo.HDD;
        nombre = "Western Digital Blue 500GB";
        descripcion = "Disco HDD Western Digital Blue de 500GB";
        precio = 50.0;
        capacidadAlmacenamiento = 500;
        tipoAlmacenamiento = "HDD";
    }

}