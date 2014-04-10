package com;

import java.util.ArrayList;
import java.util.List;

public class Story
{
	String storyName;
	int numberOfChapters;
	int numberOfCharacters;
	int numberOfLocation;
	List<Actor> totalCharList = new ArrayList<Actor>();
	List<Place> totalLocationList = new ArrayList<Place>();
	List<Chapter> chapterList = new ArrayList<Chapter>();
	
	
	
	public List<Actor> getTotalCharList ()
	{
	
		return totalCharList;
	}
	public void setTotalCharList (List<Actor> totalCharList)
	{
	
		this.totalCharList = totalCharList;
	}
	public List<Place> getTotalLocationList ()
	{
	
		return totalLocationList;
	}
	public void setTotalLocationList (List<Place> totalLocationList)
	{
	
		this.totalLocationList = totalLocationList;
	}
	public int getNumberOfCharacters ()
	{
	
		return numberOfCharacters;
	}
	public void setNumberOfCharacters (int numberOfCharacters)
	{
	
		this.numberOfCharacters = numberOfCharacters;
	}
	public int getNumberOfLocation ()
	{
	
		return numberOfLocation;
	}
	public void setNumberOfLocation (int numberOfLocation)
	{
	
		this.numberOfLocation = numberOfLocation;
	}
	public String getStoryName ()
	{
	
		return storyName;
	}
	public void setStoryName (String storyName)
	{
	
		this.storyName = storyName;
	}
	public int getNumberOfChapters ()
	{
	
		return numberOfChapters;
	}
	public void setNumberOfChapters (int numberOfChapters)
	{
	
		this.numberOfChapters = numberOfChapters;
	}
	public List<Chapter> getChapterList ()
	{
	
		return chapterList;
	}
	public void setChapterList (List<Chapter> chapterList)
	{
	
		this.chapterList = chapterList;
	}
	
	
	
}
