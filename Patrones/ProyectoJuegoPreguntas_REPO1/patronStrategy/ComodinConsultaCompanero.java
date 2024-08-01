/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronStrategy;
import Entidades.*;
import Procesos.*;
/**
 *
 * @author zaval
 */

public class ComodinConsultaCompanero implements ComodinStrategy {
    @Override
    public void aplicarComodin(Pregunta pregunta, Entrada entrada) {
      
        char respComp;
        do {
            respComp = entrada.Cadena("Elija respuesta (A-D): ").toUpperCase().charAt(0);
        } while (respComp != 'A' && respComp != 'B' && respComp != 'C' && respComp != 'D');
        // Permitir al usuario decidir si acepta la respuesta
        char s;
        do {
            s = entrada.Cadena("¿Acepta la respuesta de su compañero (S/N)? ").toUpperCase().charAt(0);
        } while (s != 'S' && s != 'N');
        if (s == 'S') {
            // Acepta la respuesta del compañero
            entrada.Cadena("Respuesta aceptada: " + respComp);
        } else {
            // Ingrese su propia respuesta
            entrada.Cadena("Ingrese respuesta (A-D): ");
        }
    }
}
