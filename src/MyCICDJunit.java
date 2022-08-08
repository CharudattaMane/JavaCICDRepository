import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCICDJunit {

	@Test
	void test() {
		MyCICDClass obj  = new MyCICDClass();
		assertEquals(10, obj.add(5, 5));
	}
	
	@Test
	void test1() {
		MyCICDClass obj  = new MyCICDClass();
		assertEquals(6, obj.add(5, 5));
	}

}
