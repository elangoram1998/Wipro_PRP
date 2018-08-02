package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.*;

public class StudentMain {

	static Student data[]=new Student[4];
	static
	{
		System.out.println("jgjwj");
		
		int[] array= {35,35,35};
		data[0]=new Student("sekar",array);
		data[1]=new Student(null,new int[] {11,22,33});
		data[2]=null;
		data[3]=new Student("manoj",null);
		
	}
	public static void main(String[] args) throws NullStudentException, NullMarksArrayException {
		StudentService studentservice=new StudentService();
		StudentReport studentreport=new StudentReport();
		System.out.println("Grade Calculation:");
		String x="";
		for(int i=0;i<data.length;i++)
		{
			try
			{
				x=studentreport.validate(data[i]);
			}
			catch(NullNameException e)
			{
				NullNameException o=new NullNameException();
				x=o.toString();
			}
			catch(NullStudentException e)
			{
				NullStudentException o=new NullStudentException();
				x=o.toString();
			}
			catch(NullMarksArrayException e)
			{
				NullMarksArrayException o=new NullMarksArrayException();
				x=o.toString();
			}
			System.out.println(x);
		}
		System.out.println(studentservice.findNumberofNullMarks(data));
		System.out.println(studentservice.findNumberofNullNames(data));
		System.out.println(studentservice.findNumberofNullObjects(data));

	}

}
