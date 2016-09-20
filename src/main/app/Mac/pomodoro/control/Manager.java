package app.Mac.pomodoro.control;


import app.Mac.pomodoro.db.Query;

/**
 * Created by AaronLong on 9/8/16.
 */
abstract class Manager<T extends Query> {

    private T q;

    Manager(T query) {
        q = query;
    }

    T getQ() {
        return q;
    }

}
