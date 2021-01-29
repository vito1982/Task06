package by.htp.les15.tsk01;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client implements Serializable {
	private static final long serialVersionUID = 2469930689919005560L;
	
	private String name;
	private String sname;
	private List<Account> accounts;
	
	//-------------------------------------------------------------------------
	public Client() {
		this.accounts = new ArrayList<>();
	}
	
	public Client(String name, String sname) {
		this.name = name;
		this.sname = sname;
		this.accounts = new ArrayList<>();
	}

	public Client(String name, String sname, List<Account> accounts) {
		this(name, sname);
		this.accounts = accounts;
	}
	
	//-------------------------------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	//-------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Client [name=" + name + ", sname=" + sname + ", accounts=" + accounts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
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
		Client other = (Client) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
}
