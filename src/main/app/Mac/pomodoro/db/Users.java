package app.Mac.pomodoro.db;

import java.util.Date;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.*;

/**
 * Created by AaronLong on 8/22/16.
 */

@DatabaseTable(tableName = "users")
public class Users {

    @DatabaseField(columnName = "id", generatedId = true)
    private Integer id;

    @DatabaseField(columnName = "name", canBeNull = false)
    private String name;

    @DatabaseField(columnName = "email", canBeNull = false)
    private String email;

    //@DatabaseField(columnName = "hash", canBeNull = false)
    //private String hash;

    @DatabaseField(columnName = "account_creation", canBeNull = false)
    private Date origin; //User addition date

    @DatabaseField(columnName = "last_active", canBeNull = false)
    private Date active;

    public Users() { }

    public Users(String name, String email, String password) {
        this.name = name;
        this.email = email;
        //this.hash = hashPassword(password);
        this.origin = new Date();
        this.active = new Date();
    }

    public String getName() {
        return this.name;
    }

    public Integer getID() {
        return this.id;
    }

}
