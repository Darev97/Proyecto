package modelo;

import java.io.File;

public class ClienteEstrella extends Cliente {
    
    private double montoHistorico;

    public ClienteEstrella(int id, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(id, nombre, apellidoPaterno, apellidoMaterno);
    }
    
   public File verCompras(){
        return null;
       
   }
    
}
