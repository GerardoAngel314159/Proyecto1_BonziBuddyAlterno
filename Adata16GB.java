public class Adata16GB implements RAM{

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
        marca = "Adata";
        tipo = Tipo.MEMORIA_RAM;
        nombre = "Adata 16GB";
        descripcion = "Memoria RAM Adata de 16GB";
        precio = 33.60;
        tamañoMemoria = 16;
    }

}