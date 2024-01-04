package basicUnittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UnitTestCalculator {

	@Disabled
	void testadd() {
		Calculator c1 = new Calculator();
		c1.setvalue(4, 3);
		c1.add();
		assertEquals(7, c1.showResute());
		c1.setvalue(6, 75);
		c1.add();
		assertEquals(81, c1.showResute());
	}
	@Test
	void testMutiply() {
		Calculator c1 = new Calculator();
		c1.setvalue(4, 3);
		c1.multiply();
		assertEquals(12, c1.showResute());
		c1.setvalue(4, 5);
		c1.multiply();
		assertEquals(20, c1.showResute());
	}

}
