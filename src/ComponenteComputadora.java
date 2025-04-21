import java.util.ArrayList;

/**
 * Interfaz que define las operaciones basicas que debe implementar un componente
 * de una computadora. Permite obtener informacion detallada del componente,
 * como su nombre, costo, ticket y descripcion, ademas de gestionar el software instalado.
 */
public interface ComponenteComputadora {

    /**
     * Retorna el nombre del componente de la computadora.
     *
     * @return Nombre del componente.
     */
    public String getNombre();

    /**
     * Retorna el costo total del componente de la computadora.
     *
     * @return Costo del componente.
     */
    public double getCosto();

    /**
     * Retorna el ticket completo con el detalle del componente.
     *
     * @return Ticket del componente.
     */
    public String getTicket();

    /**
     * Retorna la descripcion detallada del componente.
     *
     * @return Descripcion del componente.
     */
    public String getDescripcion();

    /**
     * Retorna un ticket parcial con el detalle del componente.
     *
     * @return Parte del ticket.
     */
    public String parcialTicket();

    /**
     * Muestra en consola la informacion del componente.
     */
    public void exhibir();

    /**
     * Retorna la lista de software instalado en el componente, si lo hay.
     *
     * @return ArrayList con el software instalado.
     */
    public ArrayList<String> getSoftware();
}