package app.Mac.pomodoro.control;

import app.Mac.pomodoro.db.SetUp;
import app.Mac.pomodoro.db.QueryUsers;
import app.Mac.pomodoro.db.Users;
import app.Mac.pomodoro.ui.TopBar;
import app.Mac.pomodoro.ui.Window;


import java.util.HashMap;

/**
 * Created by AaronLong on 9/7/16.
 */
public class ManageUsers extends Manager<QueryUsers> {

    private TopBar elem;

    public ManageUsers(SetUp db, Window w) {
        super(new QueryUsers(db));
        elem = new TopBar(w);
    }

    public void addUsers(Users newUser) {
    }

    public void getUsers(Window w) {
        elem.addUsers(getQ().getUsers());
        elem.render(w);
    }

}
