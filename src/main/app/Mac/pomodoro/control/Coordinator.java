package app.Mac.pomodoro.control;

import app.Mac.pomodoro.db.SetUp;
import javafx.scene.layout.FlowPane;


/**
 * Created by AaronLong on 9/11/16.
 */
public class Coordinator {

    //Database
    private SetUp db;
    private FlowPane view;

    //Managers
    private ManageUsers users;

    public Coordinator(FlowPane p) {
        try {
            db = new SetUp();
            view = p;
        } catch (ClassNotFoundException e) {

        }
    }

    public ManageUsers makeUsers() {
        users = new ManageUsers(db);
        view.getChildren().add(users.render());
        return users;
    }


}
