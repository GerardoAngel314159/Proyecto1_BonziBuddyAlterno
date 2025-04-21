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
            default -> {
                return null;
            }
        }
    }
}   