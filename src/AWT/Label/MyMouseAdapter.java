package AWT.Label;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
    private final static int MIN_SIZE = 10;
    private final static int MAX_SIZE = 50;
    private int size = MIN_SIZE;
    private final Label label;

    public MyMouseAdapter(Label label) {
        this.label = label;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (size == MAX_SIZE) {
            size = MIN_SIZE;
        } else {
            size+=10;
        }

        Font font = label.getFont();
        Font newFont = new Font(font.getName(), font.getStyle(), size);
        label.setFont(newFont);
    }
}
