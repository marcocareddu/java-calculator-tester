import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketTest {

	private Ticket ticket;

	@BeforeEach
	public void init() {
        ticket = new Ticket(10, 2);
    }
	
//	Testing negative/zero values
    @Test
    public void testZeroAge() throws Exception {
    	assertThrows(IllegalArgumentException.class, () -> ticket.setAge(0));
    }
    @Test
    public void testZeroKm() throws Exception {
    	assertThrows(IllegalArgumentException.class, () -> ticket.setKm(0));
    }
    @Test
    public void testNegativeAge() throws Exception {
    	assertThrows(IllegalArgumentException.class, () -> ticket.setAge(-10));
    }
    @Test
    public void testNegativeKm() throws Exception {
    	assertThrows(IllegalArgumentException.class, () -> ticket.setKm(-10));
    }
	
}
