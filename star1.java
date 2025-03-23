import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the star value");
		n=s.nextInt();
		
		for(i=0;i<=n;i++)
		{
		for(j=0;j<=i;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
		}
		for( i=0;i<n;i++)
		{
		for(j=1;j<=-i+5;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
		}
	
		
		
		for(i=1;i<=n;i++)
		{
		for(int h=1;h<=i;h++)
		{
			System.out.print(" ");
		}
			for(j=1;j<=5-i+1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
}


