package by.htp.les15.tsk01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		
		accounts.add(new Account(50,10000, true));
		accounts.add(new Account(20,20000));
		accounts.add(new Account(10,-30000, true));
		accounts.add(new Account(40,40000));
		accounts.add(new Account(30, -50000));
		accounts.add(new Account(80, 10000));
		accounts.add(new Account(60, 20000, true));
		accounts.add(new Account(90, -10000));
		accounts.add(new Account(70, 10000));
	
		Client client = new Client("Ivan", "Petrov", accounts);
		
		ClientLogic logic = new ClientLogic();
		
		List<Account> tempAcc = client.getAccounts();
		
		Printer.print(logic.sortBySum(tempAcc));
		
		//Printer.print(logic.sortByNumber(tempAcc));
		
		//Printer.print(logic.sortByStatus(tempAcc));
		
		//Printer.print(logic.findByNumber(tempAcc, 30));
		
		//Printer.print(logic.findBySumMore(tempAcc, 20000));
		
		//Printer.print(logic.findBySumLess(tempAcc, 20000));
		
		//Printer.print(logic.debet(tempAcc), "Дебет");
		
		//Printer.print(logic.kredit(tempAcc), "Кредит");
		
		//Printer.print(logic.balans(tempAcc), "Балланс");
		
	}

}
