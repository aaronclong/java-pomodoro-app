package app.Mac.pomodoro;

//FX Imports
import app.Mac.pomodoro.control.Coordinator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//Internal Imports
import app.Mac.pomodoro.db.SetUp;


/**
 * Created by AaronLong on 9/5/16.
 */
public class Window extends Application {

    private Coordinator coordinator;
    private FlowPane root;

    @Override
    public void start(Stage start) {
        //I don't how to set this out in an MVC style when everything must be done inside this class
        start.setTitle("Pomodoro");
        coordinator = new Coordinator();
        start.setScene(coordinator.init());
        start.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
