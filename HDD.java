/**
 * Interfaz HDD.
 *
 * Representa las operaciones basicas que debe implementar un componente
 * de disco duro (HDD) en el sistema de ensamblaje de computadores.
 */
public interface HDD {

    /**
     * Retorna la marca del disco duro.
     * 
     * @return La marca del HDD.
     */
    public String getMarca();

    /**
     * Retorna la capacidad de almacenamiento del disco duro.
     * 
     * @return Capacidad de almacenamiento.
     */
    public int getCapacidadAlmacenamiento();

    /**
     * Retorna el nombre del disco duro.
     * 
     * @return Nombre del HDD.
     */
    public String getNombre();

    /**
     * Retorna el tipo del disco duro.
     * 
     * @return Tipo del HDD.
     */
    public Tipo getTipo();

    /**
     * Retorna el precio del disco duro.
     * 
     * @return Precio del HDD.
     */
    public double getPrecio();

    /**
     * Retorna la descripcion del disco duro.
     * 
     * @return Descripcion del HDD.
     */
    public String getDescripcion();

    /**
     * Retorna el tipo de almacenamiento del disco duro.
     * 
     * @return Tipo de almacenamiento.
     */
    public String getTipoAlmacenamiento();

    /**
     * Imprime el nombre del disco duro.
     */
    public void printNombre();

    /**
     * Ensambla el disco duro.
     */
    public abstract void ensamblarHDD();
}