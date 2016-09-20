package app.Mac.pomodoro.db;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by AaronLong on 9/7/16.
 */
public abstract class Query {

    private SetUp db;

    Query(SetUp database) {
        db = database;
    }

    QueryBuilder<Users, Integer> queryUsers() {
        return db.getUsersDao().queryBuilder();
    }

    QueryBuilder<Activities, Integer> queryActivities() {
        return db.getActiveDao().queryBuilder();
    }

    QueryBuilder<Interval, Integer> queryInterval() { return db.getIntervalDao().queryBuilder(); }


    //need one for collections
    boolean putUsersDao(Users newUser) {
        boolean status = false;
        try {
            db.getUsersDao().create(newUser);
            status = true;
        } catch (SQLException e) { }
        return status;
    }

    boolean putUsersDao(Collection<Users> newUser) {
        boolean status = false;
        try {
            db.getUsersDao().create(newUser);
            status = true;
        } catch (SQLException e) { }
        return status;
    }

}
