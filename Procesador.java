public interface Procesador {

    public String getMarca();
    public int getNucleos();
    public String getNombre();
    public Tipo getTipo();
    public double getPrecio();
    public String getDescripcion();
    public void printNombre();
    public void ensamblarProcesador();
}