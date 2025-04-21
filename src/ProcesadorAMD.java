/**
 * Interfaz que define las operaciones basicas que debe implementar
 * un procesador AMD.
 */
public interface ProcesadorAMD {
    
    /**
     * Retorna la marca del procesador AMD.
     *
     * @return Marca del procesador.
     */
    public String getMarca();

    /**
     * Retorna el numero de nucleos del procesador.
     *
     * @return Numero de nucleos.
     */
    public int getNucleos();

    /**
     * Retorna el nombre del procesador.
     *
     * @return Nombre del procesador.
     */
    public String getNombre();

    /**
     * Retorna el tipo del procesador.
     *
     * @return Tipo del procesador.
     */
    public Tipo getTipo();

    /**
     * Retorna el precio del procesador.
     *
     * @return Precio del procesador.
     */
    public double getPrecio();

    /**
     * Retorna la descripcion del procesador.
     *
     * @return Descripcion del procesador.
     */
    public String getDescripcion();
    
    /**
     * Imprime el nombre del procesador.
     */
    public void printNombre();

    /**
     * Ensambla el procesador.
     */
    public void ensamblarProcesador();
}