/**
 * Clase que representa a los gabientes H6 Flow ATX, la cual implementa la interfaz Gabinetes
 */
public class H6FlowATX implements Gabinetes{


    /**
    *Atributos de la clase 
    */

    /**Representa a la marca del gabinete */
    String marca;

    /**Representa al nombre del gabinete */
    String nombre;

    /**Representa al tipo de componente que es */
    Tipo tipo;

    /**Representa a el precio del gabinete */
    double precio;

    /**Representa a la descripcion del componente */
    String descripcion;
    
    /**
    *Metodos de la clase 
    */

    /**
    * Regresa la marca del gabinete
    * @return String con valor de la marca del gabinete
    */
    public String getMarca(){
        return marca;
    }

    /**Regresa el nombre del gabinete
    * @return String con valor a el nombre del gabinete
    */
    public String getNombre(){
        return nombre;
    }

    /**
    * Regresa el tipo de componente que es 
    * @return Tipo con valor del componente que se esta manejando, en este caso Gabinete
    */
    public Tipo getTipo(){
        return tipo;
    }

    /**
    * Regresa el precio del gabinete
    * @return double con valor al precio del componente
    */
    public double getPrecio(){
        return precio;
    }

    /**
    * Regresa la descripcion del producto
    * @return String con valor a la descripcion del componente
    */
    public String getDescripcion(){
        return descripcion;
    }

    /**
    * Imprime en pantalla el nombre de gabinete que se esta manejando
    */
    public void printNombre(){
        System.out.println("El tipo de gabinete es: " + nombre);
    }  

    /**
    * le da valor a los atributos del gabinete al momento de crear el componente
    */
    public void ensamblarGabinete(){
        marca = "NZXT";
        tipo = Tipo.GABINETE;
        nombre = "H6 Flow ATX";
        descripcion = "";
        precio = 145.38;
    }

}