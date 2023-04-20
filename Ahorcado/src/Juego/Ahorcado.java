/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Juego;

/**
 *
 * @author pc
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    private char[] palabra;
    private int encontradas;
    private int jugadasMaximas;
    private int intentosRestantes;
    private char [] VacioEncontradas ;

    // Constructor vacío
    public Ahorcado() {}

    // Constructor parametrizado
    public Ahorcado(String palabra, int jugadasMaximas) {
        this.palabra = palabra.toCharArray();
        this.encontradas = 0;
        this.jugadasMaximas = jugadasMaximas;
        this.intentosRestantes = jugadasMaximas;
    }

    // Método para crear el juego
    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine().toUpperCase();
        this.palabra = palabra.toCharArray();
        this.encontradas = 0;
        
        VacioEncontradas = new char[palabra.length()];
        Arrays.fill(VacioEncontradas, '_');
        System.out.print("Ingrese la cantidad máxima de jugadas: ");
        this.jugadasMaximas = scanner.nextInt();
        this.intentosRestantes = this.jugadasMaximas;
    }

    // Método para mostrar la longitud de la palabra a buscar
    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    // Método para buscar una letra dada por el usuario
    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontrada = true;
                encontradas++;
                VacioEncontradas[i]= letra ;
            }
        }
        if (!encontrada) {
            intentosRestantes--;
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra pertenece a la palabra");
            for (int i = 0; i < VacioEncontradas.length ; i++) {
                System.out.print(VacioEncontradas[i]+" ");
            }
            System.out.println("");
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + "," + (palabra.length - encontradas) + ")");
        System.out.println("Número de oportunidades restantes: " + intentosRestantes);
        return encontrada;
    }

    // Método para mostrar cuántas letras han sido encontradas y cuántas faltan
    public void encontradas(char letra) {
        buscar(letra);
    }

    // Método para mostrar cuántas oportunidades le quedan al jugador
    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + intentosRestantes);
    }

    // Método que llama a todos los métodos previamente mencionados y verifica si el usuario ganó o perdió
    public void juego() {
        Scanner scanner = new Scanner(System.in);
        while (intentosRestantes > 0 && encontradas < palabra.length) {
            System.out.print("Ingrese una letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);
            encontradas(letra);
        }
        if (encontradas == palabra.length) {
            System.out.println("Felicitaciones, ganaste el juego!");
        } else {
            System.out.println("Lo sentimos, no hay más oportunidades. La palabra era: " + new String(palabra));
        }
    }
}

