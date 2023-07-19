/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_poo;

import Servicio.CuentaService;
import Entidad.Cuenta;

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
public class ejercicio_5 {
    
    public static void main(String[] args) {
        
        CuentaService cta = new CuentaService();
        
        Cuenta cta1 = cta.crearCuenta();
        
        System.out.println("");

        // cta.depositar(cta1);        
        // cta.retirar(cta1);
        //cta.extraccionRapida(cta1);
        //cta.consultarSaldo(cta1);
        // cta.consultarDatos(cta1);
        
        cta.menuCuenta(cta1);
        
    }
    
}
