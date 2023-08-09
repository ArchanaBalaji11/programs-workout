import java.util.Arrays;
public class Sort
 {
 public static void main(String[] args)
  {
   int[] a={3,4,5,1,2};
   cyclicsort(a);
   System.out.println(Arrays.toString(a));
  }
  static void cyclicsort(int[]a)
  	{
  	 int i=0;
  	 while(i<a.length)
  	 {
  	 	int correct=a[i]-1;
                if (a[i]!=a[correct])
                	{
                	 swap(a,i,correct);
                	}
                else
                	{
                	 i++;
                	}
         }
        }
  static void swap(int[] a,int first,int second)
  	{
  	 int temp=a[first];
  	 a[first]=a[second];
  	 a[second]=temp;
  	}
  }
