import java.util.Scanner;

/**
 * Clase Catalogo que muestra los catalogos de componentes disponibles para armar computadoras.
 * Ademas, permite seleccionar computadoras prehechas mediante una interfaz interactiva.
 */
public class Catalogo {
    
    /**
     * Muestra en consola el catalogo de fuentes de alimentacion disponibles.
     */
    public void mostrarFuentesAlimentacion(){
        System.out.println("Fuentes de Alimentacion:");
        System.out.println("1. Corsair 800W (c8)");
        System.out.println("2. Corsair 1200W (c12)");
        System.out.println("3. Corsair 1500W (c15)");
        System.out.println("4. EVGA 800W (ev8)");
        System.out.println("5. EVGA 1000W (ev10)");
        System.out.println("6. EVGA 1500W (ev15)");
        System.out.println("7. XPG 500W (x5)");
        System.out.println("8. XPG 600W (x6)");
        System.out.println("9. XPG 1000W (x10)");
    }

    /**
     * Muestra en consola el catalogo de gabinetes disponibles.
     */
    public void mostrarGabinetes(){
        System.out.println("Gabinetes:");
        System.out.println("1. Gabinete H6FlowATX (h6f)");
        System.out.println("2. Gabinete LancerATX (latx)");
    }

    /**
     * Muestra en consola el catalogo de motherboards disponibles.
     */
    public void mostrarMotherboards(){
        System.out.println("Motherboards:");
        System.out.println("1. ROG Maximus Z790 Hero (rog)");
        System.out.println("2. TUF Gaming B760-Plus WIFI D4 (tuf)");
        System.out.println("3. MEG Godlike (meg)");
        System.out.println("4. MAG B760 Tomahawk WIFI DDR4 (mag)");
    }

    /**
     * Muestra en consola el catalogo de discos duros (HDD) disponibles.
     */
    public void mostrarHDD(){
        System.out.println("Discos Duros:");
        System.out.println("1. Seagate Barracuda 1TB (sb1)");
        System.out.println("2. Seagate Barracuda 2TB (sb2)");
        System.out.println("3. Western Digital Blue 500GB (wdb5)");
        System.out.println("4. Western Digital Blue 1TB (wdb1)");
    }

    /**
     * Muestra en consola el catalogo de discos SSD disponibles.
     */
    public void mostrarSSD(){
        System.out.println("Discos SSD:");
        System.out.println("1. Kingston 500GB (K500)");
        System.out.println("2. Kingston 1TB (k1)");
        System.out.println("3. Kingston 2TB (k2)");
        System.out.println("4. Kingston 4TB (k4)");
    }

    /**
     * Muestra en consola el catalogo de tarjetas de video (GPU) disponibles.
     */
    public void mostrarGPU(){
        System.out.println("Tarjetas de Video:");
        System.out.println("1. Nvidia GTX 1660 (g166)");
        System.out.println("2. Nvidia RTX 3060 (r306)");
        System.out.println("3. Nvidia RTX 4070 (r407)");
        System.out.println("4. Nvidia RTX 4080 (r408)");
        System.out.println("5. Nvidia RTX 4090 (r409)");
    }

    /**
     * Muestra en consola el catalogo de procesadores disponibles.
     */
    public void mostrarProcesadores(){
        System.out.println("Procesadores:");
        System.out.println("1. Intel Core i3-13100 (i3)");
        System.out.println("2. Intel Core i5-13600K (i5)");
        System.out.println("3. Intel Core i7-13700K (i7)");
        System.out.println("4. Intel Core i9-13900K (i9)");
        System.out.println("5. AMD Ryzen 5 5600G (r5g)");
        System.out.println("6. AMD Ryzen 5 7600X (r5x)");
        System.out.println("7. AMD Ryzen 7 7700X (r7x)");
        System.out.println("8. AMD Ryzen 9 7950X3D (r9x)");
    }

    /**
     * Muestra en consola el catalogo de memorias RAM disponibles.
     */
    public void mostrarRAM(){
        System.out.println("Memorias RAM:");
        System.out.println("1. Kingston 8GB (k8)");
        System.out.println("2. Kingston 16GB (k16)");
        System.out.println("3. Kingston 32GB (k32)");
        System.out.println("4. Adata 8GB (a8)");
        System.out.println("5. Adata 16GB (a16)");
        System.out.println("6. Adata 32GB (a32)");
    }

    /**
     * Genera y muestra las computadoras prehechas.
     * Llama a metodos de Director y Builder para armar opciones preconfiguradas,
     * y permite al usuario elegir una de ellas.
     *
     * @return Instancia de ComponenteComputadora de la computadora seleccionada por el usuario, o null si la opcion es invalida.
     */
    public ComponenteComputadora computadorasPrehechas(){
        Builder builder = new Builder();
        Director director = new Director();
        ComponenteComputadora pcOficina = director.compuOficina(builder);
        ComponenteComputadora pcGamer = director.compuGamer(builder);
        System.out.println("\nComputadoras Prehechas:");
        System.out.println("\n1. Computadora de Oficina");
        pcOficina.exhibir();
        System.out.println("\n2. Computadora Gamer");
        pcGamer.exhibir();

        System.out.println("Que opcion prefiere? 1) Computadora de Oficina 2) Computadora Gamer");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1 -> {
                return pcOficina;
            }
            case 2 -> {
                return pcGamer;
            }
            default -> {
                System.out.println("Opcion no valida.");
                return null;  
            }
        }
    }
}