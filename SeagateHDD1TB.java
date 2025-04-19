public class SeagateHDD1TB implements HDD{

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
        marca = "Seagate Barracuda";
        tipo = Tipo.HDD;
        nombre = "Seagate Barracuda 1TB";
        descripcion = "Disco HDD Seagate Barracuda de 1TB";
        precio = 50.0;
        capacidadAlmacenamiento = 1000;
        tipoAlmacenamiento = "HDD";
    }

}