package AWT;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class MyKeyListener implements KeyListener {
    //слухач кнопок
    private final StringBuilder STRING_BUILDER = new StringBuilder();
    private final Map<Character, Image> ICON_MAP = new HashMap<>();

    public MyKeyListener() {
        ICON_MAP.put('[' , Toolkit.getDefaultToolkit().getImage("ff.png"));
        ICON_MAP.put(']' , Toolkit.getDefaultToolkit().getImage("java.png"));

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '\n') {
            System.out.println(STRING_BUILDER);
            STRING_BUILDER.setLength(0);
        } else {
            System.out.println(e.getKeyChar());
            STRING_BUILDER.append(e.getKeyChar());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        Frame frame = getParentFrame(e.getComponent());
        frame.setIconImage(ICON_MAP.get(e.getKeyChar()));
        }

    private Frame getParentFrame(Component component) {
        while (component.getParent() !=null) {
        component = component.getParent();
        }
    return (Frame) component;
    }
}
