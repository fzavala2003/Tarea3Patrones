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
public class ComodinConsultaClase implements ComodinStrategy {
    @Override
    public void aplicarComodin(Pregunta pregunta, Entrada entrada) {
    int A = 0, B = 0, C = 0, D = 0;
    char alt = 'A';

    // Simulación de la recolección de respuestas de varios estudiantes.
    // Se asume que tienes alguna manera de definir cuántos estudiantes responden.
    int numEstudiantes = 10; // Definir el número de estudiantes que simulan responder

    for (int i = 0; i < numEstudiantes; i++) {
        char respuesta;
        do {
            respuesta = entrada.Cadena("Ingrese opción (A-D): ").toUpperCase().charAt(0);
        } while (respuesta != 'A' && respuesta != 'B' && respuesta != 'C' && respuesta != 'D');
        switch (respuesta) {
            case 'A':
                A++;
                break;
            case 'B':
                B++;
                break;
            case 'C':
                C++;
                break;
            case 'D':
                D++;
                break;
        }
    }

    int mayor = A;
    if (B > mayor) {
        mayor = B;
        alt = 'B';
    }
    if (C > mayor) {
        mayor = C;
        alt = 'C';
    }
    if (D > mayor) {
        mayor = D;
        alt = 'D';
    }

    System.out.println("El más votado es: " + alt);
    char s;
    do {
        s = entrada.Cadena("¿Acepta la respuesta del curso (S/N)? ").toUpperCase().charAt(0);
    } while (s != 'S' && s != 'N');
    if (s == 'S') {
        System.out.println("Respuesta aceptada: " + alt);
    } else {
        char nuevaRespuesta;
        do {
            nuevaRespuesta = entrada.Cadena("Ingrese respuesta (A-D): ").toUpperCase().charAt(0);
        } while (nuevaRespuesta != 'A' && nuevaRespuesta != 'B' && nuevaRespuesta != 'C' && nuevaRespuesta != 'D');
        System.out.println("Nueva respuesta ingresada: " + nuevaRespuesta);
    }
    }
}
