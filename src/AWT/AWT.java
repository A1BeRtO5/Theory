package AWT;

import java.awt.*;

public class AWT {
//   AWT - API для розробки графічного інтерфейсу користувача (Graphical User Interface / GUI)
    public static void main(String[] args) {
        new BasicFrame();
    }
}
class BasicFrame extends Frame {
    public BasicFrame() {

        setSize(300, 300);
        setTitle("AWT window example");
        setLayout(null);//ставити компоненти вручну або автоматично
        setVisible(true);//відображає форму

        String buttonLabel = "Click";
        Button button = new Button(buttonLabel);

//        Button button2 = new Button("button2");
//        button2.setBounds(200, 150, 80, 30);
//        add(button2);

        button.setBounds(100, 150, 80, 30);
        button.setActionCommand("Bye");
        add(button);

//        addMouseListener(new MyMouseListener());            // мишка
//        addMouseWheelListener(new MyMouseWheelMonitor());
//        addKeyListener(new MyKeyListener());
//        addWindowStateListener(new MyWindowStateListener());
//        addMouseMotionListener(new MyMouseMotionListener(getGraphics()));

        addWindowListener(new MyWindowAdapter());      // вікно
//        addWindowStateListener(new MyWindowAdapter());
//        addWindowFocusListener(new MyWindowAdapter())

//        button.addActionListener(new MyActionListener()); //кнопка
//        button.addKeyListener(new MyKeyListener());
//        button.addFocusListener(new MyFocusListener());
//        button.addMouseListener(new MyMouseListener(buttonLabel));
        button.addMouseMotionListener(new MyMouseMotionListener (getGraphics()));



    }
}
