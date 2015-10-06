import java.io.*;
import java.util.*;

public class Haypoints
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int dictionaryCount = in.nextInt();
      int jobAppCount = in.nextInt();
      
      ArrayList<String> dictionary = new ArrayList<String>();
      ArrayList<Integer> value = new ArrayList<Integer>();

      for(int i=0;i<dictionaryCount;i++){
         dictionary.add(in.next());
         value.add(in.nextInt());
      
      }

      for(int i = 0; i<jobAppCount;i++){
         int appValue = 0;
         String nextWord = in.next();
         while(nextWord.compareTo(".") != 0){
            for(int j = 0; j<dictionary.size();j++)
               if(nextWord.compareTo(dictionary.get(j)) == 0)
                  System.out.println(nextWord);
                  appValue = appValue + value.get(dictionary.indexOf(dictionary.get(j)));
                  
         nextWord = in.next();
         }
         System.out.println(appValue);
      
      
      }
         System.out.println(dictionary.size());
         
      } 
   
   }

