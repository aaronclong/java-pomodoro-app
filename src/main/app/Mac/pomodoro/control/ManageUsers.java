package app.Mac.pomodoro.control;

import app.Mac.pomodoro.db.SetUp;
import app.Mac.pomodoro.db.QueryUsers;
import app.Mac.pomodoro.db.Users;
import app.Mac.pomodoro.ui.TopBar;
import app.Mac.pomodoro.Window;
import javafx.scene.layout.FlowPane;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by AaronLong on 9/7/16.
 */
public class ManageUsers extends Manager<QueryUsers> {

    private TopBar elem;
    private HashMap<Integer, String> users;

    public ManageUsers(SetUp db) {
        super(new QueryUsers(db));
        elem = new TopBar();
    }

    public void updateUsers() {
        users = getQ().getUsers();
        elem.addUsers(new ArrayList<String>(users.values()));
    }

    public FlowPane render() {
        return elem.render();
    }

}
