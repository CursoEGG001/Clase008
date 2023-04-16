/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NIFService;

import Contenedor.NIF;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class NIFService {

    public NIFService() {
    }

    public void crearNif(NIF documento) {
        Scanner scanner = new Scanner(System.in);
             
        System.out.print("Introduce el número de DNI: ");
        long dni = scanner.nextLong();
        documento.setDni(dni);
        documento.setLetra(calcularLetra(dni));
    }

    private char calcularLetra(long dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int posicion = (int) (dni % 23);
        return letras[posicion];
    }

    public void mostrar(NIF documento) {
        
        long docu = documento.getDni();
        char letra = documento.getLetra();
        String formato = String.format("%%0%dd-%%c", 8);
        System.out.println(String.format(formato,  docu, letra));
    }

}
