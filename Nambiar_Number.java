import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int nnGenerator(String input1){
		// Read only region end
        	String s=checkString(input1);
		return Integer.parseInt(s);
	}
	static String checkString(String str)
	{
		int i=0,j=str.length();
		String s="";
		int sum=0;
		while(i<j)
		{
			int k=i;
			i=i+checkNum(str.substring(i,j));
			for(int l=k;l<i;l++)
			{
				sum=sum+str.charAt(l)-'0';
			}
			s=s+sum;
			sum=0;
		}
		return s;
	}
	static int checkNum(String str)
	{
		int sum=str.charAt(0)-'0';
		int count=0;
		if(sum%2==0)
		{
			for(int i=1;i<str.length();i++)
			{
				sum=sum+str.charAt(i)-'0';
				count++;
				if(sum%2!=0)
				{
					break;
				}
			}
		}
		else
		{
			for(int i=1;i<str.length();i++)
			{
				sum=sum+str.charAt(i)-'0';
				count++;
				if(sum%2==0)
				{
					break;
				}
			}
		}
		return count+1;
	}
}
