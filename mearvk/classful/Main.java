package classful;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame main = new JFrame("IDE 33");

        main.setLayout(new BoxLayout(main.getContentPane(),BoxLayout.Y_AXIS));

        main.setSize(new Dimension(1280,620));

        //

        JMenuBar menu_bar = new JMenuBar();

        JMenu menu = new JMenu("=");

        JMenuItem file = new JMenuItem("File");

        JMenuItem object = new JMenuItem("Object");

        menu.add(file);

        menu.addSeparator();

        menu.add((object));

        menu_bar.add(menu);

        //

        JPanel jPanel1 = new JPanel();

        JPanel jPanel2 = new JPanel();

        JPanel jPanel3 = new JPanel();

        //

        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));

        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.X_AXIS));

        //

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"INT", "33", "DE"});

        comboBox.setMinimumSize(new Dimension(45, 20));

        comboBox.setPreferredSize(new Dimension(45,20));

        comboBox.setMaximumSize(new Dimension(45, 20));

        jPanel1.add(comboBox);

        //

        JTextField textField = new JTextField();

        textField.setMinimumSize(new Dimension(12, 20));

        textField.setPreferredSize(new Dimension(12,20));

        textField.setMaximumSize(new Dimension(12, 20));

        jPanel2.add(textField);

        //

        JButton button1 = new JButton("G");

        JButton button2 = new JButton("J");

        jPanel3.add(button1);

        jPanel3.add(button2);

        //

        main.setJMenuBar(menu_bar);

        main.getContentPane().add(jPanel1);

        main.getContentPane().add(jPanel2);

        main.getContentPane().add(jPanel3);

        //

        main.setLocationRelativeTo(null);

        main.setVisible(true);
    }
}