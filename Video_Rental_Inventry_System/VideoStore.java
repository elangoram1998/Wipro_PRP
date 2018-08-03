package com.mile1.videoRental;

import java.util.*;

public class VideoStore {

	Video[] store=new Video[3];
	HashMap<String,Integer>hm=new HashMap<>();
	int x=0;
	void addVideo(String name)
	{
		if(!hm.containsKey(name))
		{
		hm.put(name,x);
		x++;
		store[hm.get(name)]=new Video(name);
		}
		else
		{
			System.out.println("already there");
		}
	}
	void doCheckout(String name)
	{
		store[hm.get(name)].doCheckout();
	}
	void doReturn(String name)
	{
		store[hm.get(name)].doReturn();
	}
	void receiveRating(String name,int rating)
	{
		store[hm.get(name)].receiveRating(rating);
	}
	void listInventry()
	{
		System.out.println("---------------------------------------------------------------");
		for(int i=0;i<hm.size();i++)
		{
		System.out.println("Video name:"+store[i].getName()+"      "+"checkout status:"+store[i].getCheckout()+"       "+"rating:"+store[i].getRating());
		}
		System.out.println("---------------------------------------------------------------");
	}

}
