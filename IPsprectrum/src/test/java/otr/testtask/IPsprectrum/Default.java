package otr.testtask.IPsprectrum;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Default {

	@Test
	//Ввод из условия
	public void test() {
		IPspectrum spec = new IPspectrum();
		
		
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("192.168.0.2");
		expectation.add("192.168.0.3");
		expectation.add("192.168.0.4");
		
		ArrayList<String> output = spec.DoTheSpectrum("192.168.0.1", "192.168.0.5");
		
		assertEquals(expectation,output);
	}

}
