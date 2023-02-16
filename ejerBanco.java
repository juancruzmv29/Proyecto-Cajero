package ProyectosPropios.Cajero;

import java.util.Scanner;

// Ejercicio banco para sacar y retirar plata hasta 50.000 permite sacar
public class ejerBanco {

    public static void main(String[] args) {

        // Limite que dara el banco a retirar
        int limit = 50000;
        // Dinero de la cuenta del user
        int dinero_cuenta;
        // Clave que tendria que ser privada
        int clave;
        // Bandera va a iniciar con el string vacio
        String bandera = "";
        // Dos escaneres para ingresar datos con el que vamos a construir el programa
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);



        // Ciclo que mientras la bandera no sea igual a finish, se va a estar ejecutando
        while(!bandera.equalsIgnoreCase("finish")) {

            System.out.println("Ingrese a su cuenta bancaria, con su dinero disponible y clave de 4 digitos");
            // Ingresamos el dinero que tenemos y la clave
            dinero_cuenta = teclado.nextInt();
            clave = teclado.nextInt();
            // Transformamos la clave en string
            String string_clave = String.valueOf(clave);
            // Y a partir de los datos ingresados arriba completamos la cuenta del usuario, si la clave es mayor a 4 digitos retornamos el programa.
            if(string_clave.length() < 4) {
                return;
            }
            CuentaUser cuenta = new CuentaUser(dinero_cuenta, clave);


            // Ingresamos cuanto dinero queremos retirar
            System.out.println("Ingrese cuanto dinero quiere retirar");
            System.out.println("El limite es: $" + limit);
            int dinero_a_retirar = teclado.nextInt();

            // Condicional para verificar si podemos retirar dinero o no
            if(dinero_a_retirar > limit) {
                System.out.println("No puede retirar mas del limite");
            } else if (dinero_a_retirar > cuenta.getDinero()) {
                System.out.println("Dinero insuficiente");
            } else {
                double dinero_banco = cuenta.getDinero();
                double dinero_restante = dinero_banco - dinero_a_retirar;
                System.out.println("Su saldo disponible es de: " + dinero_restante);
            }

            // Finalmente preguntamos si queremos salir de la cuenta o no.
            System.out.println("Desea terminar la operacion? Escriba finish para finalizar u otra letra para continuar");
            bandera = teclado2.next();

        }

    }


}
