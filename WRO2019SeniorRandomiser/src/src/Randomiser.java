package src;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomiser {

	static Color colorNames[] = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
	static Color blockNames[] = {Color.WHITE, Color.BLACK};
	
	static Color[] convertColors (int colorsIn[]) {
		Color colors[] = new Color [4];
		for (int i=0; i<4; i++) {
			colors[i] = colorNames[colorsIn[i]];
		}
		return colors;
	}
	
	static Color[] convertBlocks (int blocksIn[]) {
		Color blocks[] = new Color [6];
		for (int i=0; i<6; i++) {
			blocks[i] = blockNames[blocksIn[i]];
		}
		return blocks;
	}
	
	static void shuffleArray(int[] ar)
	{
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	    	int index = rnd.nextInt(i + 1);
	    	int a = ar[index];
	    	ar[index] = ar[i];
	    	ar[i] = a;
	    }
	}
	
	static List<String> readFileInList(String fileName) throws IOException
	{
		List<String> lines = Collections.emptyList();
		try 
		{
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		}
		catch (IOException e)
		{
			File file = new File(fileName);
			file.createNewFile();
		}
		return lines;
	}
	
	public static String concatenate (int[] colors, int[] blocks) 
	{
		String concatenatedStrings = String.valueOf(colors[0]);
		for(int i = 0; i<3; i++)
			concatenatedStrings += String.valueOf(colors[i+1]);
			
		for(int i = 0; i<6; i++)
			concatenatedStrings += String.valueOf(blocks[i]);
		return concatenatedStrings;
	}
	
	static int[] intColors() {
		int colorsInts [] = {0,1,2,3};
		shuffleArray(colorsInts);
		return colorsInts;
	}
	
	static int[] intBlocks() {
		int blocksInts [] = {0,0,1,1,1,1};
		shuffleArray(blocksInts);
		return blocksInts;
	}
	
	public static Color[] Colors(int[] colors) {
		Color colorsStrings [] = convertColors(colors);
		return colorsStrings;
	}
	
	public static Color[] Blocks(int[] blocks) {
		Color blocksStrings [] = convertBlocks(blocks);
		return blocksStrings;
	}
	
	public static boolean CheckFile(String drawID) throws IOException {
		List<String> Draws = readFileInList("Draws.txt");
		return Draws.contains(drawID);
	}
	
	public static void WriteFile(String drawID) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("Draws.txt", true));
	    writer.append(drawID + "\n");
	    writer.close();
	}
	
	public static void ResetFile() throws IOException {
		new FileWriter("Draws.txt", false).close();
	}
}
