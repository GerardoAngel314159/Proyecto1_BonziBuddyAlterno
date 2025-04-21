import java.util.ArrayList;

/**
 * Clase que representa a Windows 10, software que se puede agregar a la computadora del comprador
 */
public class WLS extends Software{

    /**
     * Constructor de la clase 
     * @param computadoraCentro de tipo Computadora
     */
    public WLS (ComponenteComputadora computadoraCentro){
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("wls")){
            throw new IllegalArgumentException("Ya tiene WLS");
        }
        else
        computadoraCentro.getSoftware().add("wls");
    }

    /**
     * Metodo que regresa el nombre de la computadora
     * @return String con valor de el nombre de la computadora mas Windows 10
     */
    public String getNombre(){
        return super.getNombre();
    }

    /**
     * Metodo que regresa el costo de la computadora mas el costo del software
     * @return Int con valor de la computadora mas el software 
     */
    public double getCosto(){
        return computadoraCentro.getCosto() + 250;
    }

    public ArrayList<String> getSoftware(){
        return computadoraCentro.getSoftware();
    }

    public void exhibir(){
        computadoraCentro.exhibir();
        System.out.println("\nSoftware: WLS");
    }

    public String getTicket(){
        return parcialTicket() + "\n" + "\nCosto total: " + getCosto();
    }

    public String parcialTicket(){
        return computadoraCentro.parcialTicket() + "\nWLS";
    }

    public String getDescripcion(){
        return computadoraCentro.getDescripcion() + "\nWLS";
    }
}