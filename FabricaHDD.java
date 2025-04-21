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