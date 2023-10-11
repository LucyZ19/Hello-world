import java.util.Scanner;

public class Game
{
  public static void main (String[] args)
  {
    System.out.println("Would you like to play a game? yes or no?");
    Scanner scan = new Scanner(System.in);
    String answer = scan.nextLine();
    boolean vaild = true;
    //do {
    
    if (answer.equals ("yes")) 
    {
      return vaild = true;
    } 
    else if (menu.equals("no"))
    {
      return valid = false;
    }
    //while(!vaild);
    
    
    scan.close();
   
  }
  }