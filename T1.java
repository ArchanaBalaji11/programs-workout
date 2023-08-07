import java.util.Scanner;
 public class T1
 {
 	public static void main(String [] args)
 	{
 		int n,i,j;
 		Scanner s= new Scanner(System.in);
 			System.out.print("n : ");
 			n=s.nextInt();
 			for(i=1;i<=n;i++)
 		       {
 			for(j=1;j<=n;j++)
 				{
 			if((i+j)%2==0)
 			{	
 				System.out.print("1");
 			}
 			else
 			{
 				System.out.print("0");
 			}
 			        }
 			        System.out.println();
 		       }
}
} 				
 		
 	      
