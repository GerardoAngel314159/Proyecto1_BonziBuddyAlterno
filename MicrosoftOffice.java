import java.util.ArrayList;

/**
 * Clase que representa a Windows 10, software que se puede agregar a la computadora del comprador
 */
public class MicrosoftOffice extends Software{

    /**
     * Constructor de la clase 
     * @param computadoraCentro de tipo Computadora
     */
    public MicrosoftOffice (ComponenteComputadora computadoraCentro){
        super(computadoraCentro);
        if (computadoraCentro.getSoftware().contains("office")){
            throw new IllegalArgumentException("Ya tiene office");
        }
        else
        computadoraCentro.getSoftware().add("office");
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
        return computadoraCentro.getCosto() + 300;
    }

    public ArrayList<String> getSoftware(){
        return computadoraCentro.getSoftware();
    }

    public void exhibir(){
        computadoraCentro.exhibir();
        System.out.println("Software: Microsoft Office");
    }

    public String getTicket(){
        return parcialTicket() + "\n" +"\nCosto total: " + getCosto();
    }

    public String parcialTicket(){
        return computadoraCentro.parcialTicket() + "\nMicrosoft Office";
    }

    public String getDescripcion(){
        return computadoraCentro.getDescripcion() + "\nMicrosoft Office";
    }
}