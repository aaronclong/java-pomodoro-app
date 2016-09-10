package app.Mac.pomodoro;

import java.awt.EventQueue;
import app.Mac.pomodoro.control.Init;
import app.Mac.pomodoro.ui.Window;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Window w = new Window();
            Init control = new Init(w);
            //w.setVisible(true);
        });
    }
}