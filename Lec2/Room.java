/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

//change these directions to hashmaps to allow for more directions
//Key: string of direction
//Value: Room
public class Room 
{
    private HashMap<String, Room> exits;
    public String description;
    public final String NORTH = "north";
    public final String EAST = "east";
    public final String SOUTH = "south";
    public final String WEST = "west";
    public final String UP = "up";

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {

        this.description = description;
        exits = new HashMap<>(); //initialize hashmap
    }

    public Room getExits(String direction){
        return exit.get(direction);//might have to add something to account for null
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(String direction, Room room) 
    {
      exits.put(direction, room);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    private void getLongDescription(){
      System.out.println("You are " + this.getDescription());
      System.out.print("Exits: ");
      for (String key: exits.key|Set()){
        System.out.print(key + " ");
      }
      System.out.println();
  }

}
