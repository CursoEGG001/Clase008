/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MExtras03;

import Entidades.Pass;
import Servicios.PasswordServicio;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MExtras03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pass elUsuario01 = new Pass();
        PasswordServicio u1 = new PasswordServicio();
        String menu;

        Scanner opcion = new Scanner(System.in);

        boolean ClaveValida = u1.crearPass(elUsuario01);

        if (ClaveValida) {
            
              do {          
            System.out.println("(A) Ingresa la contraseña"
                    + "\n(B) Verificar nivel de contraseña "
                    + "\n(C) Modificar Nombre"
                    + "\n(D) Modificar DNI"
                    + "\n(E) Salir..."
                    + "\n\n Estado Clave :" + ClaveValida);

                menu = opcion.next();
                switch (menu) {
                    case "A":
                    case "a":
                        System.out.println("La clave ingresada es correcta");
                        break;
                    case "B":
                    case "b":
                        u1.analizarPass(elUsuario01);
                        break;
                    case "C":
                        case "c":
                        u1.modificaNombre(elUsuario01);
                        break;
                    case "D":
                    case "d":
                        u1.modificaDNI(elUsuario01);
                        break;
                    default:
                        System.out.println("Adiós..." +
                                "\n Estado actual: " + u1.toString() +
                                "\n Nombre Usuario: " + elUsuario01.getNombre() + 
                                "\n Numero DNI: " + elUsuario01.getDni());

                }
            } while (!(menu.equals("e") || menu.equals("E")));

        }
        
    }
  
}
