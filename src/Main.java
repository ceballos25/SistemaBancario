public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("61127119976","Cristian Ceballos", 1000);


        System.out.println("Cuenta 1:\n" +  cuenta1.describir());

        cuenta1.realizarRetiro(500);
        System.out.println("Cuenta 1:\n" +  cuenta1.describir());


    }
}
