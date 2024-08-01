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

public class PreguntaIterator implements Iterator<Pregunta> {
    private ArrayList<Pregunta> preguntas;
    private int position = 0;

    public PreguntaIterator(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public boolean hasNext() {
        return position < preguntas.size();
    }

    @Override
    public Pregunta next() {
        return preguntas.get(position++);
    }
}
