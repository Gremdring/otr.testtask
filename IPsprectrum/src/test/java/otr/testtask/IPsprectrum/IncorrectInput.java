package otr.testtask.IPsprectrum;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class IncorrectInput {

	@Test
	//Если хотя бы один из введенных аргументов -- не IP
	public void test() {
		IPspectrum spec = new IPspectrum();
		
		
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("Неверный формат ввода. Требуется два корректных IP Адреса");

		
		ArrayList<String> output = spec.DoTheSpectrum("nonsence","nonsence");
		
		assertEquals(expectation,output);
	}

}
