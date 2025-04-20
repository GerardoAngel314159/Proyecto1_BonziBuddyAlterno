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
            case "adata8gb" -> {
                return new Adata8GB();
            }
            case "adata16gb" -> {
                return new Adata16GB();
            }
            case "adata32gb" -> {
                return new Adata32GB();
            }
            case "kingstone8gb" -> {
                return new Kingston8GB();
            }
            case "kingstone16gb" -> {
                return new Kingston16GB();
            }
            case "kingstone32gb" -> {
                return new Kingston32GB();
            }
            default -> throw new AssertionError("RAM no encontrada");
        }
    }
}