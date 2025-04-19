public class Corei3 implements Procesador{

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
        nombre = "Core i3-13100";
        descripcion = "Procesador Intel Core i3-13100 ideal para tareas de oficina y juegos ligeros";
        precio = 86.71;
        nucleos = 4;
    }

}