/**
 * Clase que representa a Windows 10, software que se puede agregar a la computadora del comprador
 */
public class Windows10 extends Software{

    /**
     * Constructor de la clase 
     * @param computadoraCentro de tipo Computadora
     */
    public Windows10 (ComponenteComputadora componenteCentral){
        super(componenteCentral);
    }

    /**
     * Metodo que regresa el nombre de la computadora
     * @return String con valor de el nombre de la computadora mas Windows 10
     */
    public String getNombre(){
        return super.getNombre() + ", Windows 10";
    }

    /**
     * Metodo que regresa el costo de la computadora mas el costo del software
     * @return Int con valor de la computadora mas el software 
     */
    public int getCosto(){
        return computadoraCentro.getCosto() + 500;
    }
}