public class Adata8GB implements RAM{

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
        nombre = "Adata 8GB";
        descripcion = "Memoria RAM Adata de 8GB";
        precio = 30.0;
        tamañoMemoria = 8;
    }

}