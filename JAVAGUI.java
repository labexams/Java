
//⚠ JAVA 8 is mandatory to run this porgram

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JAVAGUI {
    public static void main(String[] args) {
        ADDSUB a = new ADDSUB();
    }
}

class ADDSUB extends JFrame{
    JTextField t1, t2;
    JButton b1, b2;
    JLabel l;

    public ADDSUB() {

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 + num2;
                l.setText(value + "");

            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1 - num2;
                l.setText(value + "");
            }
        });
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(3);


    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int value;
        if (ae.getSource() == b1)
            value = num1 + num2;
        else
            value = num1 - num2;
        l.setText(value + "");
    }
}
