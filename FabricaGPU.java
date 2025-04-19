public class FabricaGPU {
    @Override
    public Object getComponente(String tipoComponente){
        return getGPU(tipoComponente);
    }


    public GPU getGPU(String tipoGPU){
        if(tipoGPU == null){
            return null;
        }

        switch (tipoGPU.toLowerCase()){
            case "rtx3060" -> {
                return new RTX3060();
            }
            case "rtx4070" -> {
                return new RTX4070();
            }
            case "rtx4080" -> {
                return new RTX4080();
            }
            case "rtx4090" -> {
                return new RTX4090();
            }
            case "gtx1660" -> {
                return new GTX1660();
            }
            default -> throw new AssertionError("HDD no encontrada");
        }
    }
}
