import java.util.ArrayList;

/**
 * Clase que representa a Windows 10, software que se puede agregar a la computadora del comprador
 */
public class Photoshop extends Software{

    /**
     * Constructor de la clase 
     * @param computadoraCentro de tipo Computadora
     */
    public Photoshop (ComponenteComputadora computadoraCentro){
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("photoshop")){
            throw new IllegalArgumentException("Ya tiene Photoshop");
        }
        else
        computadoraCentro.getSoftware().add("photoshop");
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
        return computadoraCentro.getCosto() + 350;
    }

    public ArrayList<String> getSoftware(){
        return computadoraCentro.getSoftware();
    }

    public void exhibir(){
        System.out.println(computadoraCentro.parcialTicket());
        System.out.println("\nSoftware: Photoshop");
    }

    public String getTicket(){
        return parcialTicket() + "\n" + "\nCosto total: " + getCosto();
    }

    public String parcialTicket(){
        return computadoraCentro.parcialTicket() + "\nPhotoshop";
    }

    public String getDescripcion(){
        return computadoraCentro.getDescripcion() + "\nPhotoshop";
    }
}