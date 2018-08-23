import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public String moveRobot(int input1,int input2,String input3,String input4){
		// Read only region end
		int x=input3.charAt(0)-'0';
		int y=input3.charAt(2)-'0';
		char dir=input3.charAt(4);
		String[] array=input4.split(" ");
		String direction="";
		String s="";
		for(int i=0;i<array.length;i++)
		{
			if(array[i].equals("R")||array[i].equals("L"))
			{
				dir=findDir(array[i],dir);
			}
			else if(array[i].equals("M"))
			{
				if(dir=='N')
				{
					y++;
				}
				else if(dir=='E')
				{
					x++;
				}
				else if(dir=='S')
				{
					y--;
				}
				else if(dir=='W')
				{
					x--;
				}
			}
			if(x>input1||y>input2||x<0||y<0)
			{
				direction=direction+"ER";
				if(x>input1)
				{
					x--;
				}
				else if(x<0)
				{
					x++;
				}
				else if(y<0)
				{
					y++;
				}
				else if(y>input2)
				{
					y--;
				}
				s=s+x+"-"+y+"-"+dir+"-"+direction;
				return s;
			}
		}
		s=s+x+"-"+y+"-"+dir;
		return s;
	}
	static char findDir(String s,char dir)
	{
		char x='/';
		switch(dir)
		{
			case 'N':
				if(s.equals("R"))
				{
					x='E';
				}
				else if(s.equals("L"))
				{
					x='W';
				}
				break;
			case 'E':
				if(s.equals("R"))
				{
					x='S';
				}
				else if(s.equals("L"))
				{
					x='N';
				}
				break;
			case 'S':
				if(s.equals("R"))
				{
					x='W';
				}
				else if(s.equals("L"))
				{
					x='E';
				}
				break;
			case 'W':
				if(s.equals("R"))
				{
					x='N';
				}
				else if(s.equals("L"))
				{
					x='S';
				}
				break;
		}
		return x;
	}
}
