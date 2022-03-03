package darrays;

public class Averageofarray
{
	public static void main(String args[])
	{
		  int numbers[]= {10,19,27,11,39,21,5,3,100,1};
		  int  result=0;
		  int i;
			for(i=0;i<numbers.length;i++)
	{
			result=result+numbers[i];
		}
		System.out.println(result/numbers.length);;
	}
}
	

