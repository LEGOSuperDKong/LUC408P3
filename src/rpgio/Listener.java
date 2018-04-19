package rpgio;

import java.awt.event.*;
import javax.swing.*;
import rpgio.Main;

public class Listener implements ActionListener {

	static JButton endTurnBtn;
	static JButton moveBtn;
	static gui frame;

	  public Listener(gui f, JButton turn, JButton move) {

		  endTurnBtn = turn;
		  moveBtn = move;
		  frame = f;
	  }

	@Override
	public void actionPerformed(ActionEvent e) {


		if(e.getSource() == endTurnBtn)
		{
			System.out.println("Turn Button Clicked");
			//set endTurn to true
			frame.setEndTurn(true);
		}

		if(e.getSource() == moveBtn)
		{
			System.out.println("Move Button Clicked");
			//move character
			frame.setMove(true);
		}

	}



}
