public class ConferenceRoom extends Room {

    private String name;
    private String event;

    public ConferenceRoom(int capacity, String name, String event) {
        super(capacity);
        this.name = name;
        this.event = event;
    }

    
}
