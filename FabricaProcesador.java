/**
 * Fabrica para crear instancias de Procesador segun el tipo.
 * Esta clase extiende de AbstractFactory.
 */
public class FabricaProcesador extends AbstractFactory {

    /**
     * Retorna un objeto Procesador basado en el tipo especificado.
     *
     * @param tipoComponente El tipo de Procesador a crear.
     * @return Objeto de tipo Object, que puede ser un Procesador o null.
     */
    @Override
    public Object getComponente(String tipoComponente){
        return getProcesador(tipoComponente);
    }

    /**
     * Crea y retorna una instancia de Procesador en base al tipo especificado.
     *
     * @param tipoProcesador Tipo de Procesador a crear.
     * @return Instancia de Procesador correspondiente al parametro, o null si el parametro es null o no es valido.
     */
    public Procesador getProcesador(String tipoProcesador){
        if(tipoProcesador == null){
            return null;
        }

        switch (tipoProcesador.toLowerCase()){
            case "i3" -> {
                return new Corei3();
            }
            case "i5" -> {
                return new Corei5();
            }
            case "i7" -> {
                return new Corei7();
            }
            case "i9" -> {
                return new Corei9();
            }
            case "r5g" -> {
                return new ProcesadorAMDAdapter(new Ryzen55600G());
            }
            case "r5x" -> {
                return new ProcesadorAMDAdapter(new Ryzen57600X());
            }
            case "r7x" -> {
                return new ProcesadorAMDAdapter(new Ryzen77700X());
            }
            case "r9x" -> {
                return new ProcesadorAMDAdapter(new Ryzen97950X3D());
            }
            case "r5g" ->{
                ProcesadorAMD amd = new Ryzen55600G();             
                return new ProcesadorAMDAdapter(amd);
            }
            case "r5x" ->{
                ProcesadorAMD amd = new Ryzen57600X();             
                return new ProcesadorAMDAdapter(amd);
            }
            case "r7x" ->{
                ProcesadorAMD amd = new Ryzen77700X();             
                return new ProcesadorAMDAdapter(amd);
            }
            case "r9x" ->{
                ProcesadorAMD amd = new Ryzen97950X3D();             
                return new ProcesadorAMDAdapter(amd);
            }
            default -> {
                return null;
            }
        }
    }
}