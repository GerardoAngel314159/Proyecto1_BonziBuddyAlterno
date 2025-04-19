public interface GPU{
    public String getMarca();
    public String getNombre();
    public Tipo getTipo();
    public double getPrecio();
    public String getDescripcion();
    

    public void printNombre();
    public String getTipoMemoriaGPU();
    public void ensamblarTarjetaGrafica();
}