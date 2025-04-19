public interface Gabinetes{

    public String getMarca();
    public String getNombre();
    public Tipo getTipo();
    public double getPrecio();
    public String getDescripcion();
    public void printNombre();
    
    public abstract void ensamblarGabinete();
}