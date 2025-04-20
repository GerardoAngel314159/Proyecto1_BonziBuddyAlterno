/**
 * Interfaz que representa una unidad de estado solido.
 * Define los metodos necesarios para obtener la informacion
 * y realizar acciones basicas sobre una unidad SSD.
 */
public interface SSD{
    
    public String getMarca();
    public String getNombre();
    public Tipo getTipo();
    public double getPrecio();
    public String getDescripcion();
    
    public void printNombre();
    public String getTipoAlmacenamiento();
    public int getCapacidadAlmacenamiento();

    public void ensamblarSSD();
}