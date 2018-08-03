package com.mile1.videoRental;

public class Video {
	String videoName;
	boolean checkout;
	int rating;
	Video(String name)
	{
		this.videoName=name;
	}
	public String getName()
	{
		return videoName;
	}
	public int getRating()
	{
		return rating;
	}
	public boolean getCheckout()
	{
		if(checkout==true)
		{
			return true;
		}
		return false;
	}
	void receiveRating(int rating)
	{
		this.rating=rating;
	}
	void doCheckout()
	{
		this.checkout=true;
	}
	void doReturn()
	{
		this.checkout=false;
	}

}
