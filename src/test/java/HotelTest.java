import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;

    private ConferenceRoom conferenceroom1;

    private Hotel hotel;

    @Before
    public void before() {
    bedroom1 = new Bedroom(1, 202, RoomType.SINGLE);
    bedroom2 = new Bedroom(3, 112, RoomType.TRIPLE);

    conferenceroom1 = new ConferenceRoom(5, "", "Interviews");

    hotel = new Hotel();
    }

    @Test
    public void hasBedrooms() {
        assertEquals(0, hotel.numberOfBedrooms());
    }
}
