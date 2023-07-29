import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value :"); //user put in value
		n=sc.nextInt();
		
		int r,sum=0,temp;
		
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		
			System.out.println("palindrome number");
		
		else
		
			System.out.println("not palindrome number");
		

	
	}

}
