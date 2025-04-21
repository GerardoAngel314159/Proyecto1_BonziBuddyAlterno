/**
 * Clase que representa la fabrica de RAM.
 */
public class FabricaRAM extends AbstractFactory{

    /**
     * Retorna un objeto RAM segun el tipo especificado.
     *
     * @param tipoComponente El tipo de RAM a crear.
     * @return Objeto de tipo Object, que puede ser un RAM o null.
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getRam(tipoComponente);
    }

    /**
     * Crea y retorna una instancia de RAM en base al tipo especificado.
     *
     * @param tipoRam Tipo de RAM a crear.
     * @return Instancia de RAM correspondiente al parametro, o null si el parametro es null o no es valido.
     */
    public RAM getRam(String tipoRam){
        if(tipoRam == null){
            return null;
        }

        switch (tipoRam.toLowerCase()){
            case "a8" -> {
                return new Adata8GB();
            }
            case "a16" -> {
                return new Adata16GB();
            }
            case "a32" -> {
                return new Adata32GB();
            }
            case "k8" -> {
                return new Kingston8GB();
            }
            case "k16" -> {
                return new Kingston16GB();
            }
            case "k32" -> {
                return new Kingston32GB();
            }
            default -> {
                return null;
            }
        }
    }
}