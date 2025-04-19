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