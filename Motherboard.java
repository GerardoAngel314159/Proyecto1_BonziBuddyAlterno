/**
 * Interfaz Motherboard
 *
 * Representa las operaciones basicas que debe implementar una placa base
 */
public interface Motherboard {

    public String getMarca();
    public String getNombre();
    public Tipo getTipo();
    public double getPrecio();
    public String getDescripcion();
    public String getChipsetSoportado();
    
    public void printNombre(); 

    public abstract void ensamblarMotherboard();
}
