package Modelo;
 
import java.util.ArrayList;
import java.util.List; 
public class Model {
    private List<Observer> observers;
    private CircleDoubleLinkedList<Persona> personas;
    private boolean pause;
 
    public Model() {
        this.personas = new CircleDoubleLinkedList<>();
        this.observers = new ArrayList<>();
        inicializarPersonas(12, 0);
    }
 
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
 
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
 
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
 
    private void inicializarPersonas(int cantidad, int indexPrimero) {
        for (int i = 0; i < cantidad; i++) {
            personas.addLast(new Persona(i));
        }
        personas.setLast(cantidad - indexPrimero);
        notifyObservers();  // Notificar a los observadores después de inicializar
    }
 
    public void modificarEstado() {
        // Método que cambia el estado del modelo
        // ...
        notifyObservers();  // Notificar a los observadores después de cambiar el estado
    }
 
    public CircleDoubleLinkedList<Persona> getPersonas() {
        return personas;
    }
 
    public boolean isPause() {
        return pause;
    }
 
    public void setPause(boolean pause) {
        this.pause = pause;
        notifyObservers();  // Notificar a los observadores del cambio
    }
}
