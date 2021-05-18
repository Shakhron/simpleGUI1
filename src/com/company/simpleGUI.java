package com.company;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.*;

public class simpleGUI extends JFrame {
        private JTextField field = new JTextField("Sergei");
        private JPasswordField field2 = new JPasswordField("exemple");
        private JTextField field3 = new JTextField("Введите сюда Ваш заказ");
        private JTextArea area = new JTextArea("Ваш заказ");
        private JButton button1 = new JButton("Применить");
        private JButton button2 = new JButton("Отменить");
        private JButton button3 = new JButton("Выйти");

        public simpleGUI(){
            super("Поля ввода");
            this.setBounds(100,100,400,400);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = this.getContentPane();
            container.setLayout(null);

            field.setBounds(100,5,100,30);
            field2.setBounds(100,35,100,30);
            field3.setBounds(5,70,200,30);
            area.setBounds(5,110,200,200);
            button1.setBounds(220,110,100,30);
            button2.setBounds(220,145,100,30);
            button3.setBounds(220,180,100,30);
            container.add(field);
            container.add(field2);
            container.add(field3);
            container.add(area);
            container.add(button1);
            container.add(button2);
            container.add(button3);
        }
}
