/**
 *Representa la clase de Adapter para los procesadores Ryzen
 */
public class ProcesadorAMDAdapter implements Procesador {

    /**
     * Referencia al procesador AMD que se desea adaptar.
     */
    private final ProcesadorAMD procesadorAMD;

    /**
     * Crea un nuevo adaptador a partir de un objeto que implementa ProcesadorAMD.
     * 
     * @param procesadorAMD el procesador AMD que se va a adaptar
     */
    public ProcesadorAMDAdapter(ProcesadorAMD procesadorAMD) {
        this.procesadorAMD = procesadorAMD;
    }

    @Override
    public String getMarca() {
        return procesadorAMD.getMarca();
    }

    @Override
    public int getNucleos() {
        return procesadorAMD.getNucleos();
    }

    @Override
    public String getNombre() {
        return procesadorAMD.getNombre();
    }

    @Override
    public Tipo getTipo() {
        return procesadorAMD.getTipo();
    }

    @Override
    public double getPrecio() {
        return procesadorAMD.getPrecio();
    }

    @Override
    public String getDescripcion() {
        return procesadorAMD.getDescripcion();
    }

    @Override
    public void printNombre() {
        procesadorAMD.printNombre();
    }

    @Override
    public void ensamblarProcesador() {
        procesadorAMD.ensamblarProcesador();
    }
} 

