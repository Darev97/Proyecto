package modelo;

public class ClientePreferente extends Cliente {

    private double montoCredito;
    private double adeudo;
        
    public ClientePreferente(int id, String nombre, String apellidoPaterno, String apellodpMaterno,double montoCredito){
        super(id, nombre, apellidoPaterno, apellodpMaterno);
    }
    
    
    public boolean aumnetarCredito(double porc) {
        return false;
    }

}
