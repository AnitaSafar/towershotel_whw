import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Bedroom bedroom;

    @Before
    public void before() {

        guest1 = new Guest("Tom Hanks");
        guest2 = new Guest("Chuck Noland");
        guest3 = new Guest("Wilson");
        bedroom = new Bedroom(2,416, RoomType.DOUBLE);
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(416, bedroom.getRoomNumber());
    }

    @Test
    public void canSetRoomNumber() {
        bedroom.setRoomNumber(316);
        assertEquals(316, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canSetRoomType() {
        bedroom.setRoomType(RoomType.FAMILY);
        assertEquals(RoomType.FAMILY, bedroom.getRoomType());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }


    @Test
    public void noMoreGuestsThanCapacity() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.guestCount());
    }
}
