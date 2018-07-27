package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	public void calculate(float principal,int tenure, int age, String gender)
	{
		if(validateData(principal,tenure,age,gender))
		{
		RDAccount r=new RDAccount(tenure, principal);
		r.setInterest(age, gender);
		System.out.println(r.calculateInterest());
		System.out.println(r.calculateAmountDeposited());
		System.out.println(r.calculateMaturityAmount(tenure*4*principal,r.calculateInterest()));
		}
	}
	public boolean validateData(float principal, int tenure,int age, String gender) 
	{
		try
		{
		if(principal>=500&&(tenure==5||tenure==10)&&(gender.equals("male")||gender.equals("female"))&&(age>=1&&age<=100))
		{
			return true;
		}
		else
		{
			BankValidationException o=new BankValidationException();
			System.out.println(o.toString());
			throw new Exception();
		}
		}
		catch(Exception e)
		{
			return false;
		}
		return false;
	}

}
