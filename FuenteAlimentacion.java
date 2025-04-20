/**
 * Interfaz que representa una fuente de alimentacion.
 * Define los metodos necesarios para obtener la informacion
 * y realizar acciones basicas sobre la fuente de alimentacion.
 */
public interface FuenteAlimentacion{
    public String getMarca();
    public String getNombre();
    public Tipo getTipo();
    public double getPrecio();
    public String getDescripcion();
    
    public void printNombre();
    public int getPotenciaMaxima();    
    public void ensamblarFuenteAlimentacion();
}