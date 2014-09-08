import static org.junit.Assert.*;

import org.junit.Test;


public class A2Tester {

	@Test
	public void testInitials() {
		
		String name = "    David Joseph Gries";
		
		String name1 = "Doug James";
		
		assertEquals(A2.getInitials(name), "DJG");
		assertEquals(A2.getInitials(name1), "DJ");
	}
	
	@Test
	public void testReplaceVowels() {
		
		String s = "Minecraft";
		String s1 = "Alan Turing";
		
		assertEquals(A2.replaceAllVowels(s), "M*n*cr*ft");
		assertEquals(A2.replaceAllVowels(s1), "*l*n T*r*ng");
		
	}

	@Test
	public void testDecompress() {
		
		String s = "b3c1b5x2a0";
		
		assertEquals(A2.decompress(s), "bbbcbbbbbxx");
		
	}

}
