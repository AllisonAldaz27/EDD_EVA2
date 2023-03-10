package eva2_7_this;
public class EVA2_7_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // imprimir(); no se puede usar this en un metodo estatico
        
    }
    public void imprimir(){
        //aqui tambien es visible el this
    }
}
class persona{
    private String nombre;

    public persona(String nombre) {
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la variable(permanente)declarado en el metodo
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
       
    }
    public void imprimirdatos(){
        System.out.println("El nombre es :  "+ this.nombre);
    }
    
}