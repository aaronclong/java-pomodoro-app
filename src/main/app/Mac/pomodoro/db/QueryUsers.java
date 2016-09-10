package app.Mac.pomodoro.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by AaronLong on 9/8/16.
 * WARNING Possible conflict with failed SQL Query and No Users being listed
 */
public class QueryUsers extends Query {

    public QueryUsers(SetUp db) {
        super(db);
    }

    public HashMap<Integer, String> getUsers() {
        HashMap<Integer, String> details = new HashMap<Integer, String>();
        try {
            List<Users> users = queryUsers().query();
            for (Users u : users) {
                details.put(u.getID(), u.getName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return details;
    }

    //redundant and problematic, switch to generic somehow?
    public void add(Users newUser) {
        putUsersDao(newUser);
    }
}
