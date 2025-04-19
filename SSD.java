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