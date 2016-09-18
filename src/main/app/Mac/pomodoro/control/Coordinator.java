package app.Mac.pomodoro.control;

import app.Mac.pomodoro.db.SetUp;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;


/**
 * Created by AaronLong on 9/11/16.
 */
public class Coordinator {

    //Start
    Stage app;

    //Database
    private SetUp db;
    private FlowPane view;

    //Managers
    private ManageUsers users;

    public Coordinator() {
        try {
            db = new SetUp();
        } catch (ClassNotFoundException e) {

        }
    }


    public Scene init() {
        FlowPane root = new FlowPane();
        FlowPane pane = new FlowPane();
        pane.getChildren().addAll(new Button("Add Users"), users.updateUsers());
        root.getChildren().add(pane);
        Scene init = new Scene(root, 400, 300);
        return init;
    }

    public void switchScence() {

    }
}
