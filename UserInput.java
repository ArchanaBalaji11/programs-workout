import java.util.Scanner;
class UserInput
 {
  public static void main(String [] args)
  {
    int a;
    float b;
    String s;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an integer");
    a=sc.nextInt();
    System.out.println("You entered an integer" +a);
    System.out.println("Enter a float");
    b=sc.nextFloat();
    System.out.println("You entered a float number"+b);
    s=sc.next();
    System.out.println("You entered a string"+s);
  }
 }
    
