
package sstemadeventa;

import controlador.Factory;
import vista.Admin;
import vista.Admon;


public class SstemaDeVenta {

    
    public static void main(String[] args) {
        
        Factory.getFabrica().inicializarDatos();
        
       Admon Ventana = new Admon(Factory.getFabrica().getProductos());
        Ventana.setVisible(true);
        Admin v = new Admin(Factory.getFabrica().getProductos());
        v.setVisible(false);
        
        
    }
    
}
