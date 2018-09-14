package otr.testtask.PhoneBook;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Ivanov {

	@Test
	public void test() {
		
		PhoneBook test = new PhoneBook();
		ArrayList<String> output = test.GetTheList("Иванов И.И.");
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("1. +8 800 2000 500");
		expectation.add("2. +8 800 200 600");
		
		assertEquals(expectation, output);
		
		
	}

}
