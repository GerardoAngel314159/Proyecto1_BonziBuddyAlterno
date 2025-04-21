import java.util.ArrayList;

/**
 * Clase que representa a Photoshop, software que se puede agregar a la computadora del comprador.
 */
public class Photoshop extends Software {

    /**
     * Constructor de la clase.
     *
     * @param computadoraCentro La computadora que se decorara con Photoshop.
     */
    public Photoshop(ComponenteComputadora computadoraCentro) {
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("photoshop")) {
            throw new IllegalArgumentException("Ya tiene Photoshop");
        } else {
            computadoraCentro.getSoftware().add("photoshop");
        }
    }

    /**
     * Metodo que regresa el nombre de la computadora decorada.
     *
     * @return String con el nombre de la computadora decorada.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Metodo que regresa el costo total de la computadora decorada mas el costo de Photoshop.
     *
     * @return Costo total de la computadora mas el costo de Photoshop.
     */
    @Override
    public double getCosto() {
        return computadoraCentro.getCosto() + 350;
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
        System.out.println("\nSoftware: Photoshop");
    }

    /**
     * Retorna el ticket parcial concatenado con el costo total.
     *
     * @return Ticket con el detalle de la computadora y su costo total.
     */
    @Override
    public String getTicket() {
        return parcialTicket() + "\n" + "\nCosto total: " + getCosto();
    }

    /**
     * Regresa un parcial del ticket que incluye el detalle de Photoshop.
     *
     * @return Parte del ticket.
     */
    public String parcialTicket() {
        return computadoraCentro.parcialTicket() + "\nPhotoshop";
    }

    /**
     * Regresa la descripcion de la computadora decorada con Photoshop.
     *
     * @return Descripcion de la computadora.
     */
    @Override
    public String getDescripcion() {
        return computadoraCentro.getDescripcion() + "\nPhotoshop";
    }
}