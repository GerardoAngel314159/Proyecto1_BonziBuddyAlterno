public class SSD500GB implements SSD{

    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    String tipoAlmacenamiento;
    int capacidadAlmacenamiento;

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

    public String getTipoAlmacenamiento(){
        return tipoAlmacenamiento;
    }

    public int getCapacidadAlmacenamiento(){
        return capacidadAlmacenamiento;
    }

    public void printNombre(){
        System.out.println("El tipo de SSD es: " + nombre);
    }  

    public void ensamblarSSD(){
        marca = "Kingston";
        tipo = Tipo.SSD;
        nombre = "Kingston 500GB";
        descripcion = "Disco SSD Kingston de 500GB";
        precio = 17.50;
        capacidadAlmacenamiento = 500;
        tipoAlmacenamiento = "SSD";
    }

}