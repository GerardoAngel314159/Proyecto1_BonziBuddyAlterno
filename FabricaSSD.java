public class FabricaSSD extends AbstractFactory{
    @Override
    public Object getComponente(String tipoComponente){
        return getSSD(tipoComponente);
    }


    public SSD getSSD(String tipoSSD){
        if(tipoSSD == null){
            return null;
        }

        switch (tipoSSD.toLowerCase()){
            case "k500" -> {
                return new SSD500GB();
            }
            case "k1" -> {
                return new SSD1TB();
            }
            case "k2" -> {
                return new SSD2TB();
            }
            case "k4" -> {
                return new SSD4TB();
            }
            default -> throw new AssertionError("SSD no encontrado");
        }
    }
} 