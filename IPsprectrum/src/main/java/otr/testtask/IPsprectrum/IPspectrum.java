package otr.testtask.IPsprectrum;

import java.util.*;

public class IPspectrum {

	IPspectrum(){
		
	}
	
	Boolean ValidCheck(String ip){
		//TODO:проверка формата строки
		return true;
	}
	

	ArrayList<String> DoTheSpectrum(String ip1, String ip2) {
		ArrayList<String> res = new ArrayList<String>(1);
		
		if (ValidCheck(ip1) && ValidCheck(ip2)) {
			//TODO: вывод спектра по данном вводу. 
			return res;
		} else {
			res.add("неверный формат ввода");
			return res;
		}
	}
	
	void PrintTheSpectrum(String ip1, String ip2) {
		ArrayList<String> res = DoTheSpectrum(ip1,ip2);
		//TODO: вывод на экран результата
		
	}
}
