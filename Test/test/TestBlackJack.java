package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import blackJack.Card;
import blackJack.Deck;

public class TestBlackJack {
	
	

	@Test
	public void test_deck() {
		List<Card> deck = new ArrayList<>(52);
		Deck d = new Deck();
//		d.createDeck();
//		assertEquals(d.getDeck().size(), 52);
//		assertEquals((int)d.getDeck().get(0).getValue(), 8);
//		assertNotNull(d.getDeck());
	
	}

}
