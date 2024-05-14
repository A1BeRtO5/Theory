package AWT;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowAdapter extends WindowAdapter {
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
        e.getWindow().dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Iconified");    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("eiconified");    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("StateChanged");
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        System.out.println("Gained");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        System.out.println("windowLostFocus");
    }
}
