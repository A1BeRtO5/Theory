package AWT.TextFiledPackage;

import AWT.MyWindowAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BasicFrame extends Frame {
    private final TextField firstNumberTF;
    private final TextField secodNumberTF;
    private final TextField resultNumberTF;

    private final Button sumButton;
    private final Button minusButoon;
    private final Button multiButoon;
    private final Button divButoon;

    public BasicFrame () {
        setSize(400, 300);
        setTitle("TestProgram");
        addWindowListener(new MyWindowAdapter());
        setLayout(null);

        firstNumberTF = addAndGetNumberTF(50, true);
        secodNumberTF = addAndGetNumberTF(90,true);
        resultNumberTF = addAndGetNumberTF(130, false);

        sumButton = addAndGetButton(70, 160, NumberAction.SUM);
        minusButoon = addAndGetButton(170, 160, NumberAction.MINUS);
        multiButoon = addAndGetButton(70, 230, NumberAction.MULTI);
        divButoon = addAndGetButton(170, 230, NumberAction.DIV);
        centreWindow();
        setVisible(true);

    }
    private TextField addAndGetNumberTF(int y, boolean editable) {
        TextField textField = new TextField();
        textField.setBounds(10,y,  150, 20);
        textField.setEditable(editable);
        if (editable) {
            textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if ((!(Character.isDigit(c))) && (c != '\b')) {
                        e.consume();
                    }
                    System.out.println(c);
                }
            });
        }
        add(textField);
        return textField;
    }

    private Button addAndGetButton(int x, int y, NumberAction numberAction) {
        Button button = new Button(numberAction.getLabel());
        button.setBounds(x, y, 50, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int firstNumber = Integer.parseInt(firstNumberTF.getText());
                int secondNumber = Integer.parseInt(secodNumberTF.getText());
                String result = String.valueOf(numberAction.execute(firstNumber, secondNumber));
                resultNumberTF.setText(result);
            }
        });
        add(button);
        return button;
    }
    public void centreWindow() {//центруємо наш фрейм
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);

    }
}
