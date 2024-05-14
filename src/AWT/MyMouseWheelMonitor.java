package AWT;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MyMouseWheelMonitor implements MouseWheelListener {
    //слухач колеса миші
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println(e);
    }
}
