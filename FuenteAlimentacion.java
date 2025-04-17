public abstract class FuenteAlimentacion{
    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    int potenciaMaxima;
    
    public String getMarca(){
        return marca;
    }

    public int getPotenciaMaxima(){
        return potenciaMaxima;
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
        System.out.println("El tipo de fuente de alimentacion es: " + nombre);
    }   

    public abstract void ensamblarFuenteAlimentacion();
}