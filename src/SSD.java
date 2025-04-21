/**
 * Interfaz que representa una unidad de estado solido.
 * Define los metodos necesarios para obtener la informacion
 * y realizar acciones basicas sobre una unidad SSD.
 */
public interface SSD{
    
    /**
     * Retorna la marca de la unidad SSD.
     * 
     * @return Marca de la SSD.
     */
    public String getMarca();

    /**
     * Retorna el nombre de la unidad SSD.
     * 
     * @return Nombre de la SSD.
     */
    public String getNombre();

    /**
     * Retorna el tipo de la SSD.
     * 
     * @return Tipo de la SSD.
     */
    public Tipo getTipo();

    /**
     * Retorna el precio de la unidad SSD.
     * 
     * @return Precio de la SSD.
     */
    public double getPrecio();

    /**
     * Retorna la descripcion de la unidad SSD.
     * 
     * @return Descripcion de la SSD.
     */
    public String getDescripcion();

    /**
     * Imprime el nombre de la unidad SSD.
     */
    public void printNombre();

    /**
     * Retorna el tipo de almacenamiento de la SSD.
     * 
     * @return Tipo de almacenamiento de la SSD.
     */
    public String getTipoAlmacenamiento();

    /**
     * Retorna la capacidad de almacenamiento de la unidad SSD.
     * 
     * @return Capacidad de almacenamiento.
     */
    public int getCapacidadAlmacenamiento();

    /**
     * Ensambla la unidad SSD.
     */
    public void ensamblarSSD();
}