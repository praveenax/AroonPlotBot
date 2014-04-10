package com;

import java.util.ArrayList;
import java.util.List;

public class Chapter
{
	int chapterNumber;
	List<Scene> sceneList = new ArrayList<Scene>();
	public int getChapterNumber ()
	{
	
		return chapterNumber;
	}
	public void setChapterNumber (int chapterNumber)
	{
	
		this.chapterNumber = chapterNumber;
	}
	public List<Scene> getSceneList ()
	{
	
		return sceneList;
	}
	public void setSceneList (List<Scene> sceneList)
	{
	
		this.sceneList = sceneList;
	}
	
	
	
}
