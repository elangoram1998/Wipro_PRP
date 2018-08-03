package com.mile1.videoRental;

import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VideoStore s=new VideoStore();
		while(true)
		{
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos:");
			System.out.println("2.Check Out Videos:");
			System.out.println("3.Return Video:");
			System.out.println("4.Receive Rating:");
			System.out.println("5.List Inventry:");
			System.out.println("6.Exit:");
			System.out.print("Enter Your Choice (1..6):");
			switch(sc.nextInt())
			{
			case 1:
				s.addVideo(sc.next());
				System.out.println("video added successfully!!!!");
				break;
			case 2:
				s.doCheckout(sc.next());
				System.out.println("video checked successfully!!!!");
				break;
			case 3:
				s.doReturn(sc.next());
				System.out.println("video returnd successfully!!!!");
				break;
			case 4:
				s.receiveRating(sc.next(),sc.nextInt());
				System.out.println("video rated successfully!!!!");
				break;
			case 5:
				s.listInventry();
				break;
			case 6:
				System.out.println("Exiting....Thank you for using this application!!!!");
				System.exit(0);
			
			}
			System.out.println();
			System.out.println();
		}

	}

}
