/**
 * Clase que representa a WLS, software que se puede agregar a la computadora del comprador
 */
public class WLS extends Software{

    /**
     * Constructor de la clase 
     * @param computadoraCentro de tipo Computadora
     */
    public WLS (Computadora computadoraCentro){
        super(computadoraCentro);
    }

    /**
     * Metodo que regresa el nombre de la computadora mas el WLS
     * @return String con valor de el nombre de la computadora mas WLS
     */
    public String getNombre(){
        return computadoraCentro.getNombre + ", WLS";
    }

    /**
     * Metodo que regresa el costo de la computadora mas el costo del software
     * @return Int con valor de la computadora mas el software 
     */
    public int getCosto(){
        return computadoraCentro.getCosto + 250;
    }
}