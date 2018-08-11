import java.util.*;
public class amstrong {

	public static void main(String[] args)
	{
		int n,r,s=0,s1;
		
		Scanner a= new Scanner(System.in);
		n= a.nextInt();
		s1=n;
		a.close();
		while(n!=0)
		{
			r=n%10;
			n /=10;
			s=s+r*r*r;
			
		}
	
		if(s==s1)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

}
