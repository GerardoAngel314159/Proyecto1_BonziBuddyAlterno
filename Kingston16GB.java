public class Kingston16GB implements RAM{

    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    int tamañoMemoria;
    
    public String getMarca(){
        return marca;
    }

    public int getTamañoMemoria(){
        return tamañoMemoria;
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
        System.out.println("El tipo de RAM es: " + nombre);
    }   

    public void ensamblarRam(){
        marca = "Kingston";
        tipo = Tipo.MEMORIA_RAM;
        nombre = "Kingston 16GB";
        descripcion = "Memoria RAM Kingston de 16GB";
        precio = 33.65;
        tamañoMemoria = 16;
    }
}