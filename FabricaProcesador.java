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