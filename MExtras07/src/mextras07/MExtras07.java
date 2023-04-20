/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mextras07;

import Entidad.Auto;
import Servicio.ServicioAuto;
import java.time.LocalDate;

/**
 *
 * @author pc
 */
public class MExtras07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creamos un objeto Auto y lo inicializamos con algunos datos
        Auto miAuto = new Auto("Juan Pérez", LocalDate.parse("2024-06-30"),"Rojo" , "Toyota Corolla", 12000);

        // Mostramos los datos del auto
        System.out.println("Datos del auto:");
        System.out.println("Nombre del dueño: " + miAuto.getNombreDuenio());
        System.out.println("Fecha vencimiento carnet: " + miAuto.getFechaVencimientoCarnet());
        System.out.println("Color del vehículo: " + miAuto.getColor());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("KM en motor: " + miAuto.getKmMotor());

        // Creamos un objeto ServicioAuto y le asignamos el auto creado anteriormente
        ServicioAuto miServicio = new ServicioAuto();
        miServicio.cargarFichaAuto(miAuto);

        // Modificamos la titularidad del vehículo
        miServicio.modificarTitularidadAuto("María Rodríguez");

        // Indicamos que se ha recorrido un trayecto de 500 km
        miServicio.indicarTrayectoRecorrido(500);

        // Verificamos si es necesario realizar el servicio
        if (miServicio.esNecesarioService()) {
            System.out.println("Es necesario realizar el service del vehículo.");
        } else {
            System.out.println("No es necesario realizar el service del vehículo.");
        }
    }
}
