public class FabricaRAM extends AbstractFactory{
    @Override
    public Object getComponente(String tipoComponente){
        return getRam(tipoComponente);
    }


    public RAM getRam(String tipoRam){
        if(tipoRam == null){
            return null;
        }

        switch (tipoRam.toLowerCase()){
            case "a8" -> {
                return new Adata8GB();
            }
            case "a16" -> {
                return new Adata16GB();
            }
            case "a32" -> {
                return new Adata32GB();
            }
            case "k8" -> {
                return new Kingston8GB();
            }
            case "k16" -> {
                return new Kingston16GB();
            }
            case "k32" -> {
                return new Kingston32GB();
            }
            default -> {
                return null;
            }
        }
    }
}