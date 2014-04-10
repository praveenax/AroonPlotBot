
package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteStory
{

	/**
	 * @param args
	 */
	public static void main (String[] args)
	{

		/* Input */

		// get number of chapters
		// scenes per chapter
		// create characters -get character name
		// create locations - get location name
		// output file name

		/* Process */

		// break each chapters and assign - characters, location, event, emotion

		/* Output */

		// each scene:
		// should have one or more characters
		// should have a location
		// should describe one or many events

		// To DO:
		// Construct word list for describing event & emotion
		// Objects depicting Story - Chapter - Scenes - Character & Location

		execute();

	}

	private static int getRandomFactor (int Min, int Max)
	{

		return (Min + (int)(Math.random() * ((Max - Min) + 1)));
	}

	private static List<String> getRandomWords ()
	{

		List<String> strList = new ArrayList<String>();
		try
		{
			String fLine;
			BufferedReader br = new BufferedReader(new FileReader("wordlist.txt"));
			while ((fLine = br.readLine()) != null)
			{
// System.out.println(fLine);
				strList.add(fLine);
			}
			
			br.close();
		}
		catch (Exception e)
		{

			e.printStackTrace();
		}

		return strList;

	}

	private static void execute ()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Story Name:");
		Story story = new Story();
		story.setStoryName(sc.nextLine());

		System.out.println("Enter the number of Chapters:");
		story.setNumberOfChapters(sc.nextInt());

		System.out.println("Enter the number of Actors:");
		story.setNumberOfCharacters(sc.nextInt());

		System.out.println("Enter the number of Locations:");
		story.setNumberOfLocation(sc.nextInt());

		List<Actor> charList = new ArrayList<Actor>();
		System.out.println("Character list :"+story.getNumberOfCharacters());
		for (int i = 0; i < story.getNumberOfCharacters(); i++)
		{

			Actor actor = new Actor();
			System.out.println("Enter the Actor Name:");
			actor.setActorName(sc.next());
			charList.add(actor);
		}
		story.setTotalCharList(charList);

		List<Place> placeList = new ArrayList<Place>();
		for (int i = 0; i < story.getNumberOfLocation(); i++)
		{

			Place place = new Place();
			System.out.println("Enter the Location Name:");
			place.setPlaceName(sc.next());
			placeList.add(place);
		}
		story.setTotalLocationList(placeList);

		story = storyprocessData(story);
		printBook(story);
		
		sc.close();
	}

	private static void printBook (Story finalDraft)
	{

		BufferedWriter bWr;
		try
		{
			bWr = new BufferedWriter(new FileWriter("E://Book.txt"));

			bWr.append(finalDraft.getStoryName() + "\n");

			for (Chapter chapter : finalDraft.getChapterList())
			{
				bWr.append("Chapter " + chapter.getChapterNumber() + "\n");
				for (Scene scene : chapter.getSceneList())
				{
					bWr.append("Scene " + scene.getSceneNumber() + "\n");
					bWr.append("Characters : \t");
					for (Actor actor : scene.getCharacterList())
					{
						bWr.append(actor.getActorName() + "  ");
					}
					bWr.append("Place : " + scene.getPlace().getPlaceName() + "\n");
					for (String ranStr : scene.getRandomList())
					{
						bWr.append(ranStr + "\t");
					}
					bWr.append("\n");
				}

			}

			bWr.close();

		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Story storyprocessData (Story prStory)
	{

		List<Actor> actorList = prStory.getTotalCharList();
		List<Place> placeList = prStory.getTotalLocationList();
		int numOfChap = prStory.getNumberOfChapters();
		List<Chapter> chapList = new ArrayList<Chapter>();
		for (int i = 0; i < numOfChap; i++)
		{
			Chapter chapter = new Chapter();
			chapter.setChapterNumber(i + 1);
			List<Scene> scenList = new ArrayList<Scene>();
			for (int j = 0; j < 3; j++)
			{
				Scene scene = new Scene();
				scene.setSceneNumber(j + 1);
				int numOfActors = getRandomFactor(1, actorList.size() - 1);

				List<Actor> actForScene = new ArrayList<Actor>();

				// actor loop
				for (int x = 0; x < numOfActors; x++)
				{
					Actor tempActor = actorList.get(getRandomFactor(0, actorList.size() - 1));
					if (!actForScene.contains(tempActor))
					{
						actForScene.add(tempActor);
					}
				}
				scene.setCharacterList(actForScene);

				// Place loop
				Place tempPlace = placeList.get(getRandomFactor(0, placeList.size() - 1));
				scene.setPlace(tempPlace);

				List<String> ranWords = new ArrayList<String>();

				List<String> ranList = getRandomWords();
				for (int x = 0; x < 5; x++)
				{
					int randNumber = getRandomFactor(1, ranList.size() - 2);
// System.out.print(ranList.get(randNumber) + "\t");
					ranWords.add(ranList.get(randNumber));
				}

				scene.setRandomList(ranWords);

				scenList.add(scene);
			}
			chapter.setSceneList(scenList);
			chapList.add(chapter);
		}
		prStory.setChapterList(chapList);
		return prStory;

	}

}
