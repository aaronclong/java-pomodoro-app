package app.Mac.pomodoro.control;


/**
 * Created by AaronLong on 9/8/16.
 */
abstract class Manager<T> {

    private T q;

    Manager(T query) {
        q = query;
    }

    T getQ() {
        return q;
    }

}
