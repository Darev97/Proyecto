package modelo;

public abstract class Persona {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;  
    
    
    public Persona(String nombre, String apellidoPaterno, String apeliidoMaterno){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apeliidoMaterno;
    }
}
