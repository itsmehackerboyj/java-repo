public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[]= {1,2,3,4,5,6,7,8};
		
		System.out.println("Odd number");
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2!=0)
			{
				System.out.println(n[i]);
				
			}
			
		}
		
		System.out.println("\n");
		
		System.out.println("Even number");
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
			{
				System.out.println(n[i]);
			}
		}
		
		

	}

}
