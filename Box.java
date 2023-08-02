class co
{
 int width;
 int height;
 int length;
}
class Box
{
  public static void main(String [] args)
  {
   co obj=new co();
   obj.width=10;
   obj.height=2;
   obj.length=10;
   int y=obj.width*obj.height*obj.length;
   System.out.println(y);
  }
}

