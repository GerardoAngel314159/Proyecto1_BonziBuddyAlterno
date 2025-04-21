/**
 * Clase que representa la fabrica de Motherboard.
 */
public class FabricaMotherboard extends AbstractFactory{

    /**
     * Retorna un objeto Motherboard basado en el tipo especificado.
     *
     * @param tipoComponente El tipo de Motherboard a crear.
     * @return Objeto de tipo Object, que puede ser un Motherboard o null.
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getMotherboard(tipoComponente);
    }

    /**
     * Crea y retorna una instancia de Motherboard en base al tipo especificado.
     *
     * @param tipoMotherboard Tipo de Motherboard a crear.
     * @return Instancia de Motherboard correspondiente al parametro, o null si el parametro es null o no es valido.
     */
    public Motherboard getMotherboard(String tipoMotherboard){
        if(tipoMotherboard == null){
            return null;
        }

        switch (tipoMotherboard.toLowerCase()){
            case "rog" -> {
                return new ROGMaximusZ790Hero();
            }
            case "tuf" -> {
                return new TUFGamingB760PlusWIFID4();
            }
            case "meg" -> {
                return new MEGGodlike();
            }
            case "mag" -> {
                return new MAGB760TomahawkWIFIDDR4();
            }
            default -> {
                return null;
            }
        }
    }
}