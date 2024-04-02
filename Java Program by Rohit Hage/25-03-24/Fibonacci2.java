import java.util.Scanner;
class Fibonacci2
{
	public static void main(String args[])
	{
		int a=0,b=1,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth Term");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{

		System.out.print(a);
		if(i<n)
		{
			System.out.print(", ");
		}
		temp = a+b;
		a=b;
		b=temp;
	}
	System.out.println("\nThe "+n+"th term is "+temp);



	}
}