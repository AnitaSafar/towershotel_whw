import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int numberOfBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroomToHotel(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int numberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }


}
