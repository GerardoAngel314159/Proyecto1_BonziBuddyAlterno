public class FabricaHDD extends AbstractFactory{
    @Override
    public Object getComponente(String tipoComponente){
        return getHDD(tipoComponente);
    }


    public HDD getHDD(String tipoHDD){
        if(tipoHDD == null){
            return null;
        }

        switch (tipoHDD.toLowerCase()){
            case "seagatehdd1tb" -> {
                return new SeagateHDD1TB();
            }
            case "seagatehdd2tb" -> {
                return new SeagateHDD2TB();
            }
            case "westernhdd500gb" -> {
                return new WesternHDD500GB();
            }
            case "westernhdd1tb" -> {
                return new WesternHDD1TB();
            }
            default -> throw new AssertionError("HDD no encontrada");
        }
    }
}