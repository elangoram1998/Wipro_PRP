package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberofNullMarks(Student data[])
	{
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i].getMarks()==null)
			{
				count++;
			}
		}
		return count;
	}
	public int findNumberofNullNames(Student data[])
	{
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i].getName()==null)
			{
				count++;
			}
		}
		return count;
	}
	public int findNumberofNullObjects(Student data[])
	{
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==null)
			{
				count++;
			}
		}
		return count;
	}

}
