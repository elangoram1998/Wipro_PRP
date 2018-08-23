import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public class Result{
		public final String output1;
		public final String output2;
		public final String output3;

		public Result(String out1, String out2, String out3){
			output1 = out1;
			output2 = out2;
			output3 = out3;
		}
	}
	
    public Result encodeThreeStrings(String input1,String input2,String input3){
    	// Read only region end
        String A[]=splitStr(input1);
		String B[]=splitStr(input2);
		String C[]=splitStr(input3);
		
		String front=A[0]+B[0]+C[0];
		String middle=A[1]+B[1]+C[1];
		String End=A[2]+B[2]+C[2];
		String fin="";
		for(int i=0;i<End.length();i++){
			char ch=End.charAt(i);
			if(ch>='A'&&ch<='Z'){
				fin+=Character.toLowerCase(ch);
			}else{
				fin+=Character.toUpperCase(ch);
			}
		}
        Result r=new Result(front,middle,fin);
		return r;
    }
	public static String[] splitStr(String s){
		String arr[]=new String[3];
		arr[0]="";arr[1]="";arr[2]="";
		int len=s.length();
		int f=0,l=0;
		if(len%3==0){
			f=len/3;
			l=len-len/3;
		}else if(len%3==1){
			f=len/3;
			l=len-len/3;
		}else{
			f=len/3+1;
			l=len-len/3-1;
		}
		for(int i=0;i<f;i++){
			arr[0]+=s.charAt(i);
		}
		for(int i=f;i<l;i++){
			arr[1]+=s.charAt(i);
		}
		for(int i=l;i<len;i++){
			arr[2]+=s.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
