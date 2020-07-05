package modelo;

public class Producto {

    private int id;
    private String marca;
    private String descripcion;
    private double precioCompra;
    private double precioVentaMenudeo;
    private double precioVentaMayoreo;
    private Proveedor proveedor;

    
    public Producto(int id, String marca, String descripcion, double precioCompra, double precioVentaMayoreo, double precioVentaMenudeo, Proveedor proveedor)
    {
        this.id = id;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVentaMayoreo = precioVentaMayoreo;
        this.precioVentaMenudeo = precioVentaMenudeo;
    }
    
    
    public int verExistencias() {
        return 0;

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the precioCompra
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @return the precioVentaMenudeo
     */
    public double getPrecioVentaMenudeo() {
        return precioVentaMenudeo;
    }

    public double getPrecioVentaMayoreo(){
        return precioVentaMayoreo;
    }
    
    public Proveedor getProveedor(){
        return proveedor;
    }
}
