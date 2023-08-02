import java.util.*;
 class Fact
 {
   public static int factorial(int a)
    {
     if(a==0||a==1)
   {
         return 1;
   }
     else
   {
        return a*factorial(a-1);
   }
    }
 public static void main(String [] args)
     {
       Scanner s= new Scanner(System.in);
       int n;
       System.out.println("enter number\n");
       n=s.nextInt();
       int fact=factorial(n);
       System.out.println(" Factorial of " +n+ " is " +fact);
     }
 }
 
