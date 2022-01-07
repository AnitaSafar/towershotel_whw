import java.util.ArrayList;

public abstract class Room {

    int capacity;
    ArrayList<Guest> collection;

    public Room(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<Guest>();
    }

}