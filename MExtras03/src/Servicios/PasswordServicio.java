/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Pass;
import java.util.Scanner;

/**
 ***
 * Ejercicio 3 Crear una clase Pass, donde declaremos los siguientes atributos: ● pass : Del tipo String ● nombre: Del tipo
 * String ● dni: Del tipo int.
 *
 * Métodos para desarrollar: ● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
 * teclado) ● Crear un método para ingresar una contraseña (crearPass). En este método, debemos validar que la longitud sea
 * correcta. (10). En caso de ser correcto, almaceno la contraseña. Si ingreso a esta opción del menú, indefectiblemente
 * deberá dejar su contraseña asignada. ● Crear un método para analizar la contraseña(analizarPass). Donde: o SI Existe al
 * menos una letra z : Es nivel MEDIO o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO o Si ninguna
 * condición se cumple es nivel BAJO ● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
 * debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el acceso a modificar los datos. ● A
 * través de un menú de opciones: o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
 * contraseña valida). o B) Mensaje al usuario que tipo de NIVEL es su contraseña o C) Modificar contraseña, donde primero
 * debe poner su contraseña anterior para dar permiso o C) Modificar nombre, donde primero debe poner su contraseña para dar
 * permiso, SINO impedir cambios o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso, SINO impedir
 * cambios
 *
 * @author pc
 */
public class PasswordServicio {
    Scanner leer = new Scanner(System.in);
    
    public boolean crearPass(Pass usuario) {
        
        System.out.println("Ingrese una clave de 10 caracteres:");
        String datoClave = "";
        do {

            datoClave = leer.next();
            if (datoClave.length() != 10) {
                System.out.println("Esto no cumple con los requisitos");
            } else {
                System.out.println("Verificando...");
            }
        } while (datoClave.length() != 10);

        if (usuario.getPass().equals(datoClave)) {
            System.out.println("Es Correcta");
            return true;
        } else {
            System.out.println("Clave invalida");
            return false;
        }

    }

    public void analizarPass(Pass usuario) {
        String aComparar = "";
        int i = 0;
        boolean esALTO = false, esBAJO = true, esMEDIO = false;

        aComparar = usuario.getPass();
        if (aComparar.contains("z")) {
            if (aComparar.contains("a")) {

                for (int j = 0; j < aComparar.length(); j++) {
                    char letra = aComparar.charAt(j);
                    if (letra == 'a') {
                        i++;
                    }
                }
                if ( i > 2 ) esALTO = true;
                
            } else {

                esMEDIO = true;
            }
        } else {
            esBAJO = true;

        }
        
        if (esALTO) {
            if (esMEDIO) {
                System.out.println("Su Contraseña es nivel MEDIO");
            } else {
                System.out.println("Su contraseña es nivel ALTO");
            }
        } else {
            System.out.println("Su Contraseña es nivel BAJO");
        }

    }
    
    public void modificaDNI (Pass usuario) {
        
        System.out.println("Ingrese la contraseña (Operación restringida): ");
        String ingresaContra=leer.next();
        int nuevoDNI;
        
        if (usuario.getPass().equals(ingresaContra)) {
            System.out.println("Se va a cambiar el número de DNI...");
            nuevoDNI = leer.nextInt();
            usuario.setDni(nuevoDNI);
            System.out.println("Cambiado.");
        } else {
            System.out.println("No tiene permisos");
        }
        
    }

    public void modificaNombre (Pass usuario) {
        
        System.out.println("Ingrese la contraseña (operación restringida): ");
        String ingresaContra=leer.next();
        String nuevoNombre;
        
        if (usuario.getPass().equals(ingresaContra)) {
            System.out.println("Se va a cambiar el nombre de Cuenta...");
            nuevoNombre=leer.next();
            usuario.setNombre(nuevoNombre);
            System.out.println("Se cambió el nombre.");
        } else {
            System.out.println("No posee permiso.");
        }
    }
    
    
}
