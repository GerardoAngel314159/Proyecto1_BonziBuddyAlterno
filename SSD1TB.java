public class SSD1TB implements SSD{

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
        tipo = Tipo.MEMORIA_RAM;
        nombre = "Kingston 1TB";
        descripcion = "Disco SSD Kingston de 1TB";
        precio = 29.99;
        capacidadAlmacenamiento = 1000;
        tipoAlmacenamiento = "SSD";
    }

}