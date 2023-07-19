/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes.
c) Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumará al saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
le restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar sólo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.

 * @author Ani
 */
public class CuentaService {

    private Scanner read = new Scanner(System.in);

    // c)
    public Cuenta crearCuenta() {

        System.out.println("Ingresar número de cuenta:");
        int numeroCuenta = read.nextInt();
        System.out.println("Ingresar DNI del usuario:");
        int DNI = read.nextInt();
        System.out.println("Ingresar saldo actual:");
        double saldoActual = read.nextDouble();

        return new Cuenta(numeroCuenta, DNI, saldoActual);
    }

    // d)
    public Cuenta depositar(Cuenta cuentaN) {
        System.out.println("Ingrese la cantidad de dinero a depositar:");
        double ingreso = read.nextInt();
        cuentaN.setSaldoActual(cuentaN.getSaldoActual() + ingreso);

        System.out.println("Su saldo actual es: $" + cuentaN.getSaldoActual());

        return null;
    }

    // e)
    public Cuenta retirar(Cuenta cuentaN) {
        System.out.println("Ingrese la cantidad de dinero a retirar:");
        double retiro = read.nextInt();

        if (retiro < cuentaN.getSaldoActual()) {
            cuentaN.setSaldoActual(cuentaN.getSaldoActual() - retiro);
        } else {
            System.out.println("Saldo insuficiente para el retiro.");
        }
        
        System.out.println("Su saldo actual es: $" + cuentaN.getSaldoActual());
        
        return null;
    }
    
    // f)
    public Cuenta extraccionRapida(Cuenta cuentaN){
        double retiroExpress = cuentaN.getSaldoActual()*0.2;
        cuentaN.setSaldoActual(cuentaN.getSaldoActual() - retiroExpress);
        
        System.out.println("El monto del retiro express es: $"+retiroExpress);
        System.out.println("Su saldo actual es: $" + cuentaN.getSaldoActual());
        
        return null;
    }
    
    // g)
    public Cuenta consultarSaldo(Cuenta cuentaN){
        System.out.println("Su saldo actual es: $"+cuentaN.getSaldoActual());
        
        return null;
    }
    
    // h)
    public Cuenta consultarDatos(Cuenta cuentaN){
        System.out.println("Nº de cuenta: " + cuentaN.getNumeroCuenta()
                + "\nDNI: " + cuentaN.getDNI()
                + "\nSaldo actual: $" + cuentaN.getSaldoActual());

        return null;
    } 
    
    
    public Cuenta menuCuenta(Cuenta cuentaN) {
        System.out.println("Ha ingresado a la cuenta N°" + cuentaN.getNumeroCuenta());
        int opcion;

        do {
            System.out.println("¿Qué operación desea realizar?"
                    + "\n1. Depósitar dinero."
                    + "\n2. Retirar dinero."
                    + "\n3. Extracción rápida."
                    + "\n4. Consultar saldo."
                    + "\n5. Consultar datos de la cuenta."
                    + "\n6. Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    depositar(cuentaN);
                    continue;

                case 2:
                    retirar(cuentaN);
                    continue;

                case 3:
                    extraccionRapida(cuentaN);
                    continue;

                case 4:
                    consultarSaldo(cuentaN);
                    continue;

                case 5:
                    consultarDatos(cuentaN);
                    continue;

                case 6:
                    break;
            }

        } while (opcion != 6);

        return null;

    }

}
