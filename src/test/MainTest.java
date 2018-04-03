package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Calc;

public class MainTest {
	
	private static final double SUM_CONSTANT = 100000.100;
	private static final double PERCENT_CONSTANT = 12.5;
	private static final int MOUNTH_CONSTANT = 10;
	
	Calc calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calc(SUM_CONSTANT, PERCENT_CONSTANT, MOUNTH_CONSTANT);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(SUM_CONSTANT, calc.getSum(), 0.01);
		assertEquals(PERCENT_CONSTANT, calc.getPercent(), 0.01);
		assertEquals(MOUNTH_CONSTANT, calc.getMounth());
	}

}
