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

    @Test
    public void hasName() {
        assertEquals("Green", conferenceRoom.getName());
    }

    @Test
    public void canSetName() {
        conferenceRoom.setName("Hulk");
        assertEquals("Hulk", conferenceRoom.getName());
    }

    @Test
    public void hasEvent() {
        assertEquals("Meeting", conferenceRoom.getEvent());
    }

    @Test
    public void canSetEvent() {
        conferenceRoom.setEvent("Wedding");
        assertEquals("Wedding", conferenceRoom.getEvent());
    }
}
