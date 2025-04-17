public abstract class HDD{
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

    public abstract void ensamblarHDD();
}