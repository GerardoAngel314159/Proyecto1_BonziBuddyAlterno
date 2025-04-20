/**
 * Clase que representa un procesador Intel Core i9-13900.
 * Implementa la interfaz Procesador.
 */
public class Corei9 implements Procesador {

    /**
     * Marca del procesador.
     */
    String marca;

    /**
     * Nombre o modelo del procesador.
     */
    String nombre;

    /**
     * Tipo de dispositivo.
     */
    Tipo tipo;

    /**
     * Precio en dolares del procesador.
     */
    double precio;

    /**
     * Descripcion del producto.
     */
    String descripcion;

    /**
     * Numero de nucleos del procesador.
     */
    int nucleos;

    /**
     * Obtiene el numero de nucleos del procesador.
     *
     * @return numero de nucleos
     */
    @Override
    public int getNucleos() {
        return nucleos;
    }

    /**
     * Obtiene la marca del procesador.
     *
     * @return marca del dispositivo
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el nombre o modelo del procesador.
     *
     * @return nombre del dispositivo
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
     * Obtiene el precio del procesador.
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
     * @return descripcion del procesador
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Imprime en consola el nombre del procesador.
     */
    @Override
    public void printNombre() {
        System.out.println("El tipo de cpu es: " + nombre);
    }

    /**
     * Inicializa los atributos del procesador con valores predefinidos.
     */
    @Override
    public void ensamblarProcesador(){
        marca = "Intel";
        tipo = Tipo.PROCESADOR;
        nombre = "Core i9-13900K";
        descripcion = "Procesador Intel Core i9-13900K el mejor rendimiento para gaming y aplicaciones pesadas";
        precio = 446.32;
        nucleos = 14;
    }

}