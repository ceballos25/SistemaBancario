public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteresMensual;
    private double saldoMinimo;

    public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

//    public CuentaAhorros(double tasaInteresMensual, double saldoMinimo) {
//        this.tasaInteresMensual = tasaInteresMensual;
//        this.saldoMinimo = saldoMinimo;
//    }

    @Override
    public String describir() {
        return super.describir() +
                "\nTasa mensual: " + tasaInteresMensual + "%";
    }

    @Override
    public double calcularComision(){
        if (getSaldo() >= saldoMinimo){
            return 0.0;
        }else {
            return 12000.0;
        }
    }

    public boolean realizarRetiro(double monto, boolean esUrgente){
        super.realizarRetiro(monto);
        if(esUrgente && getSaldo() < saldoMinimo){
         setSaldo(-calcularComision());

        }
        return true;
    }


}
