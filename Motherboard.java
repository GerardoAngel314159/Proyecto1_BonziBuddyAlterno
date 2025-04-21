/**
 * Interfaz Motherboard.
 *
 * Representa las operaciones basicas que debe implementar una placa base.
 */
public interface Motherboard {

    /**
     * Retorna la marca de la placa.
     *
     * @return Marca de la placa base.
     */
    public String getMarca();

    /**
     * Retorna el nombre de la placa.
     *
     * @return Nombre de la placa base.
     */
    public String getNombre();

    /**
     * Retorna el tipo de la placa.
     *
     * @return Tipo de la placa base.
     */
    public Tipo getTipo();

    /**
     * Retorna el precio de la placa.
     *
     * @return Precio de la placa base.
     */
    public double getPrecio();

    /**
     * Retorna la descripcion de la placa.
     *
     * @return Descripcion de la placa base.
     */
    public String getDescripcion();

    /**
     * Retorna el chipset soportado por la placa.
     *
     * @return Chipset soportado.
     */
    public String getChipsetSoportado();
    
    /**
     * Imprime el nombre de la placa.
     */
    public void printNombre(); 

    /**
     * Ensambla la placa base.
     */
    public abstract void ensamblarMotherboard();
}