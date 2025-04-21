/**
 * Clase abstracta que representa a el software con el cual se podra decorar a la computadora en caso
 * de que usuario quiera agregar un software a su computadora
 */
public abstract class Software implements ComponenteComputadora{

    /**Representa a la computadora a la cual se va a decorar con software */
    protected ComponenteComputadora computadoraCentro;

    protected Boolean Windows10 = false;
    protected Boolean Windows11 = false;
    protected Boolean Photoshop = false;
    protected Boolean Office = false;
    protected Boolean Autocad = false;
    protected Boolean WSL = false;

    /**
     * 
     * Metodo constructor de la clase
     * @param computadoraCentro de tipo Computadora
     */
    public Software(ComponenteComputadora computadoraCentro){
        this.computadoraCentro = computadoraCentro;
    }

    public String getNombre (){
        return computadoraCentro.getNombre();
    }

    public double getCosto(){
        return computadoraCentro.getCosto();
    }

    public Boolean hayWindows10(){
        return Windows10;
    }

    public Boolean hayWindows11(){
        return Windows11;
    }

    public Boolean hayPhotoshop(){
        return Photoshop;
    }

    public Boolean hayOffice(){
        return Office;
    }

    public Boolean hayAutocad(){
        return Autocad;
    }

    public Boolean hayWSL(){
        return WSL;
    }
}