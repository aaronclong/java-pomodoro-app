package app.Mac.pomodoro.control;

import app.Mac.pomodoro.db.SetUp;
import app.Mac.pomodoro.db.QueryUsers;
import app.Mac.pomodoro.ui.TopBarLayer;
import javafx.scene.layout.FlowPane;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by AaronLong on 9/7/16.
 */
public class ManageUsers extends Manager<QueryUsers> {

    private TopBarLayer elem;
    private HashMap<Integer, String> users;

    public ManageUsers(SetUp db) {
        super(new QueryUsers(db));
        elem = new TopBarLayer();
    }

    public FlowPane updateUsers() {
        users = getQ().getUsers();
        elem.addUsers(new ArrayList<String>(users.values()));
        return render();
    }

    public FlowPane render() {
        return elem.render();
    }

}
