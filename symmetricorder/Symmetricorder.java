import java.io.*;
import java.util.*;

public class Symmetricorder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int theNext = in.nextInt();
      int count = 1;
      while(theNext != 0){
         System.out.println("SET " + count);
         ArrayList<String> first = new ArrayList<String>();
         ArrayList<String> second = new ArrayList<String>();
        
         for(int i=0;i<theNext;i++){
            if(i % 2 == 0)   
               first.add(in.next());
            else
               second.add(in.next());
         }
         
         Collections.reverse(second);
         
         for(String str:second){
            
            first.add(str);
         }
         for(String str:first){
            System.out.println(str);
         }
         
         theNext = in.nextInt();
         count++;
      }
      
   }
}
