package AWT;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MyMouseListener implements MouseListener {
    private static int count = 0;
    private final String buttonLabel;
    private final Random random = new Random();

    public MyMouseListener(String buttonLabel) {
        this.buttonLabel = buttonLabel;
    }


    //слухач мишки
    @Override
    public void mouseClicked(MouseEvent e) {
        ((Button) e.getComponent()).setLabel(buttonLabel + " " + ++count);
        System.out.println(e);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        Component component = e.getComponent();
        int width = component.getParent().getWidth();
        int height = component.getParent().getHeight();

        int topBoundHeight = (int) component.getParent().getPreferredSize().getHeight();
        int widthArea = width - component.getWidth();
        int heightArea = height - topBoundHeight - component.getHeight();

        component.setLocation(random.nextInt(widthArea), random.nextInt(heightArea) + topBoundHeight);
        System.out.println(e);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e);
    }
}
