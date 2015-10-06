import java.io.*;
import java.util.*;
public class Oddities
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      PrintWriter out = new PrintWriter(System.out);

      int tries = in.nextInt();
      for(int i=0;i<tries;i++)
      {
        int hold = in.nextInt();
        if(hold%2==0)
          System.out.println(hold + " is even");
        else
          System.out.println(hold + " is odd");
      }
      
      
   }
}
