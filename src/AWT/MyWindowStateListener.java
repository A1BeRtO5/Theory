package AWT;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class MyWindowStateListener implements WindowStateListener {
    //слухач вікнаого

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println(e);
    }
}
