public abstract class Procesador{
    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    int nucleos;

    public int getNucleos(){
        return nucleos;
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
        System.out.println("El tipo de cpu es: " + nombre);
    }   

    public abstract void ensamblarProcesador();
}