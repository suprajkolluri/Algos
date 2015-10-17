package edu.asu.misc.test;

import org.junit.Test;

import edu.asu.misc.TowerofHanoi;

public class TowerofHanoiTest {
	@Test
	public void tohTest() {
		TowerofHanoi toh = new TowerofHanoi();
		toh.move(4, 1, 2, 3);
	}

}
