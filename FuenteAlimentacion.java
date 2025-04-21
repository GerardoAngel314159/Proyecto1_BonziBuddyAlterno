/**
 * Interfaz que define el comportamiento de una fuente de alimentacion.
 */
public interface FuenteAlimentacion {

    /**
     * Retorna la marca de la fuente.
     * 
     * @return Marca de la fuente.
     */
    public String getMarca();

    /**
     * Retorna el nombre de la fuente.
     * 
     * @return Nombre de la fuente.
     */
    public String getNombre();

    /**
     * Retorna el tipo de la fuente.
     * 
     * @return Tipo de la fuente.
     */
    public Tipo getTipo();

    /**
     * Retorna el precio de la fuente.
     * 
     * @return Precio de la fuente.
     */
    public double getPrecio();

    /**
     * Retorna la descripcion de la fuente.
     * 
     * @return Descripcion de la fuente.
     */
    public String getDescripcion();

    /**
     * Imprime el nombre de la fuente.
     */
    public void printNombre();

    /**
     * Retorna la potencia maxima de la fuente.
     * 
     * @return Potencia maxima de la fuente.
     */
    public int getPotenciaMaxima();

    /**
     * Ensambla la fuente de alimentacion.
     */
    public void ensamblarFuenteAlimentacion();
}