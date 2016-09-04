package app.Mac.pomodoro.db;


import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.*;

/**
 * Created by AaronLong on 8/22/16.
 */

@DatabaseTable(tableName = "activities")
public class Activities {

    @DatabaseField(columnName = "id", generatedId = true)
    private Integer id;

    @DatabaseField(foreign=true, foreignAutoRefresh = true)
    private Users user;

    @DatabaseField(canBeNull = false)
    private String activity;

    @DatabaseField()
    private double stats;

    @DatabaseField()
    private int intervals;

    @DatabaseField()
    private int fails;

    @DatabaseField()
    private int success;

    public Activities() { }

    public Activities(String name, Users user) {
        this.activity = name;
        this.user = user;
        this.intervals = 0;
        this.fails = 0;
        this.success = 0;
    }

    public void resultsInterval(boolean outcome) {
        this.intervals++;
        if (!outcome) { this.fails++; }
        else if (outcome) { this.success++; }
        this.stats = ((double)success)/((double)intervals);
    }

    public double getStats() { return stats; }

    public String getName() {
        return activity;
    }

}
