package app.Mac.pomodoro.ui;

import com.sun.tools.javac.comp.Flow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


/**
 * Created by AaronLong on 9/5/16.
 */
public class Window extends Application {

    @Override
    public void start(Stage start) {
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 400, 300);
        start.setTitle("Pomodoro");
        start.setScene(scene);
        start.show();
    }
}
