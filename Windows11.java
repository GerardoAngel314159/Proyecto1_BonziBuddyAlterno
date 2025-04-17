/**
 * Clase que representa a WIndows 11, software que se puede agregar a la computadora del comprador
 */
public class Windows11 extends Software{

    /**
     * Constructor de la clase 
     * @param computadoraCentro de tipo Computadora
     */
    public Windows11 (Computadora computadoraCentro){
        super(computadoraCentro);
    }

    /**
     * Metodo que regresa el nombre de la computadora
     * @return String con valor de wl nombre de la computadora mas Windows 11
     */
    public String getNombre(){
        return computadoraCentro.getNombre + ", Windows 11";
    }

    /**
     * Metodo que regresa el costo de la computadora mas el costo del software
     * @return Int con valor de la computadora mas el software 
     */
    public int getCosto(){
        return computadoraCentro.getCosto + 750;
    }
}