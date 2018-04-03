package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Calc;

public class ExceptionTest {

	private static final double SUM_CONSTANT = 2000.31;
	private static final double PERCENT_CONSTANT = 11.7;
	private static final int MOUNTH_CONSTANT = 0;
	
	Calc calc;
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZero() {
		calc = new Calc(SUM_CONSTANT, PERCENT_CONSTANT, MOUNTH_CONSTANT);
	}

}
