package modelo;

import java.io.File;

public abstract class Cliente extends Persona {
    
    protected int id;
    protected boolean promociones;
    
    
    public Cliente(int id, String nom, String paterno, String materno ){
        super(nom, paterno, materno);
        
    }
    
    
  
    public void realizarCompra(){
        
    }
    public boolean agregaProducto(){
        return false;
        
    }
    public File verPromociones(){
        return null;
        
    }     
}
