package modelo;


import java.io.File;
import java.util.Date;

public class Vendedor extends Persona {
    
    private String turno;
    private String horaEntrada;
    private String horaSalida;

    public Vendedor(String nombre, String apellidoPaterno, String apeliidoMaterno) {
        super(nombre, apellidoPaterno, apeliidoMaterno);
    }
    
    
    
    public File generaTicketVenta(){
        return null;
    }
    
    public Date registrarHoraEntrada(){
        
        return null;
    }
    
    
    public boolean revisaBonoPuntualidad(){
        return false;
        
    }
    
}
