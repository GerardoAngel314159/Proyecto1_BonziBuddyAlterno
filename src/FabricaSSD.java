/**
 * Clase que representa la fabrica de SSD.
 */
public class FabricaSSD extends AbstractFactory{

    /**
     * Retorna un objeto SSD segun el tipo especificado.
     *
     * @param tipoComponente El tipo de SSD a crear.
     * @return Objeto de tipo Object, que puede ser un SSD.
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getSSD(tipoComponente);
    }

    /**
     * Crea y retorna una instancia de SSD en base al tipo especificado.
     *
     * @param tipoSSD Tipo de SSD a crear.
     * @return Instancia de SSD correspondiente al parametro.
     * @throws AssertionError Si el tipoSSD no coincide con ningun SSD disponible.
     */
    public SSD getSSD(String tipoSSD){
        if(tipoSSD == null){
            return null;
        }

        switch (tipoSSD.toLowerCase()){
            case "k500" -> {
                return new SSD500GB();
            }
            case "k1" -> {
                return new SSD1TB();
            }
            case "k2" -> {
                return new SSD2TB();
            }
            case "k4" -> {
                return new SSD4TB();
            }
            default -> {
                return null;
            }
        }
    }
}