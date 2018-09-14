package otr.testtask.PhoneBook;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	 Scanner scan = new Scanner(System.in);
    	 String s = scan.nextLine();
    	 scan.close();

    	 PhoneBook p = new PhoneBook();
    	 p.PrintThePhoneList(s);
    	 
    }
}
