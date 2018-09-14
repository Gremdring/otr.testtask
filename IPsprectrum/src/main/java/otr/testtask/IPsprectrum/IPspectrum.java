package otr.testtask.IPsprectrum;

import java.util.*;
import java.util.regex.*;



public class IPspectrum {

	IPspectrum(){
		
	}
	
	Boolean ValidCheck(String ip){
		Pattern p = Pattern.compile("((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)");
		Matcher m = p.matcher(ip);	
		return m.matches();
	}
	
	void PrintTheSpectrum(String ip1, String ip2) {
		
		ArrayList<String> res = DoTheSpectrum(ip1,ip2);
		
		//TODO: вывод на экран результата
		
	}

	ArrayList<String> DoTheSpectrum(String ip0, String ip1) {
		
		ArrayList<String> res = new ArrayList<String>(0);
		int[] dig0 = new int[4];
		int[] dig1 = new int[4];
		long IPSumm0,IPSumm1;
		
		
		if (ValidCheck(ip0) && ValidCheck(ip1)) {
			//Изъяли цифры
			dig0 = DigTheDigits(ip0);
			dig1 = DigTheDigits(ip1);
			
			//выбрали большее меньшее
			IPSumm0 = dig0[0]*(int)Math.pow(256,3)
						+dig0[1]*(int)Math.pow(256,2)+
						 +dig0[2]*(int)Math.pow(256,1)
						  +dig0[3];
			IPSumm1 = dig1[0]*(int)Math.pow(256,3)
						+dig1[1]*(int)Math.pow(256,2)+
						 +dig1[2]*(int)Math.pow(256,1)
						  +dig1[3];
			
			if(IPSumm0 == IPSumm1)
				return res;
			
			int[] big  = IPSumm1 > IPSumm0 ? dig1 : dig0;
			int[] small = IPSumm1 > IPSumm0 ? dig0 : dig1;

			res = SpectrumCycle(small,big);				
			return res;
			
					
		} else {
			res.add("Неверный формат ввода. Требуется два корректных IP Адреса");
			return res;
		}
	}
	
	//выводит спектр, для IP, где левый аргумент строго "меньше" правого
	private ArrayList<String> SpectrumCycle(int[] small,int[] big){
		
		ArrayList<String> res = new ArrayList<String>(0);
		int a,b,c,d;
		
		//начальные установки
		a = small[0]; 
		b = small[1]; 
		c = small[2]; 
		d = small[3];
		
		for(; a<=big[0]; a++) {
			for(;b<=255;b++) {			
				for(;c<=255;c++){	
					for(;d<=255;d++) {
						//Если дошли до большего IP --возвращаем результат
						if( a==big[0] && b==big[1] && c==big[2] && d==big[3] ) {					
							res.remove(0); //удалить первую строку резульата -- т.к. она равна ip0
							return res;
						}
						
						//иначе добавим текущий IP в вывод
						res.add(a+"."+b+"."+c+"."+d);
					}
					d = 0;
				}
				c = 0;
			}
			b=0;		
		}
		
		throw new IllegalStateException ("Вышли из цикла но не дошли до большего ip. Что-то не то");
	}
	
	
	//Выстаскивает части IP адреса из строки, которая точно в формате IPv4
	private int[] DigTheDigits(String ip) {
		
		int[] res = new int[4];
		
		Scanner scan = new Scanner(ip.replace(".", " "));

		
		int i = 0;
		while(scan.hasNextInt() && i<4) {
			res[i] = scan.nextInt();
			i++;
		}
		

		scan.close();
		return res;
	} 
	
	
}
