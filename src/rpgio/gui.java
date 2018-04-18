package rpgio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class gui extends JFrame{

	//buttons and images
	ImageIcon movebg = new ImageIcon("images/moveButton.png");
    ImageIcon itembg = new ImageIcon("images/itemButton.png");
    ImageIcon turnbg = new ImageIcon("images/turnButton.png");

    JButton btnTurn = new JButton(turnbg);
    JButton btnMove = new JButton(movebg);
    JButton btnItem = new JButton(itembg);

    //listener
    ActionListener listener = new Listener(btnTurn, btnMove);

    //Constructor
    gui()
    {
    	super("RPGio"); //Sets title
        setSize(1920,1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel gameBoard = new JLabel();
        JPanel gameBoardHolder = new JPanel();
        //gameBoardHolder.setLayout(null);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());


        btnMove.setBounds(0, 0, 100, 100);
        btnItem.setBounds(100, 0, 100, 100);
        
        //move button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        buttonPanel.add(btnMove,c);
        btnMove.addActionListener(listener);
        
        //item button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        buttonPanel.add(btnItem,c);
        
        //turn button
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        buttonPanel.add(btnTurn, c);
        btnTurn.addActionListener(listener);
        
        //panel of buttons added to frame
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(buttonPanel, c);
        
        ImageIcon gameMap = new ImageIcon("gameboardcopy.png");
        gameBoard.setIcon(gameMap);
        gameBoardHolder.add(gameBoard);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        add(gameBoardHolder,c);

    }


  //Get methods for buttons for use with Listener class
    public ActionListener getListener(){
    	return listener;
    }


}
