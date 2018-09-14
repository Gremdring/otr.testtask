package otr.testtask.PhoneBook;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Petrov {

	@Test
	public void test() {
		
		PhoneBook test = new PhoneBook();
		ArrayList<String> output = test.GetTheList("Петров П.П.");
		ArrayList<String> expectation = new ArrayList<String>(0);
		expectation.add("1. +8 800 2000 700");
		
		assertEquals(expectation, output);
		
		
	}

}
