/**
 * 
 */
package otr.testtask.PhoneBook;

import java.util.*;

import javax.xml.stream.events.StartDocument;

public class PhoneBook {
	
	private HashMap<String,ArrayList<String>> pBook = new HashMap<String,ArrayList<String>>(3,3);
	
	PhoneBook(){
		
		ArrayList<String> Ivanov = new  ArrayList<String>(0);
		Ivanov.add("+8 800 2000 500");
		Ivanov.add("+8 800 200 600");
		pBook.put("Иванов И.И.", Ivanov);
		
		//можно для заполнения карты использовать одну переменную ArrayList
		//Но так наглядней. И в данной задаче память - не проблема.
		
		ArrayList<String> Petrov = new  ArrayList<String>(0);
		Petrov.add("+8 800 2000 700");
		pBook.put("Петров П.П.", Petrov);
		
		
		ArrayList<String> Sidorov = new  ArrayList<String>(0);
		Sidorov.add("+8 800 2000 800");
		Sidorov.add("+8 800 2000 900");
		Sidorov.add("+8 800 2000 000");
		pBook.put("Сидоров С.С.", Sidorov);	
		
	}
	

	ArrayList<String> GetTheList(String inp){
		if (pBook.containsKey(inp)) {
			ArrayList<String> pList =  pBook.get(inp);
			ArrayList<String> res 	=  new ArrayList<String>(0);
			
			for(int i = 0 ; i < pList.size(); i++) {
				res.add( (i+1) +". " + pList.get(i)); 
			}
			
			return res;
		}
	
		else {
			return ThereIsNoSuchMan();
		}
	}
	
	void PrintThePhoneList(String inp) {
		ArrayList<String> res = GetTheList(inp);
		Iterator<String> iter = res.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next()); 
		}
		
	}
	
	
	private ArrayList<String> ThereIsNoSuchMan(){
		ArrayList<String> warning = new ArrayList<String>(0);
		warning.add("Нет такого ФИО в базе данных");
		return warning;
	}
		
	
}
