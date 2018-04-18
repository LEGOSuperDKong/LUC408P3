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

    //Main function
    public static void main (String[] args) {

        System.out.println(new File("").getAbsolutePath());

        boolean winner = false;

        Player [] playerArr = new Player [4];
        for(int i=0; i < playerArr.length; i++)
        {
        	playerArr[i]= new Player();
        }

        Random rand = new Random();

        int playerTurn = rand.nextInt(4);

        playerArr[0].setAI();
        playerArr[1].setAI();
        playerArr[2].setAI();

        //Initialize map
        gui frame = new gui();
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
           //send to another function
           return;
       }

        boolean endTurn = false;

        while (!endTurn){
             //move, use items, fight (if next to someone after move)
        }


        //if they win
        //winner = true;
    }



}
