public class FabricaFuenteAlimentacion extends AbstractFactory{
    @Override
    public Object getComponente(String tipoComponente){
        return getFuenteAlimentacion(tipoComponente);
    }


    public RAM getFuenteAlimentacion(String tipoRam){
        if(tipoRam == null){
            return null;
        }

        switch (tipoRam.toLowerCase()){
            case "evga800w" -> {
                return new Adata8GB();
            }
            case "evga1000w" -> {
                return new Adata16GB();
            }
            case "evga1500w" -> {
                return new Adata32GB();
            }
            case "corsair1500w" -> {
                return new Kingston8GB();
            }
            case "corsair800w" -> {
                return new Kingston16GB();
            }
            case "corsair1200w" -> {
                return new Kingston32GB();
            }
            case "xpg500w" -> {
                return new Kingston8GB();
            }
            case "xpg700w" -> {
                return new Kingston16GB();
            }
            case "xpg1000w" -> {
                return new Kingston32GB();
            }
            default -> throw new AssertionError("RAM no encontrada");
        }
    }
}