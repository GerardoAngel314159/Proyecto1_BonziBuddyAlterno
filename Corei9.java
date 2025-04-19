public class Corei9 implements  Procesador{

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

    public void ensamblarProcesador(){
        marca = "Intel";
        tipo = Tipo.PROCESADOR;
        nombre = "Core i9-13900K";
        descripcion = "Procesador Intel Core i9-13900K el mejor rendimiento para gaming y aplicaciones pesadas";
        precio = 446.32;
        nucleos = 14;
    }

}