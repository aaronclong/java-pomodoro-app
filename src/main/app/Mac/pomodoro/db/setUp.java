package app.Mac.pomodoro.db;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.h2.jdbc.JdbcConnection;

import java.io.File;
import java.sql.*;

/**
 * Created by AaronLong on 8/22/16.
 */
public class SetUp {

    public SetUp() throws ClassNotFoundException {
        String db = System.getProperty("user.home") + "/Library/Pomodoro/pomodoro";
        try {
            boolean exists = new File(db).exists();
            ConnectionSource con = new JdbcConnectionSource("jdbc:h2:" + db);
            if (!exists){
                TableUtils.createTableIfNotExists(con, Users.class);
                TableUtils.createTableIfNotExists(con, Activities.class);
                TableUtils.createTableIfNotExists(con, Interval.class);
            }
            BaseDaoImpl<Users, Integer> usersDao = DaoManager.createDao(con, Users.class);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean checkDir(String path) {
        File dir = new File(path);
        return dir.exists();
    }

    public static void main(String[] args) {
        try {
            SetUp test = new SetUp();
        }catch(Exception e) { System.out.println(e); }
    }
}
