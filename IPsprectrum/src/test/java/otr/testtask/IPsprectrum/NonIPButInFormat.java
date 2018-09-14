package otr.testtask.IPsprectrum;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NonIPButInFormat {

	@Test
	//Проверка на форматный ввод х.х.х.х, где какое либо из чисел >255
	public void test() {
		IPspectrum spec = new IPspectrum();
		
		
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("Неверный формат ввода. Требуется два корректных IP Адреса");

		
		ArrayList<String> output = spec.DoTheSpectrum("192.168.0.254","192.168.0.256");
		
		assertEquals(expectation,output);
	}

}
