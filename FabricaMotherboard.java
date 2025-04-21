public class FabricaMotherboard extends AbstractFactory{
    @Override
    public Object getComponente(String tipoComponente){
        return getMotherboard(tipoComponente);
    }


    public Motherboard getMotherboard(String tipoMotherboard){
        if(tipoMotherboard == null){
            return null;
        }

        switch (tipoMotherboard.toLowerCase()){
            case "rog" -> {
                return new ROGMaximusZ790Hero();
            }
            case "tuf" -> {
                return new TUFGamingB760PlusWIFID4();
            }
            case "meg" -> {
                return new MEGGodlike();
            }
            case "mag" -> {
                return new MAGB760TomahawkWIFIDDR4();
            }
            default -> throw new AssertionError("Motherboard no encontrada");
        }
    }
}