package app.Mac.pomodoro.ui;

import java.awt.Container;
import java.util.HashMap;
import javax.swing.JFrame;
import app.Mac.pomodoro.control.Init;
import app.Mac.pomodoro.control.ManageUsers;


/**
 * Created by AaronLong on 9/5/16.
 */
public class Window extends JFrame {

    private Container contentPane;

    public Window() {
        super("Pomodoro");
        contentPane = getContentPane();
        init();
    }

    private void init() {
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    protected Container getPane() { return contentPane; }
}
