public abstract class TarjetaGrafica{
    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    String tipoMemoriaGPU;

    public String getTipoMemoriaGPU(){
        return tipoMemoriaGPU;
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
        System.out.println("El tipo de GPU es: " + nombre);
    }   

    public abstract void ensamblarTarjetaGrafica();
}