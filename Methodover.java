public class Methodover
{
 private String startMethod="Dog";
 public void start()
 {
  System.out.println(startMethod+" is an Animal.");
 }
 public void start(String method)
  {
   this.startMethod=method;
   System.out.println(startMethod+" is an Animal.");
  }
  public static void main(String [] args)
  {
   Methodover animal=new Methodover();
   animal.start();
   animal.start("Cat");
  }
}
