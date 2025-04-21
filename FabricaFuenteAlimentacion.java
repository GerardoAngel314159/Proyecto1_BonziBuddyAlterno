
import java.nio.file.attribute.AclEntry;

public class FabricaFuenteAlimentacion extends AbstractFactory{
    @Override
    public Object getComponente(String tipoComponente){
        return getFuenteAlimentacion(tipoComponente);
    }


    public FuenteAlimentacion getFuenteAlimentacion(String tipoRam){
        if(tipoRam == null){
            return null;
        }

        switch (tipoRam.toLowerCase()){
            case "ev8" -> {
                return new EVGA800W();
            }
            case "ev10" -> {
                return new EVGA1000W();
            }
            case "ev15" -> {
                return new EVGA1500W();
            }
            case "c8" -> {
                return new Corsair800W();
            }
            case "c12" -> {
                return new Corsair1200W();
            }
            case "c15" -> {
                return new Corsair1500W();
            }
            case "x5" -> {
                return new XPG500W();
            }
            case "x6" -> {
                return new XPG700W();
            }
            case "x10" -> {
                return new XPG1000W();
            }
            default -> throw new AssertionError("RAM no encontrada");
        }
    }
}