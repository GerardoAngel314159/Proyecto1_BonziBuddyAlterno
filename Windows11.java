import java.util.ArrayList;

/**
 * Clase que representa a Windows 10, software que se puede agregar a la computadora del comprador
 */
public class Windows11 extends Software{

    /**
     * Constructor de la clase 
     * @param computadoraCentro de tipo Computadora
     */
    public Windows11 (ComponenteComputadora computadoraCentro){
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("windows11")){
            throw new IllegalArgumentException("Ya tiene Windows 11");
        }
        else
        computadoraCentro.getSoftware().add("windows11");
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
        return computadoraCentro.getCosto() + 600;
    }

    public ArrayList<String> getSoftware(){
        return computadoraCentro.getSoftware();
    }

    public void exhibir(){
        System.out.println(computadoraCentro.parcialTicket());

        System.out.println("Software: Windows 11");
    }

    public String getTicket(){
        
        return parcialTicket() + "\n" + "\nCosto total: " + getCosto();
    }

    public String parcialTicket(){
        return computadoraCentro.parcialTicket() + "\nWindows 11";
    }

    public String getDescripcion(){
        return computadoraCentro.getDescripcion() + "\nWindows 11";
    }
}