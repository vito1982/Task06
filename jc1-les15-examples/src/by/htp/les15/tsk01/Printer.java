package by.htp.les15.tsk01;

import java.util.List;

public class Printer {
	public static void print(List<Account> accounts) {
		String str;
		for(Account a : accounts) {
			if(a.isBlock()) {
				str = "Block";
			} else {
				str = "Active";
			}
			System.out.println("Account #: " + a.getNumber() + " \n\tSum: " + a.getSum() + " \tStatus: " + str);
			System.out.println("-------------------------------------------------");
		}
	}
	
	public static void print(Account a) {
		String str;
			if(a.isBlock()) {
				str = "Block";
			} else {
				str = "Active";
			}
			System.out.println("Account #: " + a.getNumber() + " \n\tSum: " + a.getSum() + " \tStatus: " + str);
			System.out.println("-------------------------------------------------");
	}
	
	public static void print(int sum, String str) {		
		System.out.println(str + " = " + sum);
		System.out.println("-------------------------------------------------");
	}
}
