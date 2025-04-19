public interface HDD{
    public String getMarca();
    public int getCapacidadAlmacenamiento();
    public String getNombre();
    public Tipo getTipo();
    public double getPrecio();
    public String getDescripcion();
    public String getTipoAlmacenamiento();
    public void printNombre(); 

    public abstract void ensamblarHDD();
}