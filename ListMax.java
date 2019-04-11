/*
	First initilase the array with 0 after getting the size
	then create the testcases array.
	for each testcase add the value to the array element from start to end index and keep track of maximum 
	return the maximum
*/

//java imports
import java.util.*;

public class ListMax 
{
	public static void main(String args[])
	{
		int size,i,j,k,numfOfTestCases,testCaseLength;
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		 
		int a[] = new int[size];
		
		for(i=0;i<size;i++)
		{
			a[i] = 0;
		}
		
		numfOfTestCases = s.nextInt();
		testCaseLength = s.nextInt();
		int testCaseArray[][] = new int[numfOfTestCases][testCaseLength];
		
		int start = 0,end = 0,value = 0,max=0;
		for(i=0;i<numfOfTestCases;i++)
		{
			for(j=0;j<testCaseLength;j++)
			{
				testCaseArray[i][j] = s.nextInt();
				if(j == 0)
				{
					start = testCaseArray[i][j];
				}
				else if(j == 1)
				{
					end = testCaseArray[i][j];
				}
				else if(j == 2)
				{
					value = testCaseArray[i][j];
				}
			}
			
			for(k=start-1;k<=end-1;k++)
			{
				a[k] += value;
				if(a[k] > max)
				{
					max = a[k];
				}
			}
		}
		
		System.out.println(max);
	}
}
