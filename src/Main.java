public class Main {
    public static void main(String[] args) {

//        CuentaBancaria cuenta1 = new CuentaBancaria("61127119976","Cristian Ceballos", 1000);
//
//
//        System.out.println("Cuenta 1:\n" +  cuenta1.describir());
//
//        cuenta1.realizarRetiro(500);
//        System.out.println("Cuenta 1:\n" +  cuenta1.describir());

        CuentaAhorros cuenta2 = new CuentaAhorros("12345","Felipe Ariaz", 100000, 5, 30000);

//        System.out.println("Cuenta 2:\n" +  cuenta2.describir());
//        System.out.println("--------------------------- Calculamos comision");
//        System.out.println("Cuenta 2:\n" +  cuenta2.calcularComision());

        System.out.println(cuenta2.realizarRetiro(80000, true));
        System.out.println(cuenta2.describir());



    }
}
