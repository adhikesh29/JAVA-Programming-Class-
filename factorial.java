
import java.util.Scanner;
class Factorial 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number");
		int num=s.nextInt();
		int fact=1;
		for (int i=2;i<=num ;i++ )
		{
			fact*=i;
		}
		System.out.println("The Factorial of the"+num+" is :"+fact);
	}
}