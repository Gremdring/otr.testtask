package otr.testtask.IPsprectrum;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CSpectrum {

	@Test
	public void test() {
		IPspectrum spec = new IPspectrum();
		
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("192.168.255.255");
		expectation.add("192.169.0.0");
		expectation.add("192.169.0.1");
		expectation.add("192.169.0.2");
		
		ArrayList<String> output = spec.DoTheSpectrum("192.168.255.254", "192.169.0.3");
		
		assertEquals(expectation,output);
	}

}
