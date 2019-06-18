package src;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
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
	
	public static int convertColorsToNumbers(Color colorsIn) {
		int colors;
			if(colorsIn==Color.RED)
				colors = 0;
			else if (colorsIn==Color.BLUE)
				colors = 1;
			else if (colorsIn==Color.GREEN)
				colors = 2;
			else
				colors = 3;
		return colors;
	}
	
	public static int convertBlocksToNumbers(Color blocksIn) {
		int blocks;
			if(blocksIn==Color.WHITE)
				blocks = 0;
			else
				blocks = 1;
		return blocks;
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
		String requestURL = "http://tettix.no-ip.org/wro2019/check_file.php?drawID=" + drawID;
	    URL url = new URL(requestURL);
		URLConnection connection = url.openConnection();
		connection.connect();
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		if(in.readLine()=="YES") {
			in.close();
			return true;
		}	
		else {
			in.close();
			return false;
		}
	}
	
	public static void WriteFile(String drawID) throws IOException {
	    String requestURL = "http://tettix.no-ip.org/wro2019/write_file.php?drawID=" + drawID;
	    URL url = new URL(requestURL);
		URLConnection connection = url.openConnection();
		connection.connect();
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		in.close();
	}
	
	public static void ResetFile() throws IOException {
		URL url = new URL("http://tettix.no-ip.org/wro2019/reset_file.php");
		URLConnection connection = url.openConnection();
		connection.connect();
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		in.close();
	}
}
