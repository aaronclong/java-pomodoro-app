package app.Mac.pomodoro.db;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by AaronLong on 8/22/16.
 */

@DatabaseTable(tableName = "interval")
public class Interval {

    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "data", canBeNull = false)
    private Date date;

    @DatabaseField(columnName = "outcome", canBeNull = false)
    private boolean outcome;

    @DatabaseField(columnName = "timeLength", canBeNull = false)
    private double timeLength;

    @DatabaseField(columnName = "user", foreign = true, foreignAutoRefresh = true)
    private Users user;

    @DatabaseField(columnName = "activity", foreign = true, foreignAutoRefresh = true)
    private Activities active;

    public Interval() {

    }

    public Interval(Users user, double interval, Activities active) {
        this.user = user;
        this.date = new Date();
        this.timeLength = interval;
        this.active = active;
    }

    public void setOutcome(boolean outcome) {
        this.outcome = outcome;
    }

    public double getLength() {
        return timeLength;
    }

    public boolean getOutcome() {
        return this.outcome;
    }
}
