package AWT.Label;

import java.awt.*;

public class MyLabel extends Label {
    public MyLabel(String text, Frame frame, Font font) throws HeadlessException {
        super(text);
        setFont(font);
        add(frame);
    }
    public MyLabel(String text, Frame frame) throws HeadlessException {
        super(text);
        add(frame);
    }
    private  void add(Frame frame) {
        setLocation(60, 40);
        frame.add(this);
        setDynamicSize();
    }
    private void setDynamicSize() {
        setSize(getPreferredSize());
    }
    public void setFont(Font f) {
        super.setFont(f);
        setDynamicSize();
    }
}
