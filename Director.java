public class Director{
    private final AbstractFactory gabinetes;
    private final AbstractFactory procesadores;
    private final AbstractFactory motherboards;
    private final AbstractFactory ram;
    private final AbstractFactory ssd;
    private final AbstractFactory hdd;
    private final AbstractFactory gpu;
    private final AbstractFactory fuenteAlimentacion;

    public Director(){
        gabinetes = new FabricaGabinetes();
        procesadores = new FabricaProcesador();
        motherboards = new FabricaMotherboard();
        ram = new FabricaRAM();
        ssd = new FabricaSSD();
        hdd = new FabricaHDD();
        gpu = new FabricaGPU();
        fuenteAlimentacion = new FabricaFuenteAlimentacion();
    }


    public ComponenteComputadora compuOficina(Builder builder){
        builder.reiniciar();
        String[] codigos = {
                "latx", // Gabinete
                "i3", // Procesador
                "tuf", // Motherboard
                "k8", // RAM
                "k500", // SSD
                "wdb1", // HDD
                "r306", // GPU
                "c8"  // Fuente de Alimentación
        };
        Ensambla(builder, codigos);
        builder.nombre("Computadora de Oficina");

        ComponenteComputadora pc = builder.build();
        pc = new Windows10(pc);
        pc = new MicrosoftOffice(pc);
        return pc;
    }

    public ComponenteComputadora compuGamer(Builder builder){
        builder.reiniciar();
        String[] codigos = {
                "h6f", // Gabinete
                "i9", // Procesador
                "rog", // Motherboard
                "a32", // RAM
                "k4", // SSD
                "sb2", // HDD
                "r409", // GPU
                "ev15"  // Fuente de Alimentación
        };
        Ensambla(builder, codigos);
        builder.ram((RAM)ram.getComponente("a32"));
        builder.nombre("Computadora Gamer");

        ComponenteComputadora pc = builder.build();
        pc = new Windows11(pc);
        pc = new Autocad(pc);

        return pc;
    }

    private void Ensambla(Builder builder, String[] codigos){
        builder.gabinete((Gabinetes)gabinetes.getComponente(codigos[0]));
        builder.procesador((Procesador)procesadores.getComponente(codigos[1]));
        builder.motherboard((Motherboard)motherboards.getComponente(codigos[2]));
        builder.ram((RAM)ram.getComponente(codigos[3]));
        builder.ssd((SSD)ssd.getComponente(codigos[4]));
        builder.hdd((HDD)hdd.getComponente(codigos[5]));
        builder.gpu((GPU)gpu.getComponente(codigos[6]));
        builder.fuenteAlimentacion((FuenteAlimentacion)fuenteAlimentacion.getComponente(codigos[7]));
    }
}