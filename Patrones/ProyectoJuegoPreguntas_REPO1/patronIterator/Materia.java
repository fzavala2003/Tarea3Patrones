/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronIterator;
import Entidades.*;
/**
 *
 * @author zaval
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Materia {
    private String codigo;
    private String nombre;
    private int niveles;
    private ArrayList<Paralelo> paralelos = new ArrayList<>();
    private ArrayList<Pregunta> preguntas = new ArrayList<>();

    public Materia(String codigo, String nombre, int niveles) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.niveles = niveles;
    }

    public Iterator<Paralelo> getParaleloIterator() {
        return new ParaleloIterator(paralelos);
    }

    public Iterator<Pregunta> getPreguntaIterator() {
        return new PreguntaIterator(preguntas);
    }

    public void ingresarParalelo(Paralelo paralelo) {
        this.paralelos.add(paralelo);
    }

    public void agregarPregunta(Pregunta pregunta) {
        this.preguntas.add(pregunta);
    }
}