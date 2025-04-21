/**
 * Representa la clase de Adapter para los procesadores Ryzen.
 */
public class ProcesadorAMDAdapter implements Procesador {

    /**
     * Referencia al procesador AMD que se desea adaptar.
     */
    private final ProcesadorAMD procesadorAMD;

    /**
     * Crea un nuevo adaptador a partir de un objeto que implementa ProcesadorAMD.
     *
     * @param procesadorAMD El procesador AMD que se va a adaptar.
     */
    public ProcesadorAMDAdapter(ProcesadorAMD procesadorAMD) {
        this.procesadorAMD = procesadorAMD;
    }

    /**
     * Retorna la marca del procesador.
     *
     * @return La marca del procesador.
     */
    @Override
    public String getMarca() {
        return procesadorAMD.getMarca();
    }

    /**
     * Retorna el numero de nucleos del procesador.
     *
     * @return Numero de nucleos.
     */
    @Override
    public int getNucleos() {
        return procesadorAMD.getNucleos();
    }

    /**
     * Retorna el nombre del procesador.
     *
     * @return Nombre del procesador.
     */
    @Override
    public String getNombre() {
        return procesadorAMD.getNombre();
    }

    /**
     * Retorna el tipo del procesador.
     *
     * @return Tipo del procesador.
     */
    @Override
    public Tipo getTipo() {
        return procesadorAMD.getTipo();
    }

    /**
     * Retorna el precio del procesador.
     *
     * @return Precio del procesador.
     */
    @Override
    public double getPrecio() {
        return procesadorAMD.getPrecio();
    }

    /**
     * Retorna la descripcion del procesador.
     *
     * @return Descripcion del procesador.
     */
    @Override
    public String getDescripcion() {
        return procesadorAMD.getDescripcion();
    }

    /**
     * Imprime el nombre del procesador.
     */
    @Override
    public void printNombre() {
        procesadorAMD.printNombre();
    }

    /**
     * Ensambla el procesador.
     */
    @Override
    public void ensamblarProcesador() {
        procesadorAMD.ensamblarProcesador();
    }
}