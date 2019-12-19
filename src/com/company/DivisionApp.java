package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp {
    public static void main(String[] args) {
        First first = new First();
    }
}

class First extends JFrame implements ActionListener {

    private JLabel message;
    private JTextField a;
    private JTextField b;
    private JButton button;
    private JLabel result;

    public First() {
        message = new JLabel("This is an app for dividing two numbers");
        a = new JTextField(25);
        b = new JTextField(25);
        button = new JButton("Divide!");
        result = new JLabel("");

        add(message);
        add(a);
        add(b);
        add(button);
        add(result);

        button.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(a.getText());
            double num2 = Double.parseDouble(b.getText());
            if (num2 == 13) {
                throw new UnluckyException("13? Really? Don't tell me it is friday at least!");
            }
            double response = num1/num2;

            result.setText("The result is: " + response + "");
            message.setText("Yay, a lucky division");
        } catch (NumberFormatException numberEx) {
            message.setText("Emm.. you cannot divide letters, spaces or symbols");
        } catch (UnluckyException unlucky) {
            message.setText(unlucky.getMessage());
        } catch (Exception exception) {
            message.setText("Sorry, something went wrong (");
        }
    }
}
