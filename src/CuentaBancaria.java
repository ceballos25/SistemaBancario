public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void setSaldo(double nuevoSaldo) {
        this.saldo = saldo + nuevoSaldo;
    }

    public String describir(){
        return "Cuenta bancaria:\n"+ this.numeroCuenta + " Titular:\n" +  this.titular + "\nSaldo:  "+ this.saldo;
    }

    public double calcularComision(){
        return 0.0;
    }

    public void  realizarRetiro(double monto){
        setSaldo(-monto);
    }
}

