import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburgAddressMain 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner (new File("GettysburgAddress.txt"));
		ArrayList <String> words = new ArrayList <String>();
		String word= "";
		double avgWordLength = 0;
		while (file.hasNext())
		{
			word = file.next();
			words.add(word);
		}
		
		for (String newWord: words)
		{
			if (newWord.length()>word.length())
			{
				word = newWord;
			}
		}
		for (String newWord: words)
		{
			avgWordLength += newWord.length();
		}
		avgWordLength = avgWordLength/words.size();
		System.out.println ("The longest word is " + word);
		System.out.println("The average word length is " + avgWordLength);
	}

}
