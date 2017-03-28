/**
 * 
 */
package com.doj.restapi.service;

import com.doj.restapi.bean.Account;
import com.doj.restapi.bean.AccountList;

/**
 * @author Dinesh.Rajput
 *
 */
public interface IAccountService {
	
	Account create(Account account);
	Account get(Long accountId);
	AccountList list();
	Account update(Account account);
	void delete(Long accountId);
}
