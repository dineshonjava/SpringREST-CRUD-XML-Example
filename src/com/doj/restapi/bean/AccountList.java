/**
 * 
 */
package com.doj.restapi.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dinesh.Rajput
 *
 */
@XmlRootElement (name="accounts")
public class AccountList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Account> listOfAccounts;

	public List<Account> getListOfAccounts() {
		return listOfAccounts;
	}
	@XmlElement(name = "account")
	public void setListOfAccounts(List<Account> listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}
	
}
