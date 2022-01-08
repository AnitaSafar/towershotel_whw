public class ConferenceRoom extends Room {

    private String name;
    private String event;

    public ConferenceRoom(int capacity, String name, String event) {
        super(capacity);
        this.name = name;
        this.event = event;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        }

    public String getEvent() {
        return this.event;
    }
}
}
