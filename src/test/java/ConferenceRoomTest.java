import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(5, "Green", "Meeting");
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, conferenceRoom.getCapacity());
    }

}
