package app.Mac.pomodoro.ui;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.GroupLayout;

/**
 * Created by AaronLong on 9/5/16.
 */
abstract class Layer {
    JPanel createPanel() {
        return new JPanel();
    }

    JPanel createFlow() {
        JPanel flow = createPanel();
        flow.setLayout(new FlowLayout());
        return flow;
    }

    JPanel creatGrid(int rows, int cols) {
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(rows, cols));
        return grid;
    }

    GroupLayout createGroup(Container pane) {
        return new GroupLayout((JPanel) pane);
    }

    abstract void render(Window w);
}
