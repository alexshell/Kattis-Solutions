import java.io.*;
import java.util.*;

public class Heliocentric
{
   int caseNum = 0;
   public static void main(String[] args)
   {
      int caseNum = 1;
      Scanner in = new Scanner(System.in);
      PrintWriter out = new PrintWriter(System.out);
      String earthInput;
      String marsInput;
      while(in.hasNextInt()){
          computeCase(in.nextInt(),in.nextInt(),caseNum);
          caseNum++;
      }
      }
      
    public static void computeCase(int earthInput, int marsInput, int caseNumInput)
    {
      int earthMod = earthInput;
      int marsMod  = marsInput;
      int count = 0;
      if(marsInput == 0 && earthInput == 0)
          System.out.println("Case " + caseNumInput + ": " + count);
      else{
        while(marsMod % 687 != 0 || earthMod % 365 != 0){
          earthMod++;
          marsMod++;
          count++;
          //System.out.println(earthMod + " " + marsMod + " " + count);
        }
        System.out.println("Case " + caseNumInput + ": " + count);
        }
      
    
      
      
      
    
   }
}
