package src;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomiser {

	static Color ColorNames[] = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
	static Color BlockNames[] = {Color.WHITE, Color.BLACK};
	
	public static Color[] ConvertColors (int colors[]) {
		Color Colors[] = new Color [4];
		for (int i=0; i<4; i++) {
			Colors[i] = ColorNames[colors[i]];
		}
		return Colors;
	}
	
	public static Color[] ConvertBlocks (int blocks[]) {
		Color Blocks[] = new Color [6];
		for (int i=0; i<6; i++) {
			Blocks[i] = BlockNames[blocks[i]];
		}
		return Blocks;
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
	
	public static Color[] Colors() {
		int ColorsInts [] = {0,1,2,3};
		shuffleArray(ColorsInts);
		Color ColorsStrings [] = ConvertColors(ColorsInts);
		return ColorsStrings;
	}
	public static Color[] Blocks() {
		int BlocksInts [] = {0,0,1,1,1,1};
		shuffleArray(BlocksInts);
		Color BlocksStrings [] = ConvertBlocks(BlocksInts);
		return BlocksStrings;
	}
}
