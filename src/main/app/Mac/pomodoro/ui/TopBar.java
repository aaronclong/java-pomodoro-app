package app.Mac.pomodoro.ui;
import javax.swing.*;
import java.util.HashMap;


/**
 * Created by AaronLong on 9/5/16.
 */
public class TopBar extends Layer {

    private Integer curUser;
    //Maybe redo implementing https://docs.oracle.com/javase/8/docs/api/javax/swing/ComboBoxModel.html
    private HashMap<Integer, String> selectUser;

    public TopBar() {
        super();
        selectUser = new HashMap<Integer, String>();
    }

    public TopBar(HashMap<Integer, String> users) {
        super();
        selectUser = users;
    }

    public void addUsers(HashMap<Integer, String> users) {
      selectUser = users;
    }

    JComboBox<String> makeDropDown() {
        JComboBox<String> users = new JComboBox<>(
                                      selectUser.values()
                                                .toArray(new String[selectUser.size()]));
        return users;
    }

    //Slow because it is waiting on the database
    public void render(Window w) {
        JPanel pan = createFlow();
        JButton addUser = new JButton("Add User");
        pan.add(addUser);
        pan.add(makeDropDown());
        w.add(pan);
    }

}
