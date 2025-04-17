/**
 * Clase que representa MicrosoftOficce, software que se puede agregar a la computadora del comprador
 */
public class MicrosoftOffice extends Software{

    /**
     * Constructor de la clase 
     * @param computadoraCentro de tipo Computadora
     */
    public MicrosoftOffice (Computadora computadoraCentro){
        super(computadoraCentro);
    }

    /**
     * Metodo que regresa el nombre de la computadora mas MicrosoftOffice
     * @return String con valor de la computadora mas el software MicrosoftOffice
     */
    public String getNombre(){
        return computadoraCentro.getNombre + ", MicrosoftOffice";
    }

    /**
     * Metodo que regresa el costo de la computadora mas el costo del software
     * @return Int con valor de la computadora mas el software 
     */
    public int getCosto(){
        return computadoraCentro.getCosto + 300;
    }
}
