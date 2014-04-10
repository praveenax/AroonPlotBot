package com;

import java.util.ArrayList;
import java.util.List;

public class Scene
{
	int sceneNumber;
	Place place;
	List<Actor> characterList = new ArrayList<Actor>();
	List<String> randomList = new ArrayList<String>();
	
	
	
	public int getSceneNumber ()
	{
	
		return sceneNumber;
	}
	public void setSceneNumber (int sceneNumber)
	{
	
		this.sceneNumber = sceneNumber;
	}
	public Place getPlace ()
	{
	
		return place;
	}
	public void setPlace (Place place)
	{
	
		this.place = place;
	}
	
	public List<String> getRandomList ()
	{
	
		return randomList;
	}
	public void setRandomList (List<String> randomList)
	{
	
		this.randomList = randomList;
	}
	public List<Actor> getCharacterList ()
	{
	
		return characterList;
	}
	public void setCharacterList (List<Actor> characterList)
	{
	
		this.characterList = characterList;
	}
	
	
	
}
