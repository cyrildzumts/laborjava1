package aufgabenblatt5;

import static org.junit.Assert.*;

import org.junit.Test;

public class VokaleZaehlenTest {

	@Test
	public void testVokaleAnzahl() {
		VokaleZaehlen vokaleZaehlen = new VokaleZaehlen();

		/***
		 * Test 1
		 */
		vokaleZaehlen
				.zaehlVokale("One ring to rule them all, One ring to find them.");
		assertEquals(12, vokaleZaehlen.kleinVokaleAnzahl());
		assertEquals(2, vokaleZaehlen.grossVokaleAnzahl());

		/***
		 * Test 2
		 */
		vokaleZaehlen.zaehlVokale("aeiouAEIOU");
		assertEquals(5, vokaleZaehlen.kleinVokaleAnzahl());
		assertEquals(5, vokaleZaehlen.grossVokaleAnzahl());

		/***
		 * Test 3
		 */
		vokaleZaehlen.zaehlVokale("");
		assertEquals(0, vokaleZaehlen.kleinVokaleAnzahl());
		assertEquals(0, vokaleZaehlen.grossVokaleAnzahl());
	}

}
