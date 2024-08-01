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

public class ParaleloIterator implements Iterator<Paralelo> {
    private ArrayList<Paralelo> paralelos;
    private int position = 0;

    public ParaleloIterator(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }

    @Override
    public boolean hasNext() {
        return position < paralelos.size();
    }

    @Override
    public Paralelo next() {
        return paralelos.get(position++);
    }
}