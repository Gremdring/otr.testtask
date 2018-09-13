/**
 * 
 */
package otr.testtask.PhoneBook;

import java.util.*;

public class PhoneBook {
	
	private HashMap<String,ArrayList<String>> pBook = new HashMap<String,ArrayList<String>>(3,3);
	
	PhoneBook(){
		//TODO: заполнение HashMap значениями из задания
	}
	

	ArrayList<String> GetTheList(String inp){
		if (false) {
			//TODO: поиск по HashMap и выдача нужного массива
			return new ArrayList<String>(0);
		}
		else {
			return ThereIsNoSuchMan();
		}
	}
	
	void PrintThePhoneList(String inp) {
		ArrayList<String> res = GetTheList(inp);
		//TODO: вывод на экран результата
		
	}
	
	
	private ArrayList<String> ThereIsNoSuchMan(){
		ArrayList<String> warning = new ArrayList<String>(1);
		warning.add("Нет такого ФИО в базе данных");
		return warning;
	}
		
	
}
