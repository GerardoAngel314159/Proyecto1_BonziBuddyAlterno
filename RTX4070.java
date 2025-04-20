/**
 * Clase que representa una GPU NVIDIA RTX 4070.
 * Implementa la interfaz GPU.
 */
public class RTX4070 implements GPU {

    /**
     * Marca del dispositivo.
     */
    String marca;

    /**
     * Nombre o modelo de la GPU.
     */
    String nombre;

    /**
     * Tipo de dispositivo (GPU).
     */
    Tipo tipo;

    /**
     * Precio en dolares de la GPU.
     */
    double precio;

    /**
     * Descripcion del producto.
     */
    String descripcion;

    /**
     * Tipo de memoria que usa la GPU.
     */
    String tipoMemoriaGPU;

    /**
     * Obtiene el tipo de memoria de la GPU.
     *
     * @return tipo de memoria
     */
    @Override
    public String getTipoMemoriaGPU() {
        return tipoMemoriaGPU;
    }

    /**
     * Obtiene la marca de la GPU.
     *
     * @return marca del dispositivo
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el nombre o modelo de la GPU.
     *
     * @return nombre del dispositivo
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el tipo de dispositivo.
     *
     * @return tipo 
     */
    @Override
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Obtiene el precio de la GPU.
     *
     * @return precio en dolares
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la descripcion del producto.
     *
     * @return descripcion de la GPU
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Imprime en consola el nombre de la GPU.
     */
    @Override
    public void printNombre() {
        System.out.println("El tipo de GPU es: " + nombre);
    }

    /**
     * Inicializa los atributos de la GPU con valores predefinidos.
     */
    @Override
    public void ensamblarGpu(){
        marca = "NVIDIA";
        tipo = Tipo.GPU;
        nombre = "RTX 4070";
        descripcion = "Tarjeta gráfica NVIDIA RTX 4070";
        precio = 679.96;
        tipoMemoriaGPU = "GDDR6X";
    }
}