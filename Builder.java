
import java.util.ArrayList;

public class Builder{
    private GPU gpu;
    private HDD hdd;
    private SSD ssd;
    private ArrayList<RAM> memoriaRAM;
    private Procesador procesador;
    private FuenteAlimentacion fuenteAlimentacion;
    private Gabinetes gabinete;
    private Motherboard motherboard;
    
    public void ram(RAM ram){
        if(memoriaRAM.size() >= 4){
            System.out.println("No se pueden agregar más de 4 módulos de RAM.");
            return;
        }
        this.memoriaRAM.add(ram);
    }

    public void gpu(GPU gpu){
        this.gpu = gpu;
    }
    
    public void hdd(HDD hdd){
        this.hdd = hdd;
    }

    public void ssd(SSD ssd){
        this.ssd = ssd;
    }

    public void procesador(Procesador procesador){
        this.procesador = procesador;
    }

    public void fuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion){
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public void gabinete(Gabinetes gabinete){
        this.gabinete = gabinete;
    }

    public void motherboard(Motherboard motherboard){
        this.motherboard = motherboard;
    }

    public void muestraEnsamblaje(){

        System.out.println("Hasta ahora el ensamblaje de la computadora es el siguiente:\n");

        gpu.printNombre();
        hdd.printNombre();
        ssd.printNombre();
        for(RAM ram : memoriaRAM){
            ram.printNombre();
        }
        procesador.printNombre();
        fuenteAlimentacion.printNombre();
        gabinete.printNombre();
        motherboard.printNombre();
    }

    public Computadora build(){
        ensamblar();
        return new Computadora(gpu, hdd, ssd, memoriaRAM, procesador, fuenteAlimentacion, gabinete, motherboard);
    }

    private void ensamblar(){
        gpu.ensamblarGpu();
        hdd.ensamblarHDD();
        ssd.ensamblarSSD();
        for(RAM ram : memoriaRAM){
            ram.ensamblarRam();
        }
        procesador.ensamblarProcesador();
        fuenteAlimentacion.ensamblarFuenteAlimentacion();
        gabinete.ensamblarGabinete();
        motherboard.ensamblarMotherboard();
    }

    public void muestraPrecio(){
        double precioTotal = 0;
        precioTotal += gpu.getPrecio();
        precioTotal += hdd.getPrecio();
        precioTotal += ssd.getPrecio();
        for(RAM ram : memoriaRAM){
            precioTotal += ram.getPrecio();
        }
        precioTotal += procesador.getPrecio();
        precioTotal += fuenteAlimentacion.getPrecio();
        precioTotal += gabinete.getPrecio();
        precioTotal += motherboard.getPrecio();

        System.out.println("El precio total de la computadora es: " + precioTotal);
    }

    public void reiniciar(){
        gpu = null;
        hdd = null;
        ssd = null;
        memoriaRAM = new ArrayList<>();
        procesador = null;
        fuenteAlimentacion = null;
        gabinete = null;
        motherboard = null;
    }
} 