import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateMidnight;
import org.junit.Test;


public class ProgramTest {

	@Test
	public void testProgram() {
		Program bookingParserProgram = new Program();
		boolean result = bookingParserProgram.showUI();
		assertTrue("The UI didn't showed correctly.", result);
	}
	
	public void testInDate()
	{
		DateMidnight in;
		Program bookingParserProgram = new Program();
		in = bookingParserProgram.getInDate();
		assertEquals(null, in);
		bookingParserProgram.setInDate(new DateMidnight(2013, 12, 22));
		assertEquals(2013, in.getYear());
		assertEquals(12, in.getMonthOfYear());
		assertEquals(22, in.getDayOfMonth());
	}

}
