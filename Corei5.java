public class Corei5 implements  Procesador{

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
        nombre = "Core i5-13600K";
        descripcion = "Procesador Intel Core i5-13600K ideal para actividades del dia a dia y juegos comunes";
        precio = 129.0;
        nucleos = 14;
    }

}