// Controller.java
package Controlador;
 
import Modelo.Model;
import Observer;
import Vista.View;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
 
public class Controller implements Observer {
    private View vista;
    private Model modelo;
 
    public Controller(View vista, Model modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo.addObserver(this);
    }
 
    @Override
    public void update() {
        // Código para manejar la actualización cuando el modelo cambia
        System.out.println("El controlador ha sido notificado del cambio en el modelo.");
    }
    public EventHandler<ActionEvent> botonStartAction() {
        return (ActionEvent event) -> {
            // Lógica para manejar el evento de inicio
            modelo.modificarEstado();  // Modificar el estado del modelo como ejemplo
        };
    }
    public EventHandler<ActionEvent> botonStopAction() {
        return (ActionEvent event) -> {
            System.exit(3);
        };
    }
    public EventHandler<ActionEvent> botonPauseAction() {
        return (ActionEvent event) -> {
            modelo.setPause(true);
        };
    }
}

