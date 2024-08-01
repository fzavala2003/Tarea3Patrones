/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patronIterator;

/**
 *
 * @author zaval
 */
import java.util.Iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
