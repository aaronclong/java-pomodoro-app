package app.Mac.pomodoro.ui;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;


/**
 * Created by AaronLong on 9/5/16.
 */
public class TopBarLayer extends Layer<FlowPane>{

    //private Integer curUser;

    private ComboBox<String> box;
    private ObservableList boxData;

    public TopBarLayer() {
        super(new FlowPane());
        boxData = FXCollections.observableArrayList();
        box = new ComboBox<>();
    }

    public void addUsers(List<String> users) {

        boxData.addAll(users);
    }

    public void addUsers(String user) {
        boxData.add(user);
    }

    ComboBox<String> makeDropDown() {
        box.setItems(boxData);
        return box;
    }

    public FlowPane render() {
        Button addUser = new Button("Add Users");
        FlowPane cur = getPane();
        cur.getChildren().addAll(addUser, makeDropDown());
        return cur;
    }
}
