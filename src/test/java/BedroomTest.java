import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest1;
    Bedroom bedroom;

    @Before
    public void before() {

        guest1 = new Guest("Tom Hanks");
        bedroom = new Bedroom(2,416, RoomType.DOUBLE);
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

}
