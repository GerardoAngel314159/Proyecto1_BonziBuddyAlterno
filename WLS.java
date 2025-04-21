import java.util.ArrayList;

/**
 * Clase que representa a WLS, software que se puede agregar a la computadora del comprador.
 */
public class WLS extends Software {

    /**
     * Constructor de la clase.
     *
     * @param computadoraCentro La computadora que se decorara con WLS.
     */
    public WLS(ComponenteComputadora computadoraCentro) {
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("wls")) {
            throw new IllegalArgumentException("Ya tiene WLS");
        } else {
            computadoraCentro.getSoftware().add("wls");
        }
    }

    /**
     * Metodo que regresa el nombre de la computadora decorada.
     *
     * @return Nombre de la computadora decorada con WLS.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Metodo que regresa el costo total de la computadora decorada mas el costo de WLS.
     *
     * @return Costo total de la computadora mas WLS.
     */
    @Override
    public double getCosto() {
        return computadoraCentro.getCosto() + 250;
    }

    /**
     * Retorna la lista de software de la computadora decorada.
     *
     * @return ArrayList con el software.
     */
    @Override
    public ArrayList<String> getSoftware() {
        return computadoraCentro.getSoftware();
    }

    /**
     * Muestra por consola la informacion de la computadora decorada.
     */
    @Override
    public void exhibir() {
        computadoraCentro.exhibir();
        System.out.println("\nSoftware: WLS");
    }

    /**
     * Retorna el ticket concatenado con el costo total.
     *
     * @return Ticket de la computadora decorada.
     */
    @Override
    public String getTicket() {
        return parcialTicket() + "\n" + "\nCosto total: " + getCosto();
    }

    /**
     * Regresa un parcial del ticket que incluye WLS.
     *
     * @return Parte del ticket.
     */
    public String parcialTicket() {
        return computadoraCentro.parcialTicket() + "\nWLS";
    }

    /**
     * Regresa la descripcion de la computadora decorada con WLS.
     *
     * @return Descripcion de la computadora.
     */
    @Override
    public String getDescripcion() {
        return computadoraCentro.getDescripcion() + "\nWLS";
    }
}