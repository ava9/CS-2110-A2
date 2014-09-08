import static org.junit.Assert.*;

import org.junit.Test;


public class A2Tester2 {

	@Test
	
	public void testContainsOne() {
		/** 
	     * Strings s and s1 are not null. Return true iff s contains exactly one occurrence
	     *  of s2.
	     * 
	     *  Examples: For s = "ab" and s2 = "bb", return false
	     *            For s = "abbb" and s2 = "bbb", return true.
	     *            For s = "abbbb" and s2 = "bb", return false. 
	     */
		String s = "ab";
		String s2 = "bb";
		assertEquals(false, A2.containsOne(s, s2));
		
		s = "abbb";
		s2 = "bbb";
		assertEquals(true, A2.containsOne(s, s2));
		
		s = "abbbb";
		s2 = "bb";
		assertEquals(false, A2.containsOne(s, s2));
		
		s = "abbbb";
		s2 = "c";
		assertEquals(false, A2.containsOne(s, s2));
		
	}

	@Test
	public void testFixName() {
		  /** 
	     * String s consists of a first name followed by a last name. The two names are
	     * separated by 1 or more blanks. There may be blank characters at the
	     * beginning of s and at the end of s. 
	     * 
	     * Examples: For s = "    David Gries"  return "Gries, David"
	     *           For s = "Doug       James " return "James, Doug" 
	     */
		String s = "    David Gries";
		assertEquals("Gries, David", A2.fixName(s));
		
		s = "Doug       James ";
		assertEquals("James, Doug", A2.fixName(s));
	}

	//@Test
	public void testGetInitials() {
		fail("Not yet implemented");
	}

	@Test
	public void testReplaceVowels() {
	    /** 
	     * Return a string that is s but with all lowercase vowels (a, e, i, o, u)
	     * replaced by asterisks *.  
	     * 
	     * Examples: For s = "Minecraft" return "M*n*cr*ft".
	     *           For s = "Alan Turing" return "Al*n T*r*ng".
	     */
		String s = "Minecraft";
		assertEquals("M*n*cr*ft", A2.replaceVowels(s));
		
		s = "Alan Turing" ;
		assertEquals("Al*n T*r*ng", A2.replaceVowels(s));
	}

	//@Test
	public void testReplaceAllVowels() {
		fail("Not yet implemented");
	}

	//@Test
	public void testDecompress() {
		fail("Not yet implemented");
	}

}
