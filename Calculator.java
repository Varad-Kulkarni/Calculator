package Java_Swings;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, bdec, beq, bdel, bclr;
    double num1 = 0, num2 = 0, res = 0;
    int flag = 0;

    Calculator() {
        t = new JTextField();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bdec = new JButton(".");
        beq = new JButton("=");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("x");
        bdiv = new JButton("/");
        bdel = new JButton("C");
        bclr = new JButton("AC");
        t.setBounds(30, 40, 240, 30);
        b0.setBounds(110, 310, 50, 40);
        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        badd.setBounds(250, 310, 50, 40);
        bsub.setBounds(250, 240, 50, 40);
        bmul.setBounds(250, 170, 50, 40);
        bdiv.setBounds(250, 100, 50, 40);
        bdel.setBounds(60, 380, 100, 40);
        bclr.setBounds(180, 380, 100, 40);
        bdec.setBounds(40, 310, 50, 40);
        beq.setBounds(180, 310, 50, 40);
        beq.setBackground(Color.green);
        bclr.setBackground(Color.RED);
        bdel.setBackground(Color.orange);
        badd.setBackground(Color.yellow);
        bsub.setBackground(Color.yellow);
        bmul.setBackground(Color.yellow);
        bdiv.setBackground(Color.yellow);
        add(t);
        add(b7);
        add(b8);
        add(b9);
        add(bdiv);
        add(b4);
        add(b5);
        add(b6);
        add(bmul);
        add(b1);
        add(b2);
        add(b3);
        add(bsub);
        add(bdec);
        add(b0);
        add(beq);
        add(badd);
        add(bdel);
        add(bclr);
        b0.addActionListener(b0a -> {
            t.setText(t.getText().concat("0"));
        });
        b1.addActionListener(b1a -> {
            t.setText(t.getText().concat("1"));
        });
        b2.addActionListener(b2a -> {
            t.setText(t.getText().concat("2"));
        });
        b3.addActionListener(b3a -> {
            t.setText(t.getText().concat("3"));
        });
        b4.addActionListener(b4a -> {
            t.setText(t.getText().concat("4"));
        });
        b5.addActionListener(b5a -> {
            t.setText(t.getText().concat("5"));
        });
        b6.addActionListener(b6a -> {
            t.setText(t.getText().concat("6"));
        });
        b7.addActionListener(b7a -> {
            t.setText(t.getText().concat("7"));
        });
        b8.addActionListener(b8a -> {
            t.setText(t.getText().concat("8"));
        });
        b9.addActionListener(b9a -> {
            t.setText(t.getText().concat("9"));
        });
        bdec.addActionListener(bdeca -> {
            t.setText(t.getText().concat("."));
        });
        badd.addActionListener(badda -> {
            num1 = Double.parseDouble(t.getText());
            flag = 1;
            t.setText("");
        });
        bsub.addActionListener(bsuba -> {
            num1 = Double.parseDouble(t.getText());
            flag = 2;
            t.setText("");
        });
        bmul.addActionListener(bmula -> {
            num1 = Double.parseDouble(t.getText());
            flag = 3;
            t.setText("");
        });
        bdiv.addActionListener(bdiva -> {
            num1 = Double.parseDouble(t.getText());
            flag = 4;
            t.setText("");
        });
        beq.addActionListener(beqa -> {
            num2 = Double.parseDouble(t.getText());
            switch (flag) {
            case 1:
                res = num1 + num2;
                break;
            case 2:
                res = num1 - num2;
                break;
            case 3:
                res = num1 * num2;
                break;
            case 4:
                res = num1 / num2;
                break;
            default:
                res = 0;
            }
            t.setText("" + res);
        });
        bdel.addActionListener(bdela -> {
            String s = t.getText();
            t.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                t.setText(t.getText() + s.charAt(i));
            }
        });
        bclr.addActionListener(bclra -> {
            t.setText("");
        });
        setTitle("Calculator");
        getContentPane().setBackground(Color.BLACK);
        setResizable(false);
        setLayout(null);
        setSize(350, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new Calculator();
    }
}
