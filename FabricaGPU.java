public class FabricaGPU extends AbstractFactory{
    @Override
    public Object getComponente(String tipoComponente){
        return getGPU(tipoComponente);
    }


    public GPU getGPU(String tipoGPU){
        if(tipoGPU == null){
            return null;
        }

        switch (tipoGPU.toLowerCase()) {
            case "r306":
                return new RTX3060();
            case "r407":
                return new RTX4070();
            case "r408":
                return new RTX4080();
            case "r409":
                return new RTX4090();
            case "g166":
                return new GTX1660();
            default:
                return null;
        }
    }
}
