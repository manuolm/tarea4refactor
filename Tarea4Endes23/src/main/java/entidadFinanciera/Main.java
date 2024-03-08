
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal
 * 
 * @author Manuel Olmos Ciari
 * @version 2
 * @since 1
 */
public class Main {

    /**
     * Método main
     * 
     * @param args
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        try {
            probarIngresar(objetoCuenta, 2000, 0);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            probarRetirar(objetoCuenta, 50, 0);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    /**
     * Intenta ingresar al objeto cuenta especificado la cantidad especificada
     * 
     * @param c
     * @param cantidad
     * @param cantidadEsperada
     * @throws Exception
     */
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        
    }
    
    /**
     * Intenta retirar del objeto cuenta especificado la cantidad especificada
     * 
     * @param c
     * @param cantidad
     * @param cantidadEsperada
     * @throws Exception
     */
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.retirar(cantidad);
    }
}