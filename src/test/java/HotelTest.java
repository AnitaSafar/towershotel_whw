import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Room room1;

    private Bedroom bedroom1;
    private Bedroom bedroom2;

    private Guest guest1;

    private ConferenceRoom conferenceRoom1;

    private Hotel hotel;

    @Before
    public void before() {
    bedroom1 = new Bedroom(1, 202, RoomType.SINGLE);
    bedroom2 = new Bedroom(3, 112, RoomType.TRIPLE);

    guest1 = new Guest("Wilson");

    conferenceRoom1 = new ConferenceRoom(5, "", "Interviews");

    hotel = new Hotel();
    }

    @Test
    public void hasBedrooms() {
        hotel.addBedroomToHotel(bedroom1);
        assertEquals(1, hotel.numberOfBedrooms());
    }

    @Test
    public void canAddGuestToBedroom() {
        room1 = new Bedroom(1, 202, RoomType.SINGLE);
        room1.addGuest(guest1);
        assertEquals(1, room1.guestCount());
    }
}
