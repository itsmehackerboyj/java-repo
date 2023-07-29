import java.util.Scanner;
 
public class amstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//the amstrong numbers are 0,1,153,370,371,407
		
		int n,sum=0,temp,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value :");
		n=s.nextInt();
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("not amstrong number");
		}

	}

}
