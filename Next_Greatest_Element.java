package com.mile2.greatest;

import java.util.Arrays;
import java.util.Scanner;

public class Greatest_Element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T!=0)
		{
			int n=sc.nextInt();
			int[] array=new int[n];
			int[] temp=new int[n];
			String[] res=new String[n];
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
				temp[i]=array[i];
			}
			Arrays.sort(temp);
			for(int i=0;i<n;i++)
			{
				int count=0;
				for(int j=0;j<n;j++)
				{
					if(temp[j]>array[i])
					{
						String s="";
						s=s+temp[j];
						res[i]=s;
						break;
					}
					else
					{
						count++;
					}
				}
				if(count==n)
				{
					String s="_";
					res[i]=s;
				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(res[i]+" ");
			}
			T--;
		}

	}

}
