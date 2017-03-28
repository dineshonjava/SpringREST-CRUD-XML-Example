/**
 * 
 */
package com.doj.restapi.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dinesh.Rajput
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)	
@Entity
@Table
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute
	@Id
	@GeneratedValue
	public Long accountId;
	
	@XmlElement
	public String name;
	
	@XmlElement
	public String city;
	
	@XmlElement
	public Double balance;
	
	public Account() {
		super();
	}
	public Account(String name, String city, Double balance) {
		super();
		this.name = name;
		this.city = city;
		this.balance = balance;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", city=" + city + ", balance=" + balance + "]";
	}
	
}
