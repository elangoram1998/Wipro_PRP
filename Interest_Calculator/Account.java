package com.wipro.bank.acc;

public abstract class Account {
	int tenure;
	float principal;
	float rateOfInterest;

	public void setInterest(int age, String gender)
	{
		if(gender.equals("male")&&age<60)
		{
			rateOfInterest=(float) 9.8;
		}
		else if(gender.equals("male")&&age>=60)
		{
			rateOfInterest=(float)10.5;
		}
		else if(gender.equals("female")&&age<58)
		{
			rateOfInterest=(float)10.2;
		}
		else if(gender.equals("female")&&age>=58)
		{
			rateOfInterest=(float)10.8;
		}
	}
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
	{
		return totalPrincipleDeposited+maturityInterest;
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();

	


}
