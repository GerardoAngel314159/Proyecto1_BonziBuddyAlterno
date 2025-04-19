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
            case "ssd500gb" -> {
                return new SSD500GB();
            }
            case "ssd1tb" -> {
                return new SSD1TB();
            }
            case "ssd2tb" -> {
                return new SSD2TB();
            }
            case "ssd4tb" -> {
                return new SSD4TB();
            }
            default -> throw new AssertionError("SSD no encontrado");
        }
    }
} 