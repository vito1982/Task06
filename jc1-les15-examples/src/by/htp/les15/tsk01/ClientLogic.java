package by.htp.les15.tsk01;

import java.util.ArrayList;
import java.util.List;

public class ClientLogic {
	
	//-------------------------------------------------------------------------
	public List<Account> sortBySum(List<Account> accounts){
		List<Account> temp = new ArrayList<>();
		temp.addAll(accounts);
		
		for(int i = 0; i < temp.size()-1; i++) {
			for(int j = i+1; j < temp.size(); j++) {
				if(temp.get(i).getSum() > temp.get(j).getSum()) {
					swap(temp, i, j);
				} else if(temp.get(i).getSum() == temp.get(j).getSum()) {
					if(temp.get(i).getNumber() > temp.get(j).getNumber()) {
						swap(temp, i, j);
					}
				}
			}
		}

		return temp;
	}
	
	public List<Account> sortByNumber(List<Account> accounts){
		List<Account> temp = new ArrayList<>();
		temp.addAll(accounts);
		
		for(int i = 0; i < temp.size()-1; i++) {
			for(int j = i+1; j < temp.size(); j++) {
				if(temp.get(i).getNumber() > temp.get(j).getNumber()) {
					swap(temp, i, j);
				}
			}
		}
		
		return temp;
	}
	
	public List<Account> sortByStatus(List<Account> accounts){
		List<Account> tempA = new ArrayList<>();
		List<Account> tempB = new ArrayList<>();
		
		for(Account a : accounts) {
			if(!a.isBlock()) {
				tempA.add(a);
			} else {
				tempB.add(a);
			}
		}
		
		tempA = sortByNumber(tempA);
		tempB = sortByNumber(tempB);
		tempA.addAll(tempB);
		
		return tempA;
	}
	
	private void swap(List<Account> temp, int i, int j){
		Account a = temp.get(i);
		temp.set(i, temp.get(j));
		temp.set(j, a);
	}
	
	//-------------------------------------------------------------------------
	public Account findByNumber(List<Account> accounts, int number){
		Account temp = new Account();
		
		for(Account a : accounts) {
			if(a.getNumber() == number) {
				temp = a;
			}
		}
		
		return temp;
	}
	
	public List<Account> findBySumMore(List<Account> accounts, int sum){
		List<Account> temp = new ArrayList<>();
		
		for(Account a : accounts) {
			if(a.getSum() >= sum) {
				temp.add(a);
			}
		}
		
		return temp;
	}
	
	public List<Account> findBySumLess(List<Account> accounts, int sum){
		List<Account> temp = new ArrayList<>();
		
		for(Account a : accounts) {
			if(a.getSum() < sum) {
				temp.add(a);
			}
		}
		
		return temp;
	}

	//-------------------------------------------------------------------------
	public int debet(List<Account> accounts) {
		int sum = 0;
		
		for(Account a : accounts) {
			if(a.getSum() > 0 && !a.isBlock()) {
				sum += a.getSum();
			}
		}
		
		return sum;
	}
	
	public int kredit(List<Account> accounts) {
		int sum = 0;
		
		for(Account a : accounts) {
			if(a.getSum() < 0 && !a.isBlock()) {
				sum += a.getSum();
			}
		}
		
		return sum;
	}
	
	public int balans(List<Account> accounts) {
		int sum = 0;
		
		for(Account a : accounts) {
			sum += a.getSum();
		}
		
		return sum;
	}
	
}
