/*
  To find the shorest substring we have to find the  unique characters in a string
  For that traverse the array and store it a hashmap (We can also use 2 arrays,one for unique chars and anoter one for count)
  
  then traverse the string and increment the characters hashmap value when you find the key value
  to track whether we have get all the unique chars or not use Map size and counter variable
  when the map size and counter values are equal it denotes we got the substring with all the chars in string
  Store the substting length  in minLength variable and initilase map values to 0 and counter value to 0
  Repeat this till the string length
  return minimum length
*/

//java imports
import java.util.*;

public class SyncConfStatusCodes 
{
	public static void main(String args[])
	{
		String s,character;
		Scanner scanner = new Scanner(System.in);
		s = scanner.nextLine();

		int i,length = s.length(),counter=0;
		Map<String,Integer> chars = new HashMap<>();

		//get the unique chars from string and store it in a hashmap
		for(i=0;i<length;i++)
		{
			chars.put(Character.toString(s.charAt(i)), 0);
		}

		int size = chars.size(),count,subStrLength=0,minLength=Integer.MAX_VALUE;
		for(i=0;i<length;i++)
		{
			character = Character.toString(s.charAt(i));
			subStrLength++;
			if(chars.containsKey(character))
			{
				count = chars.get(character);
				if(count == 0)
				{
					counter++;		//increment the counter when find a unique character
				}
				chars.put(character, ++count);	//increment the  num of chars in map
			}
			
			if(counter == size)
			{
				minLength = subStrLength<minLength?subStrLength:minLength;		//trace the minimum substring length
				
				//initialise counters and map with zero to traverse the remaining elements
				counter = 0;
				subStrLength = 0;
				for(String key : chars.keySet())
				{
					chars.put(key, 0);
				}
			}
		}
		
		System.out.println(minLength);
	}
}
