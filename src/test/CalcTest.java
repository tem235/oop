package test;

import  org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.Calc;

public class CalcTest {
	
	private static final double SUM_CONSTANT = 2000.31;
	private static final double PERCENT_CONSTANT = 11.7;
	private static final int MOUNTH_CONSTANT = 18;
	
	Calc calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calc(SUM_CONSTANT, PERCENT_CONSTANT, MOUNTH_CONSTANT);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTotalPercent() {
		assertEquals(234.03626999999997, calc.getPercentSum(), 0.1);
	}
	
	@Test
	public void testTotalSum() {
		assertEquals(2234.34627, calc.getTotalSum(), 0.1);
	}
	
	@Test
	public void testMounthPaid() {
		assertEquals(124.13034833333333, calc.getMounthPaid(), 0.1);
	}
}
