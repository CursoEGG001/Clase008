/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * @author pc
 */
import Entidad.Auto;
import java.time.LocalDate;

public class ServicioAuto {

    private Auto auto;

    public ServicioAuto() {
        this.auto = null;
    }

    public void cargarFichaAuto(Auto auto) {
        this.auto = auto;
    }

    public void modificarTitularidadAuto(String nuevoDuenio) {
        this.auto.setNombreDuenio(nuevoDuenio);
    }

    public void indicarTrayectoRecorrido(int kmRecorridos) {
        int kmMotor = this.auto.getKmMotor();
        kmMotor += kmRecorridos;
        this.auto.setKmMotor(kmMotor);
    }

    public boolean esNecesarioService() {
        int kmMotor = this.auto.getKmMotor();
        if (kmMotor >= 10000) {
            return true;
        } else {
            return false;
        }
    }
}
