import java.util.ArrayList;

public class Computadora implements ComponenteComputadora{

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

    private void descripcion(){
        descripcion = "Computadora ensamblada:";
        descripcion += "\nGPU: " + gpu.getNombre();
        descripcion += "\nHDD: " + hdd.getNombre();
        descripcion += "\nSSD: " + ssd.getNombre();
        for(RAM ram : memoriaRAM){
            descripcion += "\nRAM: " + ram.getNombre();
        }
        descripcion += "\nProcesador: " + procesador.getNombre();
        descripcion += "\nFuente de Alimentación: " + fuenteAlimentacion.getNombre();
        descripcion += "\nGabinete: " + gabinete.getNombre();
        descripcion += "\nMotherboard: " + motherboard.getNombre();
    }

    private void costo(){
        costo = gpu.getPrecio() + 
        hdd.getPrecio() + 
        ssd.getPrecio() + 
        procesador.getPrecio() + 
        fuenteAlimentacion.getPrecio() + 
        gabinete.getPrecio() + 
        motherboard.getPrecio();
        for(RAM ram : memoriaRAM){
            costo += ram.getPrecio();
        }
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getCosto(){
        return costo;
    }

    @Override
    public String getTicket(){

        String ticket = parcialTicket();
        ticket += "\nninguno";
        ticket += "\nCosto total " + costo + "\n";
        return ticket;
    }

    public String parcialTicket(){
        String ticket = "Ticket de compra: \n";
        ticket += "Computadora " + nombre + "\n";
        ticket += "\nComponentes:";
        ticket += "\n\tGPU: " + gpu.getNombre() + " " + gpu.getPrecio();
        ticket += "\n\tHDD: " + hdd.getNombre() + " " + hdd.getPrecio();
        ticket += "\n\tSSD: " + ssd.getNombre() + " " + ssd.getPrecio();
        for(RAM ram : memoriaRAM){
            ticket += "\tRAM: " + ram.getNombre() + " " + ram.getPrecio();
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

    public void exhibir(){
        System.out.println(getTicket());
    }

    public ArrayList<String> getSoftware(){
        return software;
    }
}