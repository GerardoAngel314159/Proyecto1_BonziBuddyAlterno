public class Tecnologo{
	
	public static AbstractFactory getFactory(Tipo tipo){
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