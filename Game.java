import java.util.Scanner;

public class Game
{
  public static void main (String[] args)
  {
    System.out.println("Would you like to play a game? yes or no?");
    Scanner scan = new Scanner(System.in);
    String answer = scan.nextLine();
    
    if (!answer.equals ("yes")) {
      System.out.println("Nice to meet you.");
    } //else if (answer = "no") {
      
    //}
    
    
    scan.close();
  }}