package otr.testtask.IPsprectrum;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class LongIntOverflow {

	@Test
	public void test() {
		IPspectrum spec = new IPspectrum();
		
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("255.255.255.254");
		
		ArrayList<String> output = spec.DoTheSpectrum("255.255.255.253", "255.255.255.255");
		
		assertEquals(expectation,output);
	}

}
