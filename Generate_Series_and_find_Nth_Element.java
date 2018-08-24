import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int seriesN(int input1,int input2,int input3,int input4){
		// Read only region end
		int x=input2-input1;
		int y=input3-input2;
		int temp=input3;
		for(int i=0;i<input4-3;i++)
		{
			if(i%2==0)
			{
				temp=temp+x;
			}
			else
			{
				temp=temp+y;
			}
		}
		return temp; 
	}
}
