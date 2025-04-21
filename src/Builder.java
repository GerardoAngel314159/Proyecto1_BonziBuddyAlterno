import java.util.ArrayList;

/**
 * Clase Builder que se encarga de ensamblar los distintos componentes de una computadora.
 * Permite configurar cada componente por separado y luego construir un objeto Computadora.
 */
public class Builder {
    String nombre;
    private GPU gpu;
    private HDD hdd;
    private SSD ssd;
    private ArrayList<RAM> memoriaRAM;
    private Procesador procesador;
    private FuenteAlimentacion fuenteAlimentacion;
    private Gabinetes gabinete;
    private Motherboard motherboard;

    /**
     * Constructor de la clase Builder.
     * Inicializa la lista de memorias RAM.
     */
    public Builder() {
        this.memoriaRAM = new ArrayList<>();
    }

    /**
     * Agrega un modulo de RAM a la computadora.
     * Se permite agregar hasta un maximo de 4 modulos.
     *
     * @param ram Objeto RAM que se va a agregar.
     */
    public void ram(RAM ram) {
        if (memoriaRAM.size() >= 4) {
            System.out.println("No se pueden agregar más de 4 módulos de RAM.");
            return;
        }
        this.memoriaRAM.add(ram);
    }

    /**
     * Configura la GPU de la computadora.
     *
     * @param gpu Objeto GPU que se va a utilizar.
     */
    public void gpu(GPU gpu) {
        this.gpu = gpu;
    }
    
    /**
     * Configura el HDD de la computadora.
     *
     * @param hdd Objeto HDD que se va a utilizar.
     */
    public void hdd(HDD hdd) {
        this.hdd = hdd;
    }

    /**
     * Configura el SSD de la computadora.
     *
     * @param ssd Objeto SSD que se va a utilizar.
     */
    public void ssd(SSD ssd) {
        this.ssd = ssd;
    }

    /**
     * Configura el procesador de la computadora.
     *
     * @param procesador Objeto Procesador que se va a utilizar.
     */
    public void procesador(Procesador procesador) {
        this.procesador = procesador;
    }

    /**
     * Configura la fuente de alimentacion de la computadora.
     *
     * @param fuenteAlimentacion Objeto FuenteAlimentacion que se va a utilizar.
     */
    public void fuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    /**
     * Configura el gabinete de la computadora.
     *
     * @param gabinete Objeto Gabinetes que se va a utilizar.
     */
    public void gabinete(Gabinetes gabinete) {
        this.gabinete = gabinete;
    }

    /**
     * Configura la motherboard de la computadora.
     *
     * @param motherboard Objeto Motherboard que se va a utilizar.
     */
    public void motherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    /**
     * Muestra en consola el ensamblaje actual de la computadora con todos sus componentes.
     */
    public void muestraEnsamblaje() {
        System.out.println("Hasta ahora el ensamblaje de la computadora es el siguiente:\n");

        gpu.printNombre();
        hdd.printNombre();
        ssd.printNombre();
        for (RAM ram : memoriaRAM) {
            ram.printNombre();
        }
        procesador.printNombre();
        fuenteAlimentacion.printNombre();
        gabinete.printNombre();
        motherboard.printNombre();
    }

    /**
     * Construye la computadora ensamblada.
     * Antes de construirla, se llama al metodo privado ensamblar para preparar cada componente.
     *
     * @return Objeto Computadora con los componentes ensamblados y el nombre configurado.
     */
    public Computadora build() {
        ensamblar();
        return new Computadora(gpu, hdd, ssd, memoriaRAM, procesador, fuenteAlimentacion, gabinete, motherboard, nombre);
    }

    /**
     * Configura el nombre de la computadora.
     *
     * @param nombre Nombre de la computadora.
     */
    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Muestra en consola el precio total de la computadora, sumando el costo de cada componente.
     */
    public void muestraPrecio() {
        double precioTotal = 0;
        precioTotal += gpu.getPrecio();
        precioTotal += hdd.getPrecio();
        precioTotal += ssd.getPrecio();
        for (RAM ram : memoriaRAM) {
            precioTotal += ram.getPrecio();
        }
        precioTotal += procesador.getPrecio();
        precioTotal += fuenteAlimentacion.getPrecio();
        precioTotal += gabinete.getPrecio();
        precioTotal += motherboard.getPrecio();

        System.out.println("El precio total de la computadora es: " + precioTotal);
    }

    /**
     * Muestra en consola la lista de componentes que aun no han sido ensamblados.
     */
    public void muestraPendientes() {
        System.out.println("Los siguientes componentes no han sido ensamblados:");
        if (gpu == null) {
            System.out.println("GPU");
        }
        if (hdd == null) {
            System.out.println("HDD");
        }
        if (ssd == null) {
            System.out.println("SSD");
        }
        if (memoriaRAM.isEmpty()) {
            System.out.println("RAM");
        }
        if (procesador == null) {
            System.out.println("Procesador");
        }
        if (fuenteAlimentacion == null) {
            System.out.println("Fuente de Alimentacion");
        }
        if (gabinete == null) {
            System.out.println("Gabinete");
        }
        if (motherboard == null) {
            System.out.println("Motherboard");
        }
    }

    /**
     * Reinicia los componentes de la computadora.
     * Se utiliza para reiniciar el proceso de ensamblaje.
     */
    public void reiniciar() {
        gpu = null;
        hdd = null;
        ssd = null;
        memoriaRAM = new ArrayList<>();
        procesador = null;
        fuenteAlimentacion = null;
        gabinete = null;
        motherboard = null;
    }

    /**
     * Ensambla todos los componentes configurados de la computadora.
     * Llama al metodo ensamblar de cada componente para completar el proceso.
     */
    private void ensamblar() {
        gpu.ensamblarGpu();
        hdd.ensamblarHDD();
        ssd.ensamblarSSD();
        for (RAM ram : memoriaRAM) {
            ram.ensamblarRam();
        }
        procesador.ensamblarProcesador();
        fuenteAlimentacion.ensamblarFuenteAlimentacion();
        gabinete.ensamblarGabinete();
        motherboard.ensamblarMotherboard();
    }
}