/**
 * Clase Director que se encarga de coordinar el proceso de ensamblaje de computadoras
 * preconfiguradas. Utiliza diversas fábricas (AbstractFactory) para obtener los componentes
 * necesarios y un Builder para ensamblarlos en una Computadora final.
 */
public class Director {
    /**
     * Fábrica para obtener gabinetes.
     */
    private final AbstractFactory gabinetes;

    /**
     * Fábrica para obtener procesadores.
     */
    private final AbstractFactory procesadores;

    /**
     * Fábrica para obtener motherboards.
     */
    private final AbstractFactory motherboards;

    /**
     * Fábrica para obtener módulos de memoria RAM.
     */
    private final AbstractFactory ram;

    /**
     * Fábrica para obtener unidades de estado sólido (SSD).
     */
    private final AbstractFactory ssd;

    /**
     * Fábrica para obtener discos duros (HDD).
     */
    private final AbstractFactory hdd;

    /**
     * Fábrica para obtener tarjetas de video (GPU).
     */
    private final AbstractFactory gpu;

    /**
     * Fábrica para obtener fuentes de alimentación.
     */
    private final AbstractFactory fuenteAlimentacion;

    /**
     * Constructor de la clase Director.
     * Inicializa las fábricas correspondientes a cada componente.
     */
    public Director() {
        gabinetes = new FabricaGabinetes();
        procesadores = new FabricaProcesador();
        motherboards = new FabricaMotherboard();
        ram = new FabricaRAM();
        ssd = new FabricaSSD();
        hdd = new FabricaHDD();
        gpu = new FabricaGPU();
        fuenteAlimentacion = new FabricaFuenteAlimentacion();
    }

    /**
     * Ensambla una computadora configurada para el uso de oficina.
     * Utiliza el Builder para configurar cada componente a partir de códigos predefinidos,
     * asigna un nombre y decora la computadora con software adicional (Windows 10 y Microsoft Office).
     *
     * @param builder Objeto Builder que se utiliza para ensamblar la computadora.
     * @return Instancia de ComponenteComputadora que representa la computadora de oficina.
     */
    public ComponenteComputadora compuOficina(Builder builder) {
        builder.reiniciar();
        String[] codigos = {
            "latx", // Gabinete
            "i3",   // Procesador
            "tuf",  // Motherboard
            "k8",   // RAM
            "k500", // SSD
            "wdb1", // HDD
            "r306", // GPU
            "c8"    // Fuente de Alimentación
        };
        Ensambla(builder, codigos);
        builder.nombre("Computadora de Oficina");

        // Construir la computadora y agregar software adicional
        ComponenteComputadora pc = builder.build();
        pc = new Windows10(pc);
        pc = new MicrosoftOffice(pc);
        return pc;
    }

    /**
     * Ensambla una computadora configurada para uso Gamer.
     * Utiliza el Builder para configurar cada componente a partir de códigos predefinidos,
     * asigna un nombre y decora la computadora con software adicional (Windows 11 y Autocad).
     *
     * @param builder Objeto Builder que se utiliza para ensamblar la computadora.
     * @return Instancia de ComponenteComputadora que representa la computadora gamer.
     */
    public ComponenteComputadora compuGamer(Builder builder) {
        builder.reiniciar();
        String[] codigos = {
            "h6f", // Gabinete
            "i9",  // Procesador
            "rog", // Motherboard
            "a32", // RAM
            "k4",  // SSD
            "sb2", // HDD
            "r409",// GPU
            "ev15" // Fuente de Alimentación
        };
        Ensambla(builder, codigos);
        // Se agrega un modulo de RAM adicional específico para esta configuración
        builder.ram((RAM) ram.getComponente("a32"));
        builder.nombre("Computadora Gamer");

        // Construir la computadora y agregar software adicional
        ComponenteComputadora pc = builder.build();
        pc = new Windows11(pc);
        pc = new Autocad(pc);

        return pc;
    }

    /**
     * Método privado que configura cada componente de la computadora utilizando el Builder.
     * Obtiene cada componente a partir de los códigos predefinidos a través de las fábricas.
     *
     * @param builder Objeto Builder que se utiliza para ensamblar la computadora.
     * @param codigos Array de String que contiene los códigos de los componentes en el siguiente orden:
     *                0 - Gabinete
     *                1 - Procesador
     *                2 - Motherboard
     *                3 - RAM
     *                4 - SSD
     *                5 - HDD
     *                6 - GPU
     *                7 - Fuente de Alimentación
     */
    private void Ensambla(Builder builder, String[] codigos) {
        builder.gabinete((Gabinetes) gabinetes.getComponente(codigos[0]));
        builder.procesador((Procesador) procesadores.getComponente(codigos[1]));
        builder.motherboard((Motherboard) motherboards.getComponente(codigos[2]));
        builder.ram((RAM) ram.getComponente(codigos[3]));
        builder.ssd((SSD) ssd.getComponente(codigos[4]));
        builder.hdd((HDD) hdd.getComponente(codigos[5]));
        builder.gpu((GPU) gpu.getComponente(codigos[6]));
        builder.fuenteAlimentacion((FuenteAlimentacion) fuenteAlimentacion.getComponente(codigos[7]));
    }
}