package rpgio;

import Item.java;

public class Player {
    
    private int PlayerID,
    ColorID,
    level,
    NumberofPieces;
    private Item Inventory[] = new Item();
    private boolean isAI = false;

    private void setAI()
    {
        isAI = true;
    }

    private boolean getAI()
    {
        return isAI;
    }
    
}
