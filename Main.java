import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tecnologo tecnologo = new Tecnologo();
        Builder builder = new Builder();

        AbstractFactory gabinetes = tecnologo.getFactory(Tipo.GABINETE);
        AbstractFactory procesadores = tecnologo.getFactory(Tipo.PROCESADOR);
        AbstractFactory motherboards = tecnologo.getFactory(Tipo.MOTHERBOARD);
        AbstractFactory ram = tecnologo.getFactory(Tipo.MEMORIA_RAM);
        AbstractFactory ssd = tecnologo.getFactory(Tipo.SSD);
        AbstractFactory hdd = tecnologo.getFactory(Tipo.HDD);
        AbstractFactory gpu = tecnologo.getFactory(Tipo.GPU);
        AbstractFactory fuenteAlimentacion = tecnologo.getFactory(Tipo.FUENTE_ALIMENTACION);

        System.out.println("Bienvenido a la tienda de computadoras MonosChinos MX");

        System.out.println("Desea armar su propia computadora o ver el catalogo?");
        System.out.println("1. Armar computadora");
        System.out.println("2. Ver catalogo");
        System.out.println("3. Salir");

        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = scanner.nextInt();
            while (opcion != 3) {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Armar computadora");
                        break;
                    }
                    case 2 -> {
                        System.out.println("Opcion por implementar");
                        break;
                    }
                    default -> System.out.println("Opcion no valida");
                }
                System.out.println("Desea armar su propia computadora o ver el catalogo?");
                System.out.println("1. Armar computadora");
                System.out.println("2. Ver catalogo");
                System.out.println("3. Salir");
                opcion = scanner.nextInt();
            }
        }
    }
}