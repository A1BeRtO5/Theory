package AWT.Label;

import AWT.MyMouseListener;
import AWT.MyMouseMotionListener;
import AWT.MyWindowAdapter;

import java.awt.*;

class BasicFrame extends Frame {
    public BasicFrame() {

        setSize(300, 300);
        setTitle("AWT window example");
        setLayout(null);//ставити компоненти вручну або автоматично
        setVisible(true);//відображає форму
        addWindowListener(new MyWindowAdapter());

//        simpleLabelExample();
        myLabelExample();
    }
    private void simpleLabelExample() {
        Label label = new Label("1234567891011121314151617");
        label.setBounds(30, 100, 483, 42);
        add(label);
        label.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        System.out.println(label.getPreferredSize());

        addButton(label);
    }
    private void myLabelExample() {
        MyLabel  myLabel;
//        myLabel = new MyLabel("Do you like programmingffffffffffffffffff?", this);
        myLabel = new MyLabel("Do you like programmingffffffffffffffffff?", this, new Font(Font.SERIF, Font.BOLD, 20));
        addButton(myLabel);
    }
    private void addButton(Label label) {
        String buttonLabel = "Click";
        Button button = new Button(buttonLabel);

        button.setBounds(100, 150, 80, 30);
        add(button);
        button.addMouseListener(new MyMouseAdapter(label));
    }
}
