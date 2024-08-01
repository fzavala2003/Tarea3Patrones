package Vista; 
import Modelo.Model;
import Observer;
 
public class View implements Observer {
    private Model modelo;
 
    public View(Model modelo) {
        this.modelo = modelo;
        this.modelo.addObserver(this);
    }
    @Override
    public void update() {
        // Código para actualizar la interfaz de usuario cuando el modelo cambia
        System.out.println("La vista ha sido notificada del cambio en el modelo.");
    }
    public Scene iniciarEscena() {
        // Código para configurar y retornar la escena de la interfaz de usuario
        return new Scene(new Pane(), 800, 600);  // Ejemplo simplificado
    }
 
    public void display() {
        // Código para mostrar la interfaz de usuario
    }
}
