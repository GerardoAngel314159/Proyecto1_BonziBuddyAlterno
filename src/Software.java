/**
 * Clase abstracta que representa el software con el cual se podra decorar a la computadora en caso
 * de que el usuario quiera agregar un software a su computadora.
 */
public abstract class Software implements ComponenteComputadora {

    /** Representa a la computadora a la cual se le va a agregar software. */
    protected ComponenteComputadora computadoraCentro;

    protected Boolean Windows10 = false;
    protected Boolean Windows11 = false;
    protected Boolean Photoshop = false;
    protected Boolean Office = false;
    protected Boolean Autocad = false;
    protected Boolean WSL = false;

    /**
     * Metodo constructor de la clase.
     *
     * @param computadoraCentro La computadora que se decorara con software.
     */
    public Software(ComponenteComputadora computadoraCentro) {
        this.computadoraCentro = computadoraCentro;
    }

    /**
     * Retorna el nombre de la computadora decorada.
     *
     * @return Nombre de la computadora.
     */
    public String getNombre() {
        return computadoraCentro.getNombre();
    }

    /**
     * Retorna el costo total de la computadora decorada.
     *
     * @return Costo de la computadora.
     */
    public double getCosto() {
        return computadoraCentro.getCosto();
    }

    /**
     * Indica si la computadora cuenta con Windows 10.
     *
     * @return true si cuenta con Windows10, false de lo contrario.
     */
    public Boolean hayWindows10() {
        return Windows10;
    }

    /**
     * Indica si la computadora cuenta con Windows 11.
     *
     * @return true si cuenta con Windows11, false de lo contrario.
     */
    public Boolean hayWindows11() {
        return Windows11;
    }

    /**
     * Indica si la computadora cuenta con Photoshop.
     *
     * @return true si cuenta con Photoshop, false de lo contrario.
     */
    public Boolean hayPhotoshop() {
        return Photoshop;
    }

    /**
     * Indica si la computadora cuenta con Office.
     *
     * @return true si cuenta con Office, false de lo contrario.
     */
    public Boolean hayOffice() {
        return Office;
    }

    /**
     * Indica si la computadora cuenta con Autocad.
     *
     * @return true si cuenta con Autocad, false de lo contrario.
     */
    public Boolean hayAutocad() {
        return Autocad;
    }

    /**
     * Indica si la computadora cuenta con WSL.
     *
     * @return true si cuenta con WSL, false de lo contrario.
     */
    public Boolean hayWSL() {
        return WSL;
    }
}