package dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Operation_String_List {

	static ArrayList<String> list=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
		while(true)
		{
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1.Insert");
			System.out.println("2.Search");
			System.out.println("3.Delete");
			System.out.println("4.Display");
			System.out.println("5.Replace");
			System.out.println("6.Sort");
			System.out.println("7.Shuffle");
			System.out.println("8.Reverse");
			System.out.println("9.Exit");
			System.out.print("Enter your choice (1..9):");
			switch(sc.nextInt())
			{
			case 1:
				System.out.print("Enter the item to inserted:");
				insertList(sc.next());
				break;
			case 2:
				System.out.print("Enter the item to search:");
				searchList(sc.next());
				break;
			case 3:
				System.out.print("Enter the item to delete:");
				deleteList(sc.next());
				break;
			case 4:
				System.out.println("The item in the list are:");
				displayList();
				break;
			case 5:
				System.out.println("There are "+list.size()+" elements in the list");
				int x=list.size()-1;
				System.out.print("Enter the index (0 to "+x+") that you want to replace:");
				replaceList(sc.nextInt());
				break;
			case 7:
				if(list.size()>1)
				{
				Collections.shuffle(list);
				System.out.println("The elements have been shuffled randomly.");
				}
				else
				{
					System.out.println("Add elements...");
				}
				break;
			case 6:
				Collections.sort(list);
				System.out.println("The element have been sorted in ascending order.");
				break;
			case 8:
				reverseList();
				break;
			case 9:
				System.out.println("Exiting. . . Thanks for using the application!!");
				System.exit(0);
			}System.out.println();
			System.out.println();
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
	}
	static void insertList(String str)
	{
		list.add(str);
		System.out.println("Inserted successfully.");
	}
	static void searchList(String str)
	{
		if(list.contains(str))
		{
			System.out.println("Item found in the list.");
		}
		else
		{
			System.out.println("Item not found in the list.");
		}
	}
	static void deleteList(String str)
	{
		if(list.contains(str))
		{
		list.remove(str);
		System.out.println("Deleted successfully.");
		}
		else
		{
		System.out.println("Item does  not exist.");
		}
	}
	static void displayList()
	{
		if(list.size()>0)
		{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		}
		else
		{
			System.out.println("List is empty.");
		}
	}
	static void replaceList(int n)
	{
		if(list.size()>0)
		{
		if(n<list.size())
		{
			System.out.println("Element at  index n is "+list.get(n));
			System.out.print("What do you want to replace it with?");
			list.set(n,sc.next());
			System.out.println("Item replaced successfully.");
		}
		}
		else
		{
			System.out.println("Add elements...");
		}
	}
	static void reverseList()
	{
		if(list.size()>0)
		{
			Collections.reverse(list);
			System.out.println("The position of elements have been reversed.");
		}
		else
		{
			System.out.println("List is empty");
		}
	}

}
