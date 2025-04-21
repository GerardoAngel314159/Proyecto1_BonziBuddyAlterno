/**
 * Clase que implementa la Motherboard ROG Maximus Z790 Hero.
 *
 * Proporciona la configuracion y funcionalidad especifica de una placa base ROG Maximus Z790 Hero.
 */
public class ROGMaximusZ790Hero implements Motherboard {

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
        marca = "ASUS";
        tipo = Tipo.MOTHERBOARD;
        nombre = "ROG Maximus Z790 Hero";
        descripcion = "Motherboard ASUS ROG Maximus Z790 Hero";
        chipsetSoportado = "Z790";
        precio = 607.25;
    }
}