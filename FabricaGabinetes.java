public class FabricaGabinetes extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){
        return getGabinete(tipoComponente);
    }


    public Gabinetes getGabinete(String tipoGabinete){
        if(tipoGabinete == null){
            return null;
        }

        switch (tipoGabinete.toLowerCase()){
            case "h6flowatx" -> {
                return new H6FlowATX();
            }
            case "lanceratx" -> {
                return new LancerATX();
            }
            default -> throw new AssertionError("Gabinete no encontrado");
        }
    }
}