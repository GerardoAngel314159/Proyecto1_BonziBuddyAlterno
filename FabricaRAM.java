public class FabricaRAM extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){
        return getHDD(tipoComponente);
    }


}