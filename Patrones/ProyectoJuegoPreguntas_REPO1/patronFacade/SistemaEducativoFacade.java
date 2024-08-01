/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronFacade;
import Procesos.*;
import Entidades.*;
/**
 *
 * @author zaval
 */
public class SistemaEducativoFacade {
    private PrcJuego prcJuego = new PrcJuego();
    private PrcEstudiantes prcEstudiantes = new PrcEstudiantes();
    private PrcMaterias prcMaterias = new PrcMaterias();
    private PrcParalelos prcParalelos = new PrcParalelos();
    private PrcPreguntas prcPreguntas = new PrcPreguntas();
    private PrcTermino prcTermino = new PrcTermino();

    // Métodos para interactuar con PrcJuego
    public void iniciarJuego() {
        prcJuego.comenzarJuego();
    }
    
    // Métodos para interactuar con PrcEstudiantes
    public void visualizarEstudiantes() {
        prcEstudiantes.visualizarEstudiantes();
    }
    
    // Métodos para interactuar con PrcMaterias
    public void ingresaarMaterias() {
        prcMaterias.ingresaarMaterias();
    }
    
    public void editarMateria() {
        prcMaterias.editarMateria();
    }
    
    public void desactivarMateria() {
        prcMaterias.desactivarMateria();
    }

    // Métodos para interactuar con PrcParalelos
    public void agregarParalelo() {
        prcParalelos.agregarParalelo();
    }
    
    public void eliminarParalelo() {
        prcParalelos.eliminarParaelo();
    }

    // Métodos para interactuar con PrcPreguntas
    public void guardarPreguntas(Materia materia) {
        prcPreguntas.guardarArchivo(materia);
    }
    
    public void inicializarPreguntas() {
        prcPreguntas.inicializarPreguntas();
    }
    
    public void visualizarPreguntas() {
        prcPreguntas.visualizarPreguntas();
    }
    
    public void agregarPreguntas() {
        prcPreguntas.agregarPreguntas();
    }
    
    public void eliminarPreguntas() {
        prcPreguntas.eliminarPreguntas();
    }

    // Métodos para interactuar con PrcTermino
    public void ingresarTermino() {
        prcTermino.ingresoTermino();
    }
    
    public void eliminarTermino() {
        prcTermino.eliminarTermino();
    }
    
    public void configurarTermino() {
        prcTermino.configurarTermino();
    }
}