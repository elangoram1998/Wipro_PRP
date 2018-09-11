import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public String moveRobot(int input1,int input2,String input3,String input4){
		// Read only region end
		int x=input3.charAt(0)-'0';
		int y=input3.charAt(2)-'0';
		String dir=input3.substring(4,input3.length());
		String[] array=input4.split(" ");
		String direction="";
		String s="";
		for(int i=0;i<array.length;i++)
		{
			if(array[i].equals("R")||array[i].equals("r")||array[i].equals("L")||array[i].equals("l"))
			{
				dir=findDir(array[i],dir);
			}
			else
			{
				if(dir.equals("N"))
				{
					y++;
				}
				else if(dir.equals("E"))
				{
					x++;
				}
				else if(dir.equals("S"))
				{
					y--;
				}
				else if(dir.equals("W"))
				{
					x--;
				}
				else if(dir.equals("NE"))
				{
					x++;y++;
				}
				else if(dir.equals("NW"))
				{
					y++;
					x--;
				}
				else if(dir.equals("SE"))
				{
					x++;
					y--;
				}
				else if(dir.equals("SW"))
				{
					x--;
					y--;
				}
			}
			if(x>input1||y>input2||x<0||y<0)
			{
				if(x>input1)
				{
					x--;
				}
				else if(y>input2)
				{
					y--;
				}
				else if(x<0)
				{
					x++;
				}
				else if(y<0)
				{
					y++;
				}
				s=s+x+"-"+y+"-"+dir+"-ER";
				return s;
			}
		}
		s=s+x+"-"+y+"-"+dir;
		return s;
		
	}
	static String findDir(String s,String dir)
	{
		String x="";
		if(dir.equals("N"))
		{
				if(s.equals("R"))
				{
					x="E";
				}
				else if(s.equals("r"))
				{
					x="NE";
				}
			else if(s.equals("L"))
			{
				x="W";
			}
			else if(s.equals("l"))
			{
				x="NW";
			}
		}
		else if(dir.equals("E"))
		{
				if(s.equals("R"))
				{
					x="S";
				}
				else if(s.equals("r"))
				{
					x="SE";
				}
			else if(s.equals("L"))
			{
				x="N";
			}
			else if(s.equals("l"))
			{
				x="NE";
			}
		}
		else if(dir.equals("S"))
		{
				if(s.equals("R"))
				{
					x="W";
				}
				else if(s.equals("r"))
				{
					x="SW";
				}
			else if(s.equals("L"))
			{
				x="E";
			}
			else if(s.equals("l"))
			{
				x="SE";
			}
		}
		else if(dir.equals("W"))
		{
				if(s.equals("R"))
				{
					x="N";
				}
				else if(s.equals("r"))
				{
					x="NW";
				}
			else if(s.equals("L"))
			{
				x="S";
			}
			else if(s.equals("l"))
			{
				x="SW";
			}
		}
		else if(dir.equals("NE"))
		{
				if(s.equals("R"))
				{
					x="SE";
				}
				else if(s.equals("r"))
				{
					x="E";
				}
			else if(s.equals("L"))
			{
				x="NW";
			}
			else if(s.equals("l"))
			{
				x="N";
			}
		}
		else if(dir.equals("NW"))
		{
				if(s.equals("R"))
				{
					x="NE";
				}
				else if(s.equals("r"))
				{
					x="N";
				}
			else if(s.equals("L"))
			{
				x="SW";
			}
			else if(s.equals("l"))
			{
				x="W";
			}
		}
		else if(dir.equals("SW"))
		{
				if(s.equals("R"))
				{
					x="NW";
				}
				else if(s.equals("r"))
				{
					x="W";
				}
			else if(s.equals("L"))
			{
				x="SE";
			}
			else if(s.equals("l"))
			{
				x="S";
			}
		}
		else if(dir.equals("SE"))
		{
				if(s.equals("R"))
				{
					x="SW";
				}
				else if(s.equals("r"))
				{
					x="S";
				}
			else if(s.equals("L"))
			{
				x="NE";
			}
			else if(s.equals("l"))
			{
				x="E";
			}
		}
		return x;
	}
}
