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
public class Comodin50_50 implements ComodinStrategy {
    @Override
    public void aplicarComodin(Pregunta pregunta, Entrada entrada) {
        switch (pregunta.getC()) {
            case 'A':
                System.out.println("A. " + pregunta.getResCorrepta() + "  B. " + pregunta.getRespuestas().get(0));
                break;
            case 'B':
                System.out.println("B. " + pregunta.getResCorrepta() + "  C. " + pregunta.getRespuestas().get(0));
                break;
            case 'C':
                System.out.println("C. " + pregunta.getResCorrepta() + "  D. " + pregunta.getRespuestas().get(0));
                break;
            case 'D':
                System.out.println("D. " + pregunta.getResCorrepta() + "  A. " + pregunta.getRespuestas().get(0));
                break;
        }
        // Permitir al usuario ingresar respuesta
        entrada.Cadena("Ingrese respuesta (A-B) después de usar 50/50: ");
    }
}


