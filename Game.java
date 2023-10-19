import java.util.Scanner;

public class Game
{
  public static void main (String[] args)
  {
    String str = new String("Would you like to play a game?");
    System.out.println(str + " yes or no?");
    Scanner scan = new Scanner(System.in);
    String answer = scan.nextLine();
    
    
    if (answer.equals("yes")) 
    {
      Start begin = new Start();
      begin.toString("Would you like to play:");
      System.out.println (begin.toString("Would you like to play: ") + "?");
      String easy = scan.nextLine();
      
      if (easy.equals("easy")) 
      {
        System.out.println(easy.equals("easy"));
      }
      else if (easy.equals("hard"))
      {
        System.out.println (easy.equals("easy"));
      }
      
      
    } 
      else if (answer.equals("no"))
      {
        System.out.println (answer.equals("yes"));
      }
      
      
      //scan.close();
      
    }
  }