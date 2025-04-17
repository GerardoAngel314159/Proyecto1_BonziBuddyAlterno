public class FabricaHDD extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){
        return getHDD(tipoComponente);
    }

    public HSSSeagateBarracuda getSSD(String tipoSSD){
        if(tipoSSD==null){
            return null;
        }else if (tipoSSD.equals("SSD500GB")){
            return new SSD500GB();
        }else if(tipoSSD.equals("SSD1TB")){
            return new SSD1TB();
        }else if(tipoSSD.equals("SSD2TB")){
            return new SSD2TB();
        }else if(tipoSSD.equals("SSD4TB")){
            return new SSD4TB();
        }
    }

}