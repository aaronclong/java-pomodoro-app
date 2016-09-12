package app.Mac.pomodoro.ui;

import javafx.scene.layout.Pane;

/**
 * Created by AaronLong on 9/5/16.
 */
abstract class Layer<T extends Pane> {

    private T pane;

    public Layer(T p) {
        pane = p;
    }

    T getPane() {
        return pane;
    }

     void setPane(T p) {
         pane = p;
         render();
     }

    abstract T render();
}
