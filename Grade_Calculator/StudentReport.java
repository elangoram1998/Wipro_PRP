package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {
	public static String findGrade(Student studentObject)
	{
		int[] array=studentObject.getMarks();
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<35)
			{
			return "F";
			}
			sum=sum+array[i];
		}
		if(sum<=150)
		{
			return "D";
		}
		else if(sum>150&&sum<=200)
		{
			return "C";
		}
		else if(sum>200&&sum<=250)
		{
			return "B";
		}
		else if(sum>250&&sum<=300)
		{
			return "A";
		}
		return null;
	}
	public String validate(Student studentObject)throws NullStudentException,NullNameException,NullMarksArrayException
	{
		
		if(studentObject==null)
		{
			throw new NullStudentException();
		}
		else
		{
			if(studentObject.getName()==null)
			{
				throw new NullNameException();
			}
			else if(studentObject.getMarks()==null)
			{
				throw new NullMarksArrayException();
			}

		}
		return findGrade(studentObject);
	}

}
