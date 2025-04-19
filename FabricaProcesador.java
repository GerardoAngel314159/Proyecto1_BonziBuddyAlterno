public class FabricaProcesador extends AbstractFactory{
    @Override
    public Object getComponente(String tipoComponente){
        return getProcesador(tipoComponente);
    }


    public Procesador getProcesador(String tipoProcesador){
        if(tipoProcesador == null){
            return null;
        }

        switch (tipoProcesador.toLowerCase()){
            case "corei3" -> {
                return new Corei3();
            }
            case "corei5" -> {
                return new Corei5();
            }
            case "corei7" -> {
                return new Corei7();
            }
            case "corei9" -> {
                return new Corei9();
            }
            default -> throw new AssertionError("Procesador no encontrado");
        }
    }
}   