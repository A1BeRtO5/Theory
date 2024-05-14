package AWT;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyMouseMotionListener implements MouseMotionListener {
    public final Graphics graphics;

    public MyMouseMotionListener(Graphics graphics) {
        this.graphics = graphics;
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics q = graphics;
        graphics.setColor(Color.MAGENTA);
        graphics.fillOval(e.getX(), e.getY(), 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
