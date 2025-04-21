/**
 * Interfaz que define operaciones basicas para un modulo de memoria RAM.
 */
public interface RAM {

    /**
     * Retorna la marca de la memoria RAM.
     *
     * @return La marca de la RAM.
     */
    public String getMarca();

    /**
     * Retorna el tamanio de la memoria RAM.
     *
     * @return Tamanio de la memoria.
     */
    public int getTamanioMemoria();

    /**
     * Retorna el nombre del modulo de RAM.
     *
     * @return Nombre del modulo.
     */
    public String getNombre();

    /**
     * Retorna el tipo de la memoria RAM.
     *
     * @return Tipo de la RAM.
     */
    public Tipo getTipo();

    /**
     * Retorna el precio del modulo de RAM.
     *
     * @return Precio de la RAM.
     */
    public double getPrecio();

    /**
     * Retorna la descripcion del modulo de RAM.
     *
     * @return Descripcion del modulo.
     */
    public String getDescripcion();

    /**
     * Imprime el nombre del modulo de RAM.
     */
    public void printNombre();

    /**
     * Ensambla el modulo de memoria RAM.
     */
    public void ensamblarRam();
}
