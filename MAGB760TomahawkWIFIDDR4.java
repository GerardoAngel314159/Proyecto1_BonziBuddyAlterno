/**
 * Clase que implementa la Motherboard MAG B760 Tomahawk WIFI DDR4.
 *
 * Proporciona la configuracion y funcionalidad especifica de una placa base MAG B760 Tomahawk WIFI DDR4.
 */
public class MAGB760TomahawkWIFIDDR4 implements Motherboard {

    private String marca;
    private String nombre;
    private Tipo tipo;
    private double precio;
    private String descripcion;
    private String chipsetSoportado;

    /**
     * Retorna el chipset soportado por la placa base.
     *
     * @return Chipset compatible
     */
    @Override
    public String getChipsetSoportado() {
        return chipsetSoportado;
    }

    /**
     * Retorna la marca de la placa base.
     *
     * @return Marca del Motherboard.
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna el nombre completo o descriptivo de la placa base.
     *
     * @return Nombre de la placa base.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el tipo generico del componente.
     *
     * @return Valor de la enum
     */
    @Override
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Retorna el precio de la placa base.
     *
     * @return Precio en la moneda especificada.
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Retorna una descripcion detallada de la placa base.
     *
     * @return Descripcion de la placa base.
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Imprime en consola el nombre de la placa base.
     */
    @Override
    public void printNombre() {
        System.out.println("El tipo de motherboard es: " + nombre);
    }

    /**
     * Inicializa las propiedades de la placa base.
     */
    @Override
    public void ensamblarMotherboard(){
        marca = "MSI";
        tipo = Tipo.MOTHERBOARD;
        nombre = "MAG B760 Tomahawk WIFI DDR4";
        descripcion = "Motherboard MSI MAG B760 Tomahawk WIFI DDR4";
        chipsetSoportado = "B760";
        precio = 236.15;
    }
}