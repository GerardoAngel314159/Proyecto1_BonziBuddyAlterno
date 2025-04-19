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
            case "rogmaximusz790hero" -> {
                return new ROGMaximusZ790Hero();
            }
            case "tufgamingb760oluswifid4" -> {
                return new TUFGamingB760PlusWIFID4();
            }
            case "meggodlike" -> {
                return new MEGGodlike();
            }
            case "magb760tomahowkwifiddr4" -> {
                return new MAGB760TomahawkWIFIDDR4();
            }
            default -> throw new AssertionError("Motherboard no encontrada");
        }
    }
}