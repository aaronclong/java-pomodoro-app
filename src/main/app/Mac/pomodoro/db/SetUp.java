package app.Mac.pomodoro.db;

//OrmLite Packages
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

//Basic Java Packages
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;

/**
 * Created by AaronLong on 8/22/16.
 */
public class SetUp {
    private ConnectionSource con;
    private Dao<Users, Integer> usersDao;
    private Dao<Activities, Integer> activeDao;
    private Dao<Interval, Integer> intervalDao;

    public SetUp() throws ClassNotFoundException {
        String db = System.getProperty("user.home") + "/Library/Pomodoro/pomodoro";
        try {
            boolean exists = checkDir(db);
            this.con = new JdbcConnectionSource("jdbc:h2:" + db);
            if (!exists){
                TableUtils.createTableIfNotExists(con, Users.class);
                TableUtils.createTableIfNotExists(con, Activities.class);
                TableUtils.createTableIfNotExists(con, Interval.class);
            }
            this.usersDao = DaoManager.createDao(con, Users.class);
            this.activeDao = DaoManager.createDao(con, Activities.class);
            this.intervalDao = DaoManager.createDao(con, Interval.class);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    protected Dao<Users, Integer> getUsersDao() { return usersDao; }

    protected Dao<Activities, Integer> getActiveDao() { return activeDao; }

    protected Dao<Interval, Integer> getIntervalDao() { return intervalDao; }

    public boolean checkDir(String path) {
        File dir = new File(path);
        return dir.exists();
    }

    protected void close() {

    }

    public static void main(String[] args) {
        try {
            SetUp test = new SetUp();
            List<Users> toAdd = new ArrayList<Users>();
            toAdd.addAll(
                    Arrays.asList(new Users("Aaron", "email", "saywhat!!!"),
                            new Users("Rachel", "email", "saywhat!!!"),
                            new Users("Damon", "email", "saywhat!!!")));
            Dao usersDao = test.getUsersDao();
            for (Users u : toAdd) {
                usersDao.create(u);
            }
            List<Users> getNames = usersDao.queryBuilder().query();
            for(Users u : getNames) {
                System.out.println(u.getName());
            }
        } catch(Exception e) { System.out.println(e); }
    }
}
