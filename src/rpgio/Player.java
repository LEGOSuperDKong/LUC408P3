package rpgio;

import rpgio.Item;

public class Player {

    private int PlayerID = 0,
    ColorID,
    level,
    NumberofPieces;
    private Item [] Inventory = new Item [5];
    private boolean isAI = false;

    public Player(int id){
    	//Set PlayerID
    	PlayerID = id;
    }

    public void setAI()
    {
        isAI = true;
    }

    public boolean getAI()
    {
        return isAI;
    }

    public int getID()
    {
    	return PlayerID;
    }
}
