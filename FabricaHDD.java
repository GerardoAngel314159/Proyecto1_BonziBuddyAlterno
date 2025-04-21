/**
 * Clase que representa la fabrica de HDD.
 */
public class FabricaHDD extends AbstractFactory{

    /**
     * Retorna un objeto HDD basado en el tipo especificado.
     *
     * @param tipoComponente El tipo de HDD a crear.
     * @return Objeto de tipo Object, que puede ser un HDD o null.
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getHDD(tipoComponente);
    }

    /**
     * Crea y retorna una instancia de HDD en base al tipo especificado.
     *
     * @param tipoHDD Tipo de HDD a crear.
     * @return Objeto de tipo HDD correspondiente al parametro, o null si el parametro es null o no es valido.
     */
    public HDD getHDD(String tipoHDD){
        if(tipoHDD == null){
            return null;
        }

        switch (tipoHDD.toLowerCase()){
            case "sb1" -> {
                return new SeagateHDD1TB();
            }
            case "sb2" -> {
                return new SeagateHDD2TB();
            }
            case "wdb5" -> {
                return new WesternHDD500GB();
            }
            case "wdb1" -> {
                return new WesternHDD1TB();
            }
            default -> {
                return null;
            }
        }
    }
}