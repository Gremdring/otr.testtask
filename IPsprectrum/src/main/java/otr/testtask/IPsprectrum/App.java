package otr.testtask.IPsprectrum;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	IPspectrum IPspec = new IPspectrum();
    	Scanner scan = new Scanner(System.in);
    	String ip1 = scan.nextLine();
    	String ip2 = scan.nextLine();
    	scan.close();
    	
    	IPspec.PrintTheSpectrum(ip1, ip2);

    }
}
