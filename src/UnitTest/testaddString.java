package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddString {

	@Test
	void test() {
		JUnitFunction jstr= new JUnitFunction();
        String result= jstr.addstring("abc", "cda");
        assertEquals("abccda", result);
	}

}
