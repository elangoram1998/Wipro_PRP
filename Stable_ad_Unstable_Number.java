package Stable_and_Unstable;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args)
    {
        System.out.println(fun(12,1313,122,678,898));
    }
    static int fun(int input1,int input2,int input3,int input4,int input5)
    {
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(input1);
        list.add(input2);
        list.add(input3);
        list.add(input4);
        list.add(input5);
        int stable=0;
        int unstable=0;
        for(int i=0;i<list.size();i++)
        {
            if(checkStable(list.get(i)))
            {
                stable=stable+list.get(i);
            }
            else
            {
               unstable=unstable+list.get(i);
            }
        }
        return stable-unstable;
    }
    static boolean checkStable(int n)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        String s="";
        s=s+n;
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)-'0'))
            {
                hm.put(s.charAt(i)-'0',1);
            }
            else
            {
                int v=hm.get(s.charAt(i)-'0');
                hm.put(s.charAt(i)-'0',++v);
            }
        }
        int temp=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            temp=e.getValue();
        }
        int count=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            if(e.getValue()==temp)
            {
                count++;
            }
        }
       if(count==hm.size())
       {
           return true;
       }
        
        return false;
    }
}
