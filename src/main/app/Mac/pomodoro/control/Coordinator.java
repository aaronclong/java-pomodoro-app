package app.Mac.pomodoro.control;

import app.Mac.pomodoro.db.SetUp;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.net.URL;


/**
 * Created by AaronLong on 9/11/16.
 */
public class Coordinator extends Application {

    //Start
    Stage app;

    //Database
    private SetUp db;
    private VBox view;

    //Managers
    private ManageUsers users;

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage start) {
        try {
            db = new SetUp();
            FXMLLoader load = new FXMLLoader();
            String file = "/pomodoro.fxml";
            URL fxml = getClass().getResource(file);
            view = (VBox) load.load(fxml);
            Scene scene = new Scene(view);
            start.setScene(scene);
            start.show();
        }catch(Exception e) {
            System.out.println(e);
        }

    }
}
