/**
 * interfaz que representa a los Gabinetes de la fabrica, para crear las computadoras
 */
public interface Gabinetes{

    /**Metodo que regresa la marca del gabinete
     * @return String con la marca del gabinete
     */
    public String getMarca();

    /**Metodo que regresara el nombre del Gabinete
     * @return String con el nombre del gabinete
     */
    public String getNombre();

    /**
     * Metodo que regresa el tipo de componente que se esta manejando
     * @return Tipo con valor al el componente que se esta manejando
     */
    public Tipo getTipo();

    /**
     * Metodo que regresa el costo del gabinete
     * @return double con valor al precio del gabinete
     */
    public double getPrecio();
    
    /**
     * Metodo que regresara la descripcion del gabinete
     * @return String con la descripcion del componente
     */
    public String getDescripcion();

    /**
     * Metodo que imprimira el nombre del gabinete
     */
    public void printNombre();
    
    /**
     * Metodo el cual le dara valores al gabinete en sus atributos que tenga declarados
     * como el nombre, precio, etc.
     */
    public abstract void ensamblarGabinete();
}