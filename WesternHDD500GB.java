/**
 * Clase que representa un HDD Western de 500Gb.
 * Implementa la interfaz HDD.
 */
public class WesternHDD500GB implements HDD{
    /** 
     * Marca del disco duro.
     */
    String marca;

    /** 
     * Nombre completo del modelo.
     */
    String nombre;

    /** 
     * Tipo de dispositivo.
     */
    Tipo tipo;

    /**
     * Precio en dolares del disco.
     */
    double precio;

    /**
     * Descripcion del producto.
     */
    String descripcion;

    /**
     * Categoria de almacenamiento.
     */
    String tipoAlmacenamiento;

    /**
     * Capacidad de almacenamiento en gigabytes.
     */
    int capacidadAlmacenamiento;

    /**
     * Obtiene la capacidad de almacenamiento.
     *
     * @return capacidad en gigabytes
     */
    @Override
    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    /**
     * Obtiene la marca del disco.
     *
     * @return marca del HDD
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el tipo de almacenamiento.
     *
     * @return tipo de almacenamiento
     */
    @Override
    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    /**
     * Obtiene el nombre del modelo.
     *
     * @return nombre del HDD
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el tipo de dispositivo.
     *
     * @return tipo 
     */
    @Override
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Obtiene el precio del disco.
     *
     * @return precio en dolares
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la descripcion del producto.
     *
     * @return descripcion del HDD
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Imprime en consola el nombre del HDD.
     */
    @Override
    public void printNombre() {
        System.out.println("El tipo de HDD es: " + nombre);
    }

    /**
     * Inicializa los atributos del HDD con valores predefinidos:
     * marca, nombre, descripcion, precio, capacidad y tipo.
     */

    public void ensamblarHDD(){
        marca = "Western Digital Blue";
        tipo = Tipo.HDD;
        nombre = "Western Digital Blue 500GB";
        descripcion = "Disco HDD Western Digital Blue de 500GB";
        precio = 16.95;
        capacidadAlmacenamiento = 500;
        tipoAlmacenamiento = "HDD";
    }

}