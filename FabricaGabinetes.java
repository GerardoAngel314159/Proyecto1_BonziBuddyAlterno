public class FabricaGabinetes extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){
        return getGabinete(tipoComponente);
    }


    public GabinetesNZXT getGabinetesNZXT(String tipoGabinete){
        if(tipoGabinete == null){
            return null
        }else if{
            return H6FlowATX();
        }
    }

    public GabinetesYeyian getGabinetesyYeyian(String tipoGabinete){
        if(tipoGabinete == null){
            return null
        }else if{
            return LancerATX();
        }
    }
}