package Procesos;

import Entidades.Juego;
import Entidades.Termino;

public class PrcTermino {
    private Termino t;
    private static PrcTermino instancia;
    private Juego juego;

    // Constructor privado para evitar instanciación directa
    private PrcTermino() {
    }

    // Método estático para obtener la única instancia de la clase
    public static synchronized PrcTermino getInstancia() {
        if (instancia == null) {
            instancia = new PrcTermino();
        }
        return instancia;
    }

    // Métodos de la clase
    public void ingresoTermino() {
        System.out.println("......................");
        System.out.println("Ingreso de Termino Academico");
        Entrada entrada = new Entrada();
        Termino termino;
        do {
            termino = new Termino(entrada.Entera("Ingrese año   : "), entrada.Entera("Ingrese número:"));
            if (Termino.terminos.contains(termino)) {
                System.out.println("Termino ya existe ingrese otro");
            }
        } while (Termino.terminos.contains(termino));
        Termino.terminos.add(termino);
        System.out.println("Termino ingresado");
    }

    public void eliminarTermino() {
        System.out.println("......................");
        System.out.println("Eliminar Termino Academico");
        int i = 1;
        Entrada entrada = new Entrada();
        for (Termino t : Termino.terminos) {
            System.out.println(i + ". " + t);
            i++;
        }
        if (i != 1) {
            int opc;
            do {
                opc = entrada.Entera("Ingrese opcion(1-" + (i - 1) + "): ");
                if (!(opc >= 1 && opc <= (i - 1))) {
                    System.out.println("opcion no valida");
                }
            } while (!(opc >= 1 && opc <= (i - 1)));
            Termino.terminos.remove(opc - 1);
            System.out.println("Termino Eliminado");
        } else {
            System.out.println("No existen terminos");
        }
    }

    public void configurarTermino() {
        System.out.println("......................");
        System.out.println("Seleccionar Termino Academico para el juego");
        int i = 1;
        if (Termino.terminos.size() != 0) {
            for (Termino t : Termino.terminos) {
                System.out.println(i + ". " + t);
                i++;
            }
            Entrada entrada = new Entrada();
            int opc;
            do {
                opc = entrada.Entera("Ingrese opcion(1-" + (i - 1) + "): ");
                if (!(opc >= 1 && opc <= (i - 1))) {
                    System.out.println("opcion no valida");
                }
            } while (!(opc >= 1 && opc <= (i - 1)));
            this.t = Termino.terminos.get(opc - 1);
            Juego juego = new Juego(t);
            this.juego = juego;
        } else {
            System.out.println("No hay terminos academicos registrados");
        }
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    void configurarTemrino() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
