package com.mile2.grandchild;

import java.util.Scanner;

public class Grand_Children {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[][] array= {{"luke","shaw"},{"wanye","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		String s="";
		String str=sc.nextLine();
		for(int i=0;i<array.length;i++)
		{
			if(array[i][1].equals(str))
			{
				s=array[i][0];
			}
		}
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i][1]==s)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
