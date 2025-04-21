/**
 * Clase que implementa la interfaz FuenteAlimentacion para el modelo XPG 700W.
 */
public class XPG700W implements FuenteAlimentacion {

    /**
     * Marca del fabricante.
     */
    private String marca;

    /**
     * Nombre o modelo de la fuente.
     */
    private String nombre;

    /** 
     * Tipo de componente (enumeracion Tipo).
     */
    private Tipo tipo;

    /**
     * Precio en unidades monetarias.
     */
    private double precio;

    /**
     * Descripcion detallada del producto.
     */
    private String descripcion;

    /**
     * Potencia maxima en vatios.
     */
    private int potenciaMaxima;

    /**
     * Obtiene la potencia maxima soportada por la fuente.
     *
     * @return la potencia maxima en vatios
     */
    @Override
    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    /**
     * Obtiene la marca del fabricante.
     *
     * @return la marca de la fuente
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el nombre o modelo de la fuente.
     *
     * @return el nombre del modelo
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el tipo de componente.
     *
     * @return el tipo segun la enumeracion Tipo
     */
    @Override
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Obtiene el precio de la fuente.
     *
     * @return el precio en unidades monetarias
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la descripcion del producto.
     *
     * @return la descripcion detallada
     */
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Imprime en consola el nombre del modelo.
     */
    @Override
    public void printNombre() {
        System.out.println("El tipo de fuente de alimentacion es: " + nombre);
    }

    /**
     * Ensambla y configura los valores de la fuente de alimentacion.
     * Asigna marca, tipo, nombre, descripcion, precio y potencia maxima.
     */
    @Override
    public void ensamblarFuenteAlimentacion(){
        marca = "XPG";
        tipo = Tipo.FUENTE_ALIMENTACION;
        nombre = "XPG 700W";
        descripcion = "Cuenta con la certificacion 80 PLUS BRONZE";
        precio = 61.63;
        potenciaMaxima = 700;
    }
}