import java.util.ArrayList;

/**
 * Clase que representa a Microsoft Office, software que se puede agregar a la computadora del comprador.
 * Esta clase extiende de Software y funciona como decorador, agregando funcionalidades propias de Microsoft Office
 * al componente central.
 */
public class MicrosoftOffice extends Software {

    /**
     * Constructor de la clase MicrosoftOffice.
     *
     * @param computadoraCentro La computadora que se decorara con Microsoft Office.
     * @throws IllegalArgumentException Si la computadora ya cuenta con Office instalado.
     */
    public MicrosoftOffice(ComponenteComputadora computadoraCentro) {
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("office")) {
            throw new IllegalArgumentException("Ya tiene office");
        } else {
            computadoraCentro.getSoftware().add("office");
        }
    }

    /**
     * Retorna el nombre de la computadora decorada, incluyendo Microsoft Office.
     *
     * @return Nombre de la computadora decorada.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Retorna el costo total de la computadora decorada incrementado con el costo de Microsoft Office.
     *
     * @return Costo total de la computadora mas el costo de Microsoft Office.
     */
    @Override
    public double getCosto() {
        return computadoraCentro.getCosto() + 300;
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

    public void exhibir(){
        System.out.println(computadoraCentro.parcialTicket());
        System.out.println("Software: Microsoft Office");
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
     * Regresa un parcial del ticket que incluye el detalle de Microsoft Office.
     *
     * @return Parte del ticket con el nombre de Microsoft Office.
     */
    public String parcialTicket() {
        return computadoraCentro.parcialTicket() + "\nMicrosoft Office";
    }

    /**
     * Regresa la descripcion de la computadora decorada, incluyendo Microsoft Office.
     *
     * @return Descripcion de la computadora con el agregado de Microsoft Office.
     */
    @Override
    public String getDescripcion() {
        return computadoraCentro.getDescripcion() + "\nMicrosoft Office";
    }
}