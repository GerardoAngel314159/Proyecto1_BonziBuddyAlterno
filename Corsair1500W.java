public class Corsair1500W implements FuenteAlimentacion {
    
    String marca;
    String nombre;
    Tipo tipo;
    double precio;
    String descripcion;
    int potenciaMaxima;

    public int getPotenciaMaxima(){
        return potenciaMaxima;
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
        System.out.println("El tipo de fuente de alimentacion es: " + nombre);
    }  

    public void ensamblarFuenteAlimentacion(){
        marca = "Corsair";
        tipo = Tipo.FUENTE_ALIMENTACION;
        nombre = "Corsair 1500W";
        descripcion = "";
        precio = 399.58;
        potenciaMaxima = 1500;
    }
}