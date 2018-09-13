package otr.testtask.PhoneBook;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Sidorov {

	@Test
	public void test() {
		
		PhoneBook test = new PhoneBook();
		ArrayList<String> output = test.GetTheList("Сидоров С.С.");
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("1. +8 800 2000 800");
		expectation.add("2. +8 800 2000 900");
		expectation.add("3. +8 800 2000 000");
		assertEquals(output,expectation);
		
		
	}

	  
}
