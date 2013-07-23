import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateMidnight;
import org.junit.Test;


public class ProgramTest {

//	@Test
	public void testProgram() {
		Program bookingParserProgram = new Program();
		boolean result = bookingParserProgram.showUI();
		assertTrue("The UI didn't showed correctly.", result);
	}
	
	@Test
	public void testInDate()
	{
		DateMidnight in;
		Program bookingParserProgram = new Program();
		in = bookingParserProgram.getInDate();
		assertEquals(null, in);
		bookingParserProgram.setInDate(new DateMidnight(2013, 12, 22));
		in = bookingParserProgram.getInDate();
		assertEquals(2013, in.getYear());
		assertEquals(12, in.getMonthOfYear());
		assertEquals(22, in.getDayOfMonth());
	}

	@Test
	public void testOutDate()
	{
		DateMidnight out;
		Program bookingParserProgram = new Program();
		out = bookingParserProgram.getOutDate();
		assertEquals(null, out);
		bookingParserProgram.setOutDate(new DateMidnight(2013, 12, 22));
		out = bookingParserProgram.getOutDate();
		assertEquals(2013, out.getYear());
		assertEquals(12, out.getMonthOfYear());
		assertEquals(22, out.getDayOfMonth());
	}
	
	@Test
	public void testAdults()
	{
		Program bookingParserProgram = new Program();
		int adults = bookingParserProgram.getAdults();
		assertEquals(0, adults);
		bookingParserProgram.setAdults(2);
		adults = bookingParserProgram.getAdults();
		assertEquals(2, adults);
	}
	
	@Test
	public void testChildrens()
	{
		Program bookingParserProgram = new Program();
		int childrens = bookingParserProgram.getChildrens();
		assertEquals(0, childrens);
		bookingParserProgram.setChildrens(3);
		childrens = bookingParserProgram.getChildrens();
		assertEquals(3, childrens);
	}
	
	
}

