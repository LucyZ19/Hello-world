import java.util.Scanner;

public class Main
{
  public static void main (String[] args)
  {
    System.out.println("Hello, world!");
    System.out.println("Nice to meet you.");

    System.out.println("Solve these math problems:");
    Scanner scan = new Scanner(System.in);


    final int num = 2;    // int - which store integers (numbers like 3, -76, 20393)                                      //final can be used in front of a variable declaration to make it a constant that cannot be changed
    double num1 = 2.25;       // double - which store floating point numbers (decimal numbers like 6.3 -0.9, and 60293.93032)
    double num2 = 1.5;
    boolean real = true;   // boolean - which store Boolean values (either true or false).
    
    System.out.println ("true or false is " + num1 + " > " + num + "?");
    String num3 = scan.nextLine();
    System.out.println("You answered: " + num3);
    System.out.println ("The correct answer is " + real);
    
    num2 = num + num2;
    num1 = (num2 + num) * num;
    System.out.println ("is " + num1 + " > " + num2 + "?");
    System.out.println (real);
    
    num2 = ((num2 + num1) * num);
    num1 = (num1 * num) + num;
    System.out.println ("is " + num2 + " > " + num1 + "?");
    System.out.println (real);

    num1++;
    num2--;
    System.out.println ("is " + num2 + " > " + num1 + "?");
    System.out.println (real);

    scan.close();

    double number = 28.0 / 25;
    System.out.println("28.0/25.0 = " + number);
    System.out.println("28.0/25.0 truncated: " + (int) number);

  }
}
