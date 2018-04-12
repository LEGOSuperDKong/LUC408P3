package rpgio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class gui extends JFrame{


    gui()
    {
    	super("RPGio"); //Sets title
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel gameBoard = new JPanel();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);

        JButton btnMove = new JButton("Move");
        JButton btnItem = new JButton("Use Item");

        btnMove.setBounds(0, 0, 100, 100);
        btnItem.setBounds(100, 0, 100, 100);

        buttonPanel.add(btnMove);
        buttonPanel.add(btnItem);
        add(buttonPanel);

    }

}
