package app.Mac.pomodoro.ui;
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
public class TopBar extends Layer<FlowPane>{

    private Integer curUser;

    private ObservableList selectUser;

    public TopBar() {
        super(new FlowPane());
    }

    public void addUsers(List<String> users) {
        selectUser = FXCollections.observableArrayList(users);
    }

    public void addUsers(String user) {
        selectUser.add(user);
    }

    ComboBox<String> makeDropDown() {
        return new ComboBox<String>(selectUser);
    }

    public FlowPane render() {
        Button addUser = new Button("Add Users");
        FlowPane cur = getPane();
        cur.getChildren().addAll(addUser, makeDropDown());
        return cur;
    }
}
