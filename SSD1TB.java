/**
 * Clase que implementa la interfaz SSD para representar una unidad SSD de 1TB.
 * Proporciona informacion y metodos relacionados con una unidad de almacenamiento solido.
 */
public class SSD1TB implements SSD {

    /**
     * Marca del fabricante del SSD.
     */
    String marca;

    /**
     * Nombre o modelo del SSD.
     */
    String nombre;

    /**
     * Tipo de componente 
     */
    Tipo tipo;

    /**
     * Precio en unidades monetarias.
     */
    double precio;

    /**
     * Descripcion del producto.
     */
    String descripcion;

    /**
     * Tipo de almacenamiento 
     */
    String tipoAlmacenamiento;

    /**
     * Capacidad de almacenamiento
     */
    int capacidadAlmacenamiento;

    /**
     * Obtiene la marca del SSD.
     *
     * @return la marca del producto
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el nombre o modelo del SSD.
     *
     * @return el nombre del modelo
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el tipo del componente.
     *
     * @return el tipo definido en la enumeracion Tipo
     */
    @Override
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Obtiene el precio del SSD.
     *
     * @return el precio en unidades monetarias
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la descripcion del SSD.
     *
     * @return la descripcion del producto
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el tipo de almacenamiento
     *
     * @return el tipo de almacenamiento
     */
    @Override
    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    /**
     * Obtiene la capacidad del SSD.
     *
     * @return la capacidad
     */
    @Override
    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    /**
     * Imprime en consola el nombre del SSD.
     */
    @Override
    public void printNombre() {
        System.out.println("El tipo de SSD es: " + nombre);
    }

    /**
     * Ensambla el SSD asignando valores a sus propiedades.
     */
    @Override
    public void ensamblarSSD() {
        marca = "Kingston";
        tipo = Tipo.SSD; // Nota: Puede que deba ser Tipo.SSD
        nombre = "Kingston 1TB";
        descripcion = "Disco SSD Kingston de 1TB";
        precio = 29.99;
        capacidadAlmacenamiento = 1000;
        tipoAlmacenamiento = "SSD";
    }
}