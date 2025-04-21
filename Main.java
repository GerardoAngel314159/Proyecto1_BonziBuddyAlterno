import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la tienda de computadoras MonosChinos MX");

        System.out.println("\nDesea armar su propia computadora o ver el catalogo?");
        System.out.println("1. Armar computadora");
        System.out.println("2. Ver catalogo");
        System.out.println("3. Salir");

        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = scanner.nextInt();
            while (opcion != 3) {
                switch (opcion) {
                    case 1 -> {
                        armarComputadora();
                        break;
                    }
                    case 2 -> {
                        mostrarCatalogo();
                        break;
                    }
                    default -> System.out.println("Opcion no valida");
                }
                System.out.println("\nDesea armar su propia computadora o ver el catalogo?");
                System.out.println("1. Armar computadora");
                System.out.println("2. Ver catalogo");
                System.out.println("3. Salir");
                opcion = scanner.nextInt();
            }
        }
    }

    /**
     * Muestra en consola el catalogo de computadoras prehechas y permite al usuario seleccionar una.
     */
    public static void mostrarCatalogo(){
        Catalogo catalogo = new Catalogo();
        ComponenteComputadora pc = catalogo.computadorasPrehechas();
        if (pc != null) {
            System.out.println("\nHas seleccionado la computadora prehecha: " + pc.getNombre());
            System.out.println("Aqui esta su ticket");
            System.out.println(pc.getTicket());
        } else {
            System.out.println("\nNo se selecciono ninguna computadora prehecha.");
        }
    }

    /**
     * Permite al usuario armar su propia computadora mediante opciones interactivas.
     */
    public static void armarComputadora(){
        Tecnologo tecnologo = new Tecnologo();

        AbstractFactory gabinetes = tecnologo.getFactory(Tipo.GABINETE);
        AbstractFactory procesadores = tecnologo.getFactory(Tipo.PROCESADOR);
        AbstractFactory motherboards = tecnologo.getFactory(Tipo.MOTHERBOARD);
        AbstractFactory ram = tecnologo.getFactory(Tipo.MEMORIA_RAM);
        AbstractFactory ssd = tecnologo.getFactory(Tipo.SSD);
        AbstractFactory hdd = tecnologo.getFactory(Tipo.HDD);
        AbstractFactory gpu = tecnologo.getFactory(Tipo.GPU);
        AbstractFactory fuenteAlimentacion = tecnologo.getFactory(Tipo.FUENTE_ALIMENTACION);

        Builder builder = new Builder();
        Catalogo catalogo = new Catalogo();
        Scanner sc = new Scanner(System.in);
        String opcion;

        System.out.println("\nVamos a armar tu computadora, para cada componente usa el codigo en parentesis");
        pedirGabinete(builder, gabinetes);
        pedirProcesador(builder, procesadores);
        pedirMotherboard(builder, motherboards);
        pedirFuenteAlimentacion(builder, fuenteAlimentacion);
        pedirGPU(builder, gpu);
        pedirHDD(builder, hdd);
        pedirSSD(builder, ssd);
        for (int i = 0; i < 4; i++) {
            pedirRAM(builder, ram);
            System.out.println("Deseas agregar otro modulo de RAM? (si/no)");
            opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("si")) {
                pedirRAM(builder, ram);
            } else {
                break;
            }
        }

        builder.nombre("Computadora personalizada");
        System.out.println("Felicidades! Has ensamblado tu computadora con los siguientes componentes:");
        ComponenteComputadora pc = builder.build();
        System.out.println(pc.getDescripcion());

        pc = agregarSoftware(pc);
        System.out.println(pc.getTicket());
    }

    /**
     * Permite al usuario agregar software adicional a la computadora ensamblada.
     *
     * @param pc Computadora sobre la cual se agregara software.
     * @return La computadora decorada con el software adicional.
     */
    private static ComponenteComputadora agregarSoftware(ComponenteComputadora pc){
        System.out.println("\nDeseas agregar software adicional? (si/no)");
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();

        while(true){
            if (opcion.equalsIgnoreCase("si")) {
                System.out.println("\nQue software deseas agregar?");
                System.out.println("1. Windows 10");
                System.out.println("2. Windows 11");
                System.out.println("3. WLS");
                System.out.println("4. Photoshop");
                System.out.println("5. Microsoft Office");
                System.out.println("6. Autocad");
                System.out.println("7. Ninguno");
                int opcionSoftware = sc.nextInt();
                switch (opcionSoftware) {
                    case 1 -> {
                        if (pc.getSoftware().contains("windows10")) {
                            System.out.println("Ya tiene Windows 10");
                        } else {
                            pc = new Windows10(pc);
                        }
                    }
                    case 2 -> {
                        if (pc.getSoftware().contains("windows11")) {
                            System.out.println("Ya tiene Windows 11");
                        } else {
                            pc = new Windows11(pc);
                        }
                    }
                    case 3 -> {
                        if (pc.getSoftware().contains("wls")) {
                            System.out.println("Ya tiene WLS");
                        } else {
                            pc = new WLS(pc);
                        }
                    }
                    case 4 -> {
                        if (pc.getSoftware().contains("photoshop")) {
                            System.out.println("Ya tiene Photoshop");
                        } else {
                            pc = new Photoshop(pc);
                        }
                    }
                    case 5 -> {
                        if (pc.getSoftware().contains("office")) {
                            System.out.println("Ya tiene Microsoft Office");
                        } else {
                            pc = new MicrosoftOffice(pc);
                        }
                    }
                    case 6 -> {
                        if (pc.getSoftware().contains("autocad")) {
                            System.out.println("Ya tiene Autocad");
                        } else {
                            pc = new Autocad(pc);
                        }
                    }
                    default -> System.out.println("Opcion no valida.");
                }
            } else break;
            System.out.println("\nDeseas agregar software adicional? (si/no)");
            opcion = sc.nextLine();
            opcion = sc.nextLine();
        }
        return pc;
    }

    /**
     * Solicita al usuario seleccionar un gabinete a partir del catalogo y configura el Builder.
     *
     * @param builder Objeto Builder utilizado para ensamblar la computadora.
     * @param gabinetes Fabrica de gabinetes.
     */
    public static void pedirGabinete(Builder builder, AbstractFactory gabinetes){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("\nPor favor selecciona el gabinete:");
        Catalogo catalogo = new Catalogo();
        catalogo.mostrarGabinetes();
        while(true){
            opcion = sc.nextLine();
            Gabinetes gabinete = (Gabinetes)gabinetes.getComponente(opcion);
            builder.gabinete(gabinete);
            if(gabinete != null){
                gabinete.ensamblarGabinete();
                System.out.println("Has seleccionado el gabinete: " + gabinete.getNombre());
                break;
            } else {
                System.out.println("Opcion no valida, por favor selecciona otro gabinete:");
                catalogo.mostrarGabinetes();
            }
        }
    }

    /**
     * Solicita al usuario seleccionar un procesador a partir del catalogo y configura el Builder.
     *
     * @param builder Objeto Builder utilizado para ensamblar la computadora.
     * @param procesadores Fabrica de procesadores.
     */
    public static void pedirProcesador(Builder builder, AbstractFactory procesadores){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("\nPor favor selecciona el procesador:");
        Catalogo catalogo = new Catalogo();
        catalogo.mostrarProcesadores();
        while(true){
            opcion = sc.nextLine();
            Procesador procesador = (Procesador)procesadores.getComponente(opcion);
            builder.procesador(procesador);
            if(procesador != null){
                procesador.ensamblarProcesador();
                System.out.println("Has seleccionado el procesador: " + procesador.getNombre());
                break;
            } else {
                System.out.println("Opcion no valida, por favor selecciona otro procesador:");
                catalogo.mostrarProcesadores();
            }
        }
    }

    /**
     * Solicita al usuario seleccionar una motherboard a partir del catalogo y configura el Builder.
     *
     * @param builder Objeto Builder utilizado para ensamblar la computadora.
     * @param motherboards Fabrica de motherboards.
     */
    public static void pedirMotherboard(Builder builder, AbstractFactory motherboards){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("\nPor favor selecciona la motherboard:");
        Catalogo catalogo = new Catalogo();
        catalogo.mostrarMotherboards();
        while(true){
            opcion = sc.nextLine();
            Motherboard motherboard = (Motherboard)motherboards.getComponente(opcion);
            builder.motherboard(motherboard);
            if(motherboard != null){
                motherboard.ensamblarMotherboard();
                System.out.println("Has seleccionado la motherboard: " + motherboard.getNombre());
                break;
            } else {
                System.out.println("Opcion no valida, por favor selecciona otra motherboard:");
                catalogo.mostrarMotherboards();
            }
        }
    }

    /**
     * Solicita al usuario seleccionar una fuente de alimentacion a partir del catalogo y configura el Builder.
     *
     * @param builder Objeto Builder utilizado para ensamblar la computadora.
     * @param fuenteAlimentacion Fabrica de fuentes de alimentacion.
     */
    public static void pedirFuenteAlimentacion(Builder builder, AbstractFactory fuenteAlimentacion){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("\nPor favor selecciona la fuente de alimentacion:");
        Catalogo catalogo = new Catalogo();
        catalogo.mostrarFuentesAlimentacion();
        while(true){
            opcion = sc.nextLine();
            FuenteAlimentacion fuente = (FuenteAlimentacion)fuenteAlimentacion.getComponente(opcion);
            builder.fuenteAlimentacion(fuente);
            if(fuente != null){
                fuente.ensamblarFuenteAlimentacion();
                System.out.println("Has seleccionado la fuente de alimentacion: " + fuente.getNombre());
                break;
            } else {
                System.out.println("Opcion no valida, por favor selecciona otra fuente de alimentacion:");
                catalogo.mostrarFuentesAlimentacion();
            }
        }
    }

    /**
     * Solicita al usuario seleccionar una GPU a partir del catalogo y configura el Builder.
     *
     * @param builder Objeto Builder utilizado para ensamblar la computadora.
     * @param gpu Fabrica de tarjetas de video (GPU).
     */
    public static void pedirGPU(Builder builder, AbstractFactory gpu){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("\nPor favor selecciona la GPU:");
        Catalogo catalogo = new Catalogo();
        catalogo.mostrarGPU();
        while(true){
            opcion = sc.nextLine();
            GPU gpuSeleccionada = (GPU)gpu.getComponente(opcion);
            builder.gpu(gpuSeleccionada);
            if(gpuSeleccionada != null){
                gpuSeleccionada.ensamblarGpu();
                System.out.println("Has seleccionado la GPU: " + gpuSeleccionada.getNombre());
                break;
            } else {
                System.out.println("Opcion no valida, por favor selecciona otra GPU:");
                catalogo.mostrarGPU();
            }
        }
    }

    /**
     * Solicita al usuario seleccionar un HDD a partir del catalogo y configura el Builder.
     *
     * @param builder Objeto Builder utilizado para ensamblar la computadora.
     * @param hdd Fabrica de discos duros (HDD).
     */
    public static void pedirHDD(Builder builder, AbstractFactory hdd){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("\nPor favor selecciona el HDD:");
        Catalogo catalogo = new Catalogo();
        catalogo.mostrarHDD();
        while(true){
            opcion = sc.nextLine();
            HDD hddSeleccionada = (HDD)hdd.getComponente(opcion);
            builder.hdd(hddSeleccionada);
            if(hddSeleccionada != null){
                hddSeleccionada.ensamblarHDD();
                System.out.println("Has seleccionado el HDD: " + hddSeleccionada.getNombre());
                break;
            } else {
                System.out.println("Opcion no valida, por favor selecciona otro HDD:");
                catalogo.mostrarHDD();
            }
        }
    }

    /**
     * Solicita al usuario seleccionar un SSD a partir del catalogo y configura el Builder.
     *
     * @param builder Objeto Builder utilizado para ensamblar la computadora.
     * @param ssd Fabrica de discos SSD.
     */
    public static void pedirSSD(Builder builder, AbstractFactory ssd){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("\nPor favor selecciona el SSD:");
        Catalogo catalogo = new Catalogo();
        catalogo.mostrarSSD();
        while(true){
            opcion = sc.nextLine();
            SSD ssdSeleccionada = (SSD)ssd.getComponente(opcion);
            builder.ssd(ssdSeleccionada);
            if(ssdSeleccionada != null){
                ssdSeleccionada.ensamblarSSD();
                System.out.println("Has seleccionado el SSD: " + ssdSeleccionada.getNombre());
                break;
            } else {
                System.out.println("Opcion no valida, por favor selecciona otro SSD:");
                catalogo.mostrarSSD();
            }
        }
    }

    /**
     * Solicita al usuario seleccionar un modulo de RAM a partir del catalogo y lo agrega al Builder.
     *
     * @param builder Objeto Builder utilizado para ensamblar la computadora.
     * @param ram Fabrica de modulos de RAM.
     */
    public static void pedirRAM(Builder builder, AbstractFactory ram){
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("\nPor favor selecciona la RAM:");
        Catalogo catalogo = new Catalogo();
        catalogo.mostrarRAM();
        while(true){
            opcion = sc.nextLine();
            RAM ramSeleccionada = (RAM)ram.getComponente(opcion);
            builder.ram(ramSeleccionada);
            if(ramSeleccionada != null){
                ramSeleccionada.ensamblarRam();
                System.out.println("Has seleccionado la RAM: " + ramSeleccionada.getNombre());
                break;
            } else {
                System.out.println("Opcion no valida, por favor selecciona otra RAM:");
                catalogo.mostrarRAM();
            }
        }
    }
}