package AWT;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyFocusListener implements FocusListener {
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println(e);
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println(e);
    }
}
