/**
 * Interfaz que define operaciones basicas para un modulo de memoria RAM.
 */
public interface RAM {
    public String getMarca();
    public int getTamanioMemoria();
    public String getNombre();
    public Tipo getTipo();
    public double getPrecio();
    public String getDescripcion();
    
    public void printNombre();
    
    public void ensamblarRam();
}
