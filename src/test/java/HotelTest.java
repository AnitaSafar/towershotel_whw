import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    private ConferenceRoom conferenceRoom1;

    private Hotel hotel;

    @Before
    public void before() {
    bedroom1 = new Bedroom(1, 202, RoomType.SINGLE);
    bedroom2 = new Bedroom(3, 112, RoomType.TRIPLE);

    guest1 = new Guest("Wilson");
    guest2 = new Guest("Nike");
    guest3 = new Guest("Spalding");

    conferenceRoom1 = new ConferenceRoom(5, "", "Interviews");

    hotel = new Hotel();
    }

    @Test
    public void hasBedrooms() {
        hotel.addBedroomToHotel(bedroom1);
        assertEquals(1, hotel.numberOfBedrooms());
    }

    @Test
    public void hasConferenceRooms() {
        hotel.addConferenceRoomToHotel(conferenceRoom1);
        assertEquals(1, hotel.numberOfConferenceRooms());
    }

    @Test
    public void canAddGuestToBedroom() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveGuestFromBedroom() {
        bedroom2.addGuest(guest1);
        bedroom2.addGuest(guest2);
        bedroom2.addGuest(guest3);
        bedroom2.removeGuest(guest2);
        assertEquals(2, bedroom2.guestCount());
    }

    @Test
    public void canNotAddMoreGuestThanCapacity() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canAddGuestToConferenceRoom() {
        conferenceRoom1.addGuest(guest3);
        assertEquals(1, conferenceRoom1.guestCount());
    }
}
