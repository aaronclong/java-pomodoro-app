package app.Mac.pomodoro.control;

import app.Mac.pomodoro.db.SetUp;
import app.Mac.pomodoro.ui.TopBar;
import app.Mac.pomodoro.ui.Window;

import java.util.HashMap;

/**
 * Created by AaronLong on 9/7/16.
 */
public class Init {


    private Window view;
    private SetUp db;

    //Controllers
    private ManageUsers theUsers;

    public Init(Window w) {
        try {
            db = new SetUp();
            view = w;
            setUsers();
        }
        catch (ClassNotFoundException e) {
            //Need to add message for error message into the GUI
            System.out.println(e);
        }
    }


    public void setUsers() {
        ManageUsers thoseUsers = new ManageUsers(db);
        thoseUsers.getUsers(view);

        //TODO: Start From here Pull the Mange Use through the builder method and add the view
    }



}
