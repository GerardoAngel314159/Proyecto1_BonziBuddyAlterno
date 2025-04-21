import java.util.ArrayList;

/**
 * Clase que representa una Computadora ensamblada.
 * Implementa la interfaz ComponenteComputadora y agrupa todos los componentes que forman una computadora.
 * Permite obtener informacion detallada del ensamblaje, como su descripcion, costo total y ticket de compra.
 */
public class Computadora implements ComponenteComputadora {

    private final GPU gpu;
    private final HDD hdd;
    private final SSD ssd;
    private final ArrayList<RAM> memoriaRAM;
    private final Procesador procesador;
    private final FuenteAlimentacion fuenteAlimentacion;
    private final Gabinetes gabinete;
    private final Motherboard motherboard;
    private double costo;
    private final String nombre;
    private String descripcion;
    private ArrayList<String> software;

    /**
     * Constructor de la clase Computadora.
     * Inicializa todos los componentes de la computadora y calcula su descripcion y costo total.
     *
     * @param gpu Objeto GPU utilizado.
     * @param hdd Objeto HDD utilizado.
     * @param ssd Objeto SSD utilizado.
     * @param memoriaRAM Lista de modulos de RAM.
     * @param procesador Objeto Procesador utilizado.
     * @param fuenteAlimentacion Objeto FuenteAlimentacion utilizado.
     * @param gabinete Objeto Gabinetes utilizado.
     * @param motherboard Objeto Motherboard utilizado.
     * @param nombre Nombre configurado para la computadora.
     */
    public Computadora(GPU gpu, HDD hdd, SSD ssd, ArrayList<RAM> memoriaRAM, 
                       Procesador procesador, FuenteAlimentacion fuenteAlimentacion, 
                       Gabinetes gabinete, Motherboard motherboard, String nombre) {
        this.nombre = nombre;
        this.gpu = gpu;
        this.hdd = hdd;
        this.ssd = ssd;
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.fuenteAlimentacion = fuenteAlimentacion;
        this.gabinete = gabinete;
        this.motherboard = motherboard;
        this.software = new ArrayList<>();

        descripcion();
        costo();
    }

    /**
     * Construye la descripcion de la computadora ensamblada, concatenando los nombres de cada componente.
     */
    private void descripcion() {
        descripcion = "Computadora ensamblada:";
        descripcion += "\nGPU: " + gpu.getNombre();
        descripcion += "\nHDD: " + hdd.getNombre();
        descripcion += "\nSSD: " + ssd.getNombre();
        for (RAM ram : memoriaRAM) {
            descripcion += "\nRAM: " + ram.getNombre();
        }
        descripcion += "\nProcesador: " + procesador.getNombre();
        descripcion += "\nFuente de Alimentación: " + fuenteAlimentacion.getNombre();
        descripcion += "\nGabinete: " + gabinete.getNombre();
        descripcion += "\nMotherboard: " + motherboard.getNombre();
    }

    /**
     * Calcula el costo total de la computadora sumando el precio de cada componente.
     */
    private void costo() {
        costo = gpu.getPrecio() +
                hdd.getPrecio() +
                ssd.getPrecio() +
                procesador.getPrecio() +
                fuenteAlimentacion.getPrecio() +
                gabinete.getPrecio() +
                motherboard.getPrecio();
        for (RAM ram : memoriaRAM) {
            costo += ram.getPrecio();
        }
    }

    /**
     * Retorna el nombre configurado de la computadora.
     *
     * @return Nombre de la computadora.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna la descripcion detallada de la computadora ensamblada.
     *
     * @return Descripcion de la computadora.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Retorna el costo total de la computadora.
     *
     * @return Costo total.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Retorna el ticket completo de la compra, que incluye el detalle de cada componente,
     * incompatibilidades y software adicional, junto con el costo total.
     *
     * @return Ticket de compra.
     */
    @Override
    public String getTicket() {
        String ticket = parcialTicket();
        ticket += "\nninguno";
        ticket += "\nCosto total " + costo + "\n";
        return ticket;
    }

    /**
     * Genera un ticket parcial que incluye el detalle de cada componente y su precio.
     *
     * @return Parte del ticket con el detalle de los componentes.
     */
    public String parcialTicket() {
        String ticket = "Ticket de compra: \n";
        ticket += "Computadora " + nombre + "\n";
        ticket += "\nComponentes:";
        ticket += "\n\tGPU: " + gpu.getNombre() + " " + gpu.getPrecio();
        ticket += "\n\tHDD: " + hdd.getNombre() + " " + hdd.getPrecio();
        ticket += "\n\tSSD: " + ssd.getNombre() + " " + ssd.getPrecio();
        for (RAM ram : memoriaRAM) {
            ticket += "\n\tRAM: " + ram.getNombre() + " " + ram.getPrecio();
        }
        ticket += "\n\tProcesador: " + procesador.getNombre() + " " + procesador.getPrecio();
        ticket += "\n\tFuente de Alimentación: " + fuenteAlimentacion.getNombre() + " " + fuenteAlimentacion.getPrecio();
        ticket += "\n\tGabinete: " + gabinete.getNombre() + " " + gabinete.getPrecio();
        ticket += "\n\tMotherboard: " + motherboard.getNombre() + " " + motherboard.getPrecio();
        ticket += "\n\nIncompatibilidades:\n";
        ticket += (procesador.getMarca().equalsIgnoreCase("ryzen")) ? 
                  "El gpu nvidia y cpu ryzen pueden ser incompatibles" : "ninguna";
        ticket += "\n\nSoftware adicional: \n";
        return ticket;
    }

    /**
     * Muestra en consola el ticket de compra de la computadora.
     */
    public void exhibir() {
        System.out.println(getTicket());
    }

    /**
     * Retorna la lista de software instalado en la computadora.
     *
     * @return ArrayList con el software.
     */
    public ArrayList<String> getSoftware() {
        return software;
    }
}