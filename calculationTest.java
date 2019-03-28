package stdproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calculationTest {

	@Test
	void test() {
		
		Calculator cal = new Calculator();
		int result = cal.add(10,10);
		assertEquals(20,result);
		
	}

	
		


}
