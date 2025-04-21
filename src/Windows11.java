import java.util.ArrayList;

/**
 * Clase que representa a Windows 11, software que se puede agregar a la computadora del comprador.
 */
public class Windows11 extends Software {

    /**
     * Constructor de la clase.
     *
     * @param computadoraCentro La computadora que se decorara con Windows 11.
     */
    public Windows11(ComponenteComputadora computadoraCentro) {
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("windows11")) {
            throw new IllegalArgumentException("Ya tiene Windows 11");
        } else {
            computadoraCentro.getSoftware().add("windows11");
        }
    }

    /**
     * Metodo que regresa el nombre de la computadora decorada.
     *
     * @return Nombre de la computadora decorada con Windows 11.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Metodo que regresa el costo total de la computadora decorada mas el costo de Windows 11.
     *
     * @return Costo total de la computadora mas Windows 11.
     */
    @Override
    public double getCosto() {
        return computadoraCentro.getCosto() + 600;
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
        System.out.println("Software: Windows 11");
    }

    /**
     * Retorna el ticket parcial concatenado con el costo total.
     *
     * @return Ticket con el detalle de la computadora y su costo.
     */
    @Override
    public String getTicket() {
        return parcialTicket() + "\n" + "\nCosto total: " + getCosto();
    }

    /**
     * Regresa un parcial del ticket que incluye Windows 11.
     *
     * @return Parte del ticket.
     */
    public String parcialTicket() {
        return computadoraCentro.parcialTicket() + "\nWindows 11";
    }

    /**
     * Regresa la descripcion de la computadora decorada con Windows 11.
     *
     * @return Descripcion de la computadora.
     */
    @Override
    public String getDescripcion() {
        return computadoraCentro.getDescripcion() + "\nWindows 11";
    }
}