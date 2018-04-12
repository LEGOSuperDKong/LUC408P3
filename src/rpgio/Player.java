package rpgio;

import rpgio.Item;

public class Player {

    private int PlayerID,
    ColorID,
    level,
    NumberofPieces;
    private Item [] Inventory = new Item [5];
    private boolean isAI = false;

    public void setAI()
    {
        isAI = true;
    }

    public boolean getAI()
    {
        return isAI;
    }

}
