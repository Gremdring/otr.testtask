package otr.testtask.IPsprectrum;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EqualIPs {

	@Test
	//В случае 2-х одинаковых корректных IP программа должна выдать ничего. 
	//А вернее пустой ArrayList<String> 
	public void test() {

		IPspectrum spec = new IPspectrum();
		
		
		ArrayList<String> expectation = new ArrayList<String>(0);
		
		ArrayList<String> output = spec.DoTheSpectrum("192.168.0.2","192.168.0.2");
		
		assertEquals(expectation,output);
		
	}

}
