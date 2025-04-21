import java.util.ArrayList;

/**
 * Clase que representa a Autocad, software que se puede agregar a la computadora del comprador.
 * Esta clase extiende de Software y funciona como decorador, agregando funcionalidades
 * propias de Autocad al componente central.
 */
public class Autocad extends Software {

    /**
     * Constructor de la clase Autocad.
     *
     * @param computadoraCentro La computadora que se decorara con Autocad.
     * @throws IllegalArgumentException Si la computadora ya cuenta con Autocad instalado.
     */
    public Autocad(ComponenteComputadora computadoraCentro) {
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("autocad")) {
            throw new IllegalArgumentException("Ya tiene Autocad");
        } else {
            computadoraCentro.getSoftware().add("autocad");
        }
    }

    /**
     * Retorna el nombre de la computadora decorada.
     *
     * @return Nombre de la computadora decorada con Autocad.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Retorna el costo total de la computadora decorada incrementado con el costo de Autocad.
     *
     * @return Costo total de la computadora mas el costo de Autocad.
     */
    @Override
    public double getCosto() {
        return computadoraCentro.getCosto() + 230;
    }

    /**
     * Retorna la lista de software instalado en la computadora decorada.
     *
     * @return ArrayList con el software.
     */
    @Override
    public ArrayList<String> getSoftware() {
        return computadoraCentro.getSoftware();
    }

    /**
     * Muestra por consola la informacion de la computadora decorada, incluyendo Autocad.
     */
    @Override
    public void exhibir() {
        computadoraCentro.exhibir();
        System.out.println("\nSoftware: Autocad");
    }

    /**
     * Retorna el ticket completo de la computadora decorada, concatenado con el costo total.
     *
     * @return Ticket con el detalle de la computadora y su costo total.
     */
    @Override
    public String getTicket() {
        return parcialTicket() + "\n" + "\nCosto total: " + getCosto();
    }

    /**
     * Regresa un parcial del ticket que incluye el detalle del agregado de Autocad.
     *
     * @return Parte del ticket con el nombre de Autocad.
     */
    public String parcialTicket() {
        return computadoraCentro.parcialTicket() + "\nAutocad";
    }

    /**
     * Regresa la descripcion de la computadora decorada, incluyendo Autocad.
     *
     * @return Descripcion de la computadora con el agregado de Autocad.
     */
    @Override
    public String getDescripcion() {
        return computadoraCentro.getDescripcion() + "\nAutocad";
    }
}