import static org.junit.Assert.*;

import org.junit.Test;


public class SquareTest {

	@Test
	public void should_calculate_area() {
		Square square = new Square(10);
		
		int area = square.area();
		
		assertEquals(100, area);
	}

	@Test
	public void should_calculate_perimeter() {
		Square square = new Square(10);
		
		int perimeter = square.perimeter();
		
		assertEquals(40, perimeter);
	}
}
