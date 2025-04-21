/**
 * Fabrica para crear instancias de FuenteAlimentacion segun el tipo.
 * Esta clase extiende de AbstractFactory.
 */
public class FabricaFuenteAlimentacion extends AbstractFactory{

    /**
     * Retorna un componente de FuenteAlimentacion basado en el tipo especificado.
     *
     * @param tipoComponente el tipo del componente a crear.
     * @return una instancia de FuenteAlimentacion segun el tipo, o null si no se reconoce.
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getFuenteAlimentacion(tipoComponente);
    }

    /**
     * Crea y retorna una instancia de FuenteAlimentacion en base al tipo especificado.
     *
     * @param tipoRam el tipo de fuente a crear.
     * @return una instancia especifica de FuenteAlimentacion, o null si el tipo no es valido.
     */
    public FuenteAlimentacion getFuenteAlimentacion(String tipoFuenteDeAlimentacion){
        if(tipoFuenteDeAlimentacion == null){
            return null;
        }

        switch (tipoFuenteDeAlimentacion.toLowerCase()){
            case "ev8" -> {
                return new EVGA800W();
            }
            case "ev10" -> {
                return new EVGA1000W();
            }
            case "ev15" -> {
                return new EVGA1500W();
            }
            case "c8" -> {
                return new Corsair800W();
            }
            case "c12" -> {
                return new Corsair1200W();
            }
            case "c15" -> {
                return new Corsair1500W();
            }
            case "x5" -> {
                return new XPG500W();
            }
            case "x6" -> {
                return new XPG700W();
            }
            case "x10" -> {
                return new XPG1000W();
            }
            default -> {
                return null;
            }
        }
    }
}