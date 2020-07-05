
package controlador;

import java.util.ArrayList;
import modelo.*;



public final class Factory {
    private static Factory fabrica;
    
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<Vendedor> vendedores;
    private Proveedor proveedores[] = new Proveedor[5];
    
    
    private Factory (){
    
 }
    
    public void inicializarDatos()
    {
     crearInstanciasDeClientes();
     crearInstanciasDeProductos();
     crearInstanciasDeProveedores();
    }
    
     public static Factory getFabrica(){
        fabrica = new Factory();
        return fabrica;
    }
     
     public ArrayList<Producto> getProductos(){
         return productos;
         
     }
    
    public void crearInstanciasDeClientes()
    {
    /*-----------Instancias de Cliente--------*/
    
    clientes.add(new ClienteEstrella(0000, "Juan", "Perez", "Perez"));
    clientes.add(new ClientePreferente(0001, "Maria", "Gonzales", "Lopez", 50000.0));
    
    
    }
    
    public void crearInstanciasDeProductos()
    {
    /*---------Instancias de Productos---------*/
        
     productos.add(new Producto(0216, "Takis", "Takis Fuego", 7.50, 8.90, 11.0, proveedores[1]));
     productos.add(new Producto(0314, "Alpura", "Crema 500 gr", 25.80, 28.50, 31.62, proveedores[0]));
     productos.add(new Producto(0315, "Alpura", "Leche Deslactosada 1Lt", 18.60, 19.20, 21.70, proveedores[0]));
     productos.add(new Producto(0422, "Emperador", "Galletas Emperador sabor Chocolate", 9.45, 10.50, 12.90, proveedores[3]));
     productos.add(new Producto(0537, "Bimbo", "Pan Chico", 12.66, 14.33, 18.46, proveedores[2]));
     productos.add(new Producto(0534, "Bimbo", "Nito", 7.50, 8.45, 10.50, proveedores[2]));
     productos.add(new Producto(0211, "Chips", "Chips Jalapeño", 10.89, 12.40, 13.0, proveedores[1]));
     productos.add(new Producto(0603, "CocaCola", "Coca con Cafe", 7.50, 8.90, 10.50, proveedores[4]));
     productos.add(new Producto(0216, "Sprite", "Refresco Sabor Limon", 12.83, 13.10, 16.0, proveedores[4]));
     productos.add(new Producto(0216, "Chokis", "Galletas Chokis", 8.56, 9.40, 10.50, proveedores[3]));
     
     
    }
    
    
    public void crearInstanciasDeProveedores()
    {
    /*--------Instanias de Proveedores--------*/
        
        proveedores[0] = new Proveedor ("Alpura", "Calz Legaria SN, Deportivo Pensil, Miguel Hidalgo, 11470 Ciudad de México, CDMX", 554068540);
        proveedores[1] = new Proveedor ("Barcel", "Calle 16 230, Tolteca, Álvaro Obregón, 01180 Ciudad de México, CDMX",  555271704);
        proveedores[2] = new Proveedor ("Bimbo", "Industria Automotriz 2, Delegación Santa María Totoltepec, 50200 Toluca de Lerdo, Méx.",  722279040);
        proveedores[3] = new Proveedor ("Gamesa", "Industria Textil 18, Industrial Tlatilco 1, 53470 Naucalpan de Juárez, Méx.",  556328262);
        proveedores[4] = new Proveedor ("CocaCola", "Mario Pani 100, Santa Fe, Contadero, Cuajimalpa de Morelos, 05348 Ciudad de México, CDMX",  800223367);
    }
    
}


