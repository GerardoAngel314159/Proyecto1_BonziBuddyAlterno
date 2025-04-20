/**
 * Clase que representa a la fabrica de los gabinetes
 */
public class FabricaGabinetes extends AbstractFactory{

    /**
     * Metodo que llama a getGabiente y retorna un null o un objeto de tipo Gabinete
     * @param String tipoComponente con valor a el Gabinete que se quiere crear
     * @return objeto de tipo Object, puede ser null o Gabinete
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getGabinete(tipoComponente);
    }


    /**
     * Metodo el cual obtiene el gabinete que se quiere crear 
     * @param tipoGabinete
     * @return null en caso de que el parametro sea null
     * @return Objeto de tipo Gabinete segun el valor del parametro mientras no sea null
     */
    public Gabinetes getGabinete(String tipoGabinete){
        if(tipoGabinete == null){
            return null;
        }

        switch (tipoGabinete.toLowerCase()){
            case "h6flowatx" -> {
                return new H6FlowATX();
            }
            case "lanceratx" -> {
                return new LancerATX();
            }
            default -> throw new AssertionError("Gabinete no encontrado");
        }
    }
}