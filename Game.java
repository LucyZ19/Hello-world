import java.util.Scanner;

public class Game
{
  public static void main (String[] args)
  {
    String str = new String("Would you like to play a game? yes or no?");
    System.out.println(str.substring(0,31));
    System.out.println(str.substring(31));
    Scanner scan = new Scanner(System.in);
    String answer = scan.nextLine();
    String game = "lets play a game of";
    Rules rule = new Rules();
    Easyhard mode = new Easyhard();
    
    if (answer.equals("yes")) 
    {
      
      Start begin = new Start();
      System.out.println (begin.toString("Would you like to play: ") + "?");
      String easy = scan.nextLine();
      
      if (easy.equals("easy")) 
      {
        System.out.println(game + " gardening");
        System.out.println("the rules are simple" + "\n" + rule.rules(10, 50, "easy"));
        System.out.println(mode.g(easy));
      }
      else if (easy.equals("hard"))
      {
        System.out.println(game + " gardening");
        System.out.println("the rules are simple" + "\n" + rule.rules(15, 70, "hard"));
        System.out.println(mode.g(easy));
      }
      
    } 
    else if (answer.equals("no"))
    {
      System.out.println ("ok, come back when you want to play");
    }
    
    
    //scan.close();
    
  }
}