package rpgio;


import Player.java;
import Weapon.java;
import Enemy.java;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main{

    //Main function
    public static void main (String [ ] args) {


        boolean winner = false;

        Player [] playerArr = new Player [4];

        Random rand = new Random();

        int playerTurn = rand.nextInt(4);

        playerArr[0].setAI();
        playerArr[1].setAI();
        playerArr[2].setAI();

        //TODO: Initialize map
        JButton jbtnMove = new JButton ("Move");
        JButton jbtnItem = new JButton ("Use Item");

        while(!winner)){
            turn(playerArr[playerTurn]);

            //set next players turn
            int playerTurn = (playerTurn + 1) % 4;
        }

    }

    private void turn (Player p)
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
