/**
 * Clase que representa la fabrica de GPU.
 */
public class FabricaGPU extends AbstractFactory{

    /**
     * Retorna un objeto GPU basado en el tipo especificado.
     *
     * @param tipoComponente El tipo de GPU a crear.
     * @return Objeto de tipo Object, que puede ser un GPU o null.
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getGPU(tipoComponente);
    }

    /**
     * Crea y retorna una instancia de GPU en base al tipo especificado.
     *
     * @param tipoGPU Tipo de GPU a crear.
     * @return Objeto de tipo GPU correspondiente al parametro, o null si el parametro es null o no es valido.
     */
    public GPU getGPU(String tipoGPU){
        if(tipoGPU == null){
            return null;
        }

        switch (tipoGPU.toLowerCase()) {
            case "r306":
                return new RTX3060();
            case "r407":
                return new RTX4070();
            case "r408":
                return new RTX4080();
            case "r409":
                return new RTX4090();
            case "g166":
                return new GTX1660();
            default:
                return null;
        }
    }
}