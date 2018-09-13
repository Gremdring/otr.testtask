package otr.testtask.PhoneBook;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NoSuchNameInDB {

	@Test
	public void test() {
		PhoneBook test = new PhoneBook();
		ArrayList<String> output = test.GetTheList("Неверный левый ввод");
		
		assertEquals(output.get(0),"Нет такого ФИО в базе данных");
	}

	
	
}
