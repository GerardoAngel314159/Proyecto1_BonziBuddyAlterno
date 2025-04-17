/**
 * Clase abstracta que representa a el software con el cual se podra decorar a la computadora en caso
 * de que usuario quiera agregar un software a su computadora
 */
public abstract class Software extends Computadora{

    /**Representa a la computadora a la cual se va a decorar con software */
    protected Computadora computadoraCentro;


    /**
     * Metodo constructor de la clase
     * @param computadoraCentro de tipo Computadora
     */
    public Software(Computadora computadoraCentro){
        this.computadoraCentro = computadoraCentro;
    }

    public String getNombre (){
        return computadoraCentro.getNombre();
    }

    public int getCosto(){
        return computadoraCentro.getCosto();
    }

}