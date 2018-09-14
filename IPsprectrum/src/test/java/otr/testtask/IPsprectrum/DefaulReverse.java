package otr.testtask.IPsprectrum;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DefaulReverse {

	@Test
	//Ввод из условия. Аргументы в обратном порядке.
	//Постановил, что спектр всё равно выдается в возрастающем порядке
	public void test() {
		IPspectrum spec = new IPspectrum();
		
		
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("192.168.0.2");
		expectation.add("192.168.0.3");
		expectation.add("192.168.0.4");
		
		ArrayList<String> output = spec.DoTheSpectrum("192.168.0.5","192.168.0.1");
		
		assertEquals(expectation,output);
	}

}
