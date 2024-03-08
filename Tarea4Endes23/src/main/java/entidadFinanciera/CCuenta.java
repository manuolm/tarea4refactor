
package entidadFinanciera;

/**
 * Objeto CCuenta: contiene información sobre una cuenta bancaria.
 * 
 * @author Manuel Olmos Ciari
 * @version 2
 * @since 1
 */
public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    
    /**
     * Código alfanumerico de la cuenta
     */
    private String cuenta;
    
    /**
     * Saldo restante en la cuenta
     */
    private double saldo;
    
    /**
     * Usos de la cuenta especificados por el titular
     */
    private double tipoInterés;
    
    /**
     * Valor constante usado para errores
     */
    private final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con tres parámetros
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Usa el getter getSaldo() para devolver el valor del campo saldo del objeto CCuenta
     * @return
     * @see getSaldo
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * Añade la cantidad especificada como argumento al campo saldo del objeto CCuenta
     * 
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(getERRORCANTIDADNEGATIVA());
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Quita del campo saldo el valor 'cantidad' especificado como argumento
     * 
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return the ERRORCANTIDADNEGATIVA
     */
    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }
}

