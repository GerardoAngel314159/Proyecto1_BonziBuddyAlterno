/**
 * Clase que representa un tecnologo encargado de obtener la fabrica
 * correspondiente segun el tipo de componente.
 */
public class Tecnologo {
    
    /**
     * Obtiene la fabrica correspondiente al tipo de componente especificado.
     *
     * @param tipo Tipo de componente para el cual se require la fabrica.
     * @return Instancia de AbstractFactory correspondiente al tipo, o null si no existe.
     */
    public AbstractFactory getFactory(Tipo tipo) {
        return switch (tipo) {
            case MEMORIA_RAM -> new FabricaRAM();
            case MOTHERBOARD -> new FabricaMotherboard();
            case PROCESADOR -> new FabricaProcesador();
            case SSD -> new FabricaSSD();
            case HDD -> new FabricaHDD();
            case GPU -> new FabricaGPU();
            case FUENTE_ALIMENTACION -> new FabricaFuenteAlimentacion();
            case GABINETE -> new FabricaGabinetes();
            default -> null;
        };           
    }
}