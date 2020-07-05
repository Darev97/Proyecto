package modelo;

import java.util.ArrayList;

public class Proveedor {
    
    private String compania;
    private String direccion;
    private long telefono;
    
    public Proveedor(String Compañia, String direccion, long telefono)
    {
        this.compania = Compañia;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void surtir(ArrayList<Producto> productos){
        
    }
    
    public String getCompania() {
        return compania;
    }
    
    
}
