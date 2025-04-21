/**
 * Interface que define operaciones basicas para una unidad de procesamiento grafico (GPU).
 */
public interface GPU {
    
    /**
     * Retorna la marca de la GPU.
     * 
     * @return La marca de la GPU.
     */
    public String getMarca();

    /**
     * Retorna el nombre de la GPU.
     * 
     * @return El nombre de la GPU.
     */
    public String getNombre();

    /**
     * Retorna el tipo de la GPU.
     * 
     * @return El tipo de la GPU.
     */
    public Tipo getTipo();

    /**
     * Retorna el precio de la GPU.
     * 
     * @return El precio de la GPU.
     */
    public double getPrecio();

    /**
     * Retorna la descripcion de la GPU.
     * 
     * @return La descripcion de la GPU.
     */
    public String getDescripcion();

    /**
     * Imprime el nombre de la GPU.
     */
    public void printNombre();

    /**
     * Retorna el tipo de memoria de la GPU.
     * 
     * @return El tipo de memoria de la GPU.
     */
    public String getTipoMemoriaGPU();

    /**
     * Ensambla la GPU.
     */
    public void ensamblarGpu();
}