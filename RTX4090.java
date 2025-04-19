public class RTX4090 implements GPU{
 
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

    public void ensamblarTarjetaGrafica(){
        marca = "NVIDIA";
        tipo = Tipo.GPU;
        nombre = "RTX 4090";
        descripcion = "Tarjeta gráfica NVIDIA RTX 4090";
        precio = 350.0;
        tipoMemoriaGPU = "GDDR6X";
    }
}