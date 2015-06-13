/**
 * 
 */
package aufgabenblatt5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author cyrildz
 *
 */
public class VerschluesselungTest {

	/**
	 * Test Method fuer {@link aufgabenblatt5.Verschluesselung#verschluesseln(java.lang.String)}.
	 */
	@Test
	public void testVerschluesseln() {
		Verschluesselung verschlusselung = new Verschluesselung();
		/***
		 * Test 1 
		 */
		assertEquals("TLMPMTT",verschlusselung.verschluesseln("PHILIPP"));
		
		/***
		 * Test 2
		 */
		assertEquals("D",verschlusselung.verschluesseln("Z"));
		
		/***
		 * Test 3 
		 */
		assertEquals("TLMPMBAD",verschlusselung.verschluesseln("PHILIXWz"));
	}

	/**
	 * Test Method fuer {@link aufgabenblatt5.Verschluesselung#entschluesseln(java.lang.String)}.
	 */
	@Test
	public void testEntschluesseln() {
		Verschluesselung verschlusselung = new Verschluesselung();
		
		/***
		 * Test 1 
		 */
		assertEquals("PHILIPP",verschlusselung.entschluesseln("TLMPMTT"));
		
		/***
		 * Test 2
		 */
		assertEquals("Z",verschlusselung.entschluesseln("D"));
		
		/***
		 * Test 3 
		 */
		assertEquals("PHILIXWZ",verschlusselung.entschluesseln("TLMPMBAD"));
	}
}
