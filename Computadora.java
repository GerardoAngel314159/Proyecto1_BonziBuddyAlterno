import java.util.ArrayList;

public class Computadora{

    private GPU gpu;
    private HDD hdd;
    private SSD ssd;
    private ArrayList<RAM> memoriaRAM;
    private Procesador procesador;
    private FuenteAlimentacion fuenteAlimentacion;
    private Gabinetes gabinete;
    private Motherboard motherboard;
    private double precioTotal;
    private String nombre;

    public Computadora(GPU gpu, HDD hdd, SSD ssd, ArrayList<RAM> memoriaRAM, Procesador procesador, FuenteAlimentacion fuenteAlimentacion, Gabinetes gabinete, Motherboard motherboard) {
        this.gpu = gpu;
        this.hdd = hdd;
        this.ssd = ssd;
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.fuenteAlimentacion = fuenteAlimentacion;
        this.gabinete = gabinete;
        this.motherboard = motherboard;

        nombre();
        precioTotal();
    }

    public void nombre(){
        nombre = "Computadora ensamblada:";
        nombre += "\nGPU: " + gpu.getNombre();
        nombre += "\nHDD: " + hdd.getNombre();
        nombre += "\nSSD: " + ssd.getNombre();
        for(RAM ram : memoriaRAM){
            nombre += "\nRAM: " + ram.getNombre();
        }
        nombre += "\nProcesador: " + procesador.getNombre();
        nombre += "\nFuente de Alimentación: " + fuenteAlimentacion.getNombre();
        nombre += "\nGabinete: " + gabinete.getNombre();
        nombre += "\nMotherboard: " + motherboard.getNombre();
    }

    private void precioTotal(){
        precioTotal = gpu.getPrecio() + 
        hdd.getPrecio() + 
        ssd.getPrecio() + 
        procesador.getPrecio() + 
        fuenteAlimentacion.getPrecio() + 
        gabinete.getPrecio() + 
        motherboard.getPrecio();
        for(RAM ram : memoriaRAM){
            precioTotal += ram.getPrecio();
        }
    }

    public void exhibir(){
        System.out.println(nombre);
        System.out.println("\nPrecio total: " + precioTotal);
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
        nombre();
        precioTotal();
    }
    public void setHdd(HDD hdd) {
        this.hdd = hdd;
        nombre();
        precioTotal();
    }
    public void setSsd(SSD ssd) {
        this.ssd = ssd;
        nombre();
        precioTotal();
    }
    public void setMemoriaRAM(ArrayList<RAM> memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        nombre();
        precioTotal();
    }
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
        nombre();
        precioTotal();
    }
    public void setFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
        nombre();
        precioTotal();
    }
    public void setGabinete(Gabinetes gabinete) {
        this.gabinete = gabinete;
        nombre();
        precioTotal();
    }
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
        nombre();
        precioTotal();
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }
}