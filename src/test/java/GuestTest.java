import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Will Smith");
    }

    @Test
    public void hasName() {
        assertEquals("Will Smith", guest.getName());
    }

    @Test
    public void canSetName() {
        guest.setName("Willard Smith");
        assertEquals("Willard Smith", guest.getName());
    }

    @Test
    public void nameIsNotNull() {
        guest.setName(null);
        assertEquals("Will Smith", guest.getName());
    }
}
