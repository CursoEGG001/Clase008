/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mextras04;
import Servicio.FechaServicio;
import Tiempo.Fecha;
        import java.util.Scanner;
/**
 *
 * @author pc
 */
public class MExtras04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        // Pedir al usuario que ingrese una fecha
        System.out.print("Ingrese el día: ");
        int d = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();
        
        // Crear un objeto Fecha con los valores ingresados por el usuario
        Fecha f = new Fecha(d, mes, anio);
        FechaServicio laFecha = new FechaServicio();
        
        // Verificar si el año ingresado es bisiesto
        if (laFecha.esBisiesto(f.getAnio())) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
        

        
        // Obtener la cantidad de días totales del mes ingresado por el usuario
        int dias = laFecha.cantidadDiasMes(f.getMes(),f.getAnio());
        System.out.println("El mes " + mes + " tiene " + dias + " días");
        
        // Mostrar el día anterior a la fecha ingresada
        Fecha diaAnterior = laFecha.diaAnterior(f);
        System.out.println("El día anterior a la fecha ingresada es: ");
                diaAnterior.imprimirFecha();
        
        // Mostrar el día posterior a la fecha ingresada
        Fecha diaPosterior = laFecha.diaSiguiente(f);
        System.out.println("El día posterior a la fecha ingresada es: ");
                diaPosterior.imprimirFecha();
        
        sc.close();
    }
}
