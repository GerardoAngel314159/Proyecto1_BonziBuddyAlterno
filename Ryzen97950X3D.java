/**
 * Clase que representa un procesador Ryzen7 7950X3D.
 * Implementa la interfaz Procesador.
 */
public class Ryzen97950X3D implements ProcesadorAMD {

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
    public void ensamblarProcesador() {
        marca = "Ryzen";
        tipo = Tipo.PROCESADOR;
        nombre = "Ryzen9-7950X3D";
        descripcion = "Procesador Ryzen9-7950X3D ideal para tener mas rendimiento en juegos y creadores exigentes";
        precio = 495.97;
        nucleos = 16;
    }
}

