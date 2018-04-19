package rpgio;

import rpgio.Player;
import rpgio.Weapon;
import rpgio.Enemy;
import rpgio.gui;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;


public class Main{

	static gui frame;
    static Random rand = new Random();

    //Main function
    public static void main (String[] args) {

        System.out.println(new File("").getAbsolutePath());

        boolean winner = false;

        Player [] playerArr = new Player [4];
        for(int i=0; i < playerArr.length; i++)
        {
        	playerArr[i]= new Player(i+1);
        }

        int playerTurn = rand.nextInt(4);

        playerArr[0].setAI();
        playerArr[1].setAI();
        playerArr[2].setAI();

        //Initialize map
        frame = new gui(playerArr);
        frame.setVisible(true);


        while(!winner){
            turn(playerArr[playerTurn]);

            //set next players turn
            playerTurn = (playerTurn + 1) % 4;
        }

    }

    private static void turn (Player p)
    {
       if(p.getAI())
       {

    	   //Set text to Computer
    	   frame.setTurnText("Computer " + p.getID() +"'s Turn");

    	   //Disable Buttons
    	   frame.setButtonsEnabled(false);

    	   //add pause before move for realism
    	   try{
    		   Thread.sleep(1000);
    	   }catch(Exception e){
    		   e.printStackTrace();
    	   }

    	   //allows them to move up to 4 times
    	   int numOfMoves = rand.nextInt(4) + 1;

           for(int i = numOfMoves; i > 0; i--)
           {
        	   //For time's sake, just make them move
        	   move(p);

        	   //add pause after move for realism
        	   try{
        		   Thread.sleep(1000);
        	   }catch(Exception e){
        		   e.printStackTrace();
        	   }
           }


           return;
       }

       //IF IT GETS HERE PLAYER IS NOT AI
       frame.setTurnText("Your Turn!");

       //Enable buttons
       frame.setButtonsEnabled(true);


        while (!frame.getEndTurn())
        {
        	Thread.yield(); //idles thread for Listener to do work.

             //move, use items, fight (if next to someone after move)
        	if(frame.getMove())
        	{
        		move(p);
        		frame.setMove(false);
        	}

        }

        frame.setEndTurn(false);
        System.out.println("Turn has ended.");

        //if they win
        //winner = true;
    }

    private static void move(Player p)
    {
    	/*
    	 * TODO: Implement this. Could just move player left and right
    	 * and reverse direction when they hit the wall? Or could randomly
    	 * generate a direction of move, just have to handle collisions then or
    	 * just allow one player to be on top of another. Whatever we have time for...
    	 *
    	 * */
    	frame.movePlayer();

    	System.out.println("moved player " + p.getID());
    }



}
