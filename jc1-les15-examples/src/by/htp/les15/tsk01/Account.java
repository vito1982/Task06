package by.htp.les15.tsk01;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = -6535528681624322498L;
	
	private int number;
	private int sum;
	private boolean block;
	
	//-------------------------------------------------------------------------
	public Account() {}
	
	public Account(int number, int sum) {
		this.number = number;
		this.sum = sum;
		this.block = false;
	}

	public Account(int number, int sum, boolean block) {
		this(number, sum);
		this.block = block;
	}

	//-------------------------------------------------------------------------
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

	public boolean isBlock() {
		return block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}

	//-------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Account [number=" + number + ", sum=" + sum + ", block=" + block + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (block ? 1231 : 1237);
		result = prime * result + number;
		result = prime * result + sum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (block != other.block)
			return false;
		if (number != other.number)
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}
	
}
