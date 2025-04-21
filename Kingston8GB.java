/**
 * Clase que representa un modulo de RAM Kingston de 8GB.
 * Implementa la interfaz RAM.
 */
public class Kingston8GB implements RAM {

    /**
     * Marca del modulo de RAM.
     */
    private String marca;

    /**
     * Nombre del modelo de RAM.
     */
    private String nombre;

    /**
     * Tipo de dispositivo.
     */
    private Tipo tipo;

    /**
     * Precio en dolares del modulo.
     */
    private double precio;

    /**
     * Descripcion del producto.
     */
    private String descripcion;

    /**
     * Tamano de memoria en gigabytes.
     */
    private int tamanioMemoria;

    /**
     * Obtiene la marca del modulo de RAM.
     *
     * @return marca de la memoria
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el tamano de memoria del modulo.
     *
     * @return tamano de memoria en gigabytes
     */
    @Override
    public int getTamanioMemoria() {
        return tamanioMemoria;
    }

    /**
     * Obtiene el nombre del modelo.
     *
     * @return nombre del modulo de RAM
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
     * Obtiene el precio del modulo de RAM.
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
     * @return descripcion de la RAM
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Imprime en consola el nombre del modulo de RAM.
     */
    @Override
    public void printNombre() {
        System.out.println("El tipo de RAM es: " + nombre);
    }

    /**
     * Inicializa los atributos de la RAM con valores predefinidos.
     */
    public void ensamblarRam(){
        marca = "Kingston";
        tipo = Tipo.MEMORIA_RAM;
        nombre = "Kingston 8GB";
        descripcion = "Memoria RAM Kingston de 8GB";
        precio = 18.20;
        tamanioMemoria = 8;
    }
}