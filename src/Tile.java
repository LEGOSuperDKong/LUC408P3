

public class Tile {

    //Create variables
    private boolean chest,
            int defense,
            int moveCost,
            boolean highlight,
            int locationID,
            int adjacentUp,
            int adjacentDown,
            int adjacentLeft,
            int adjacentRight;

    //constructor
    public Tile(){

    }


    //get methods

    public boolean getChest(){
        return chest;
    }

    public int getDefense(){
        return defense;
    }

    public int getMoveCost(){
        return moveCost;
    }

    public boolean getHighlight(){
        return highlight;
    }

    public int getLocationID(){
        return locationID;
    }

    public int getAdjacentUp(){
        return adjacentUp;
    }

    public int getAdjacentDown(){
        return adjacentDown;
    }

    public int getAdjacentLeft()){
        return adjacentLeft;
    }

    public int getAdjacentRight(){
        return adjacentRight;
    }

}
