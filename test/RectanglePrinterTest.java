import static org.junit.Assert.*;

import org.junit.Test;


public class RectanglePrinterTest {

	@Test
	public void should_print_a_rectangle() {
		Rectangle r = new Rectangle(5,3);
		RectanglePrinter printer = new RectanglePrinter(r);
		
		String draw = printer.draw();
		
		String expectedDraw = "*****\n"+
							  "*   *\n"+
							  "*****\n";
		assertEquals(expectedDraw, draw);
	}

	@Test
	public void should_print_a_small_rectangle() {
		Rectangle r = new Rectangle(1,1);
		RectanglePrinter printer = new RectanglePrinter(r);
		
		String draw = printer.draw();
		
		String expectedDraw = "*\n";
		assertEquals(expectedDraw, draw);
	}
	
}
