public class Main
{
  public static void main (String[] args)
  {
    System.out.println ("Hello, world!");
    System.out.println ("Nice to meet you.");
    
    int num = 2;    // int - which store integers (numbers like 3, -76, 20393)                                      //final can be used in front of a variable declaration to make it a constant that cannot be changed
    double num1 = 2.25;       // double - which store floating point numbers (decimal numbers like 6.3 -0.9, and 60293.93032)
    double num2 = 1.5;
    final boolean real = true;   // boolean - which store Boolean values (either true or false).
    
    System.out.println ("is " + num1 + " > " + num + "?");
    System.out.println (real);
    
    num2 = num + num2;
    num1 = (num2 + num) * num;
    System.out.println ("is " + num1 + " > " + num2 + "?");
    System.out.println (real);
    
    num2 = ((num2 + num1) * num);
    num1 = (num1 * num) + num;
    System.out.println ("is " + num2 + " > " + num1 + "?");
    System.out.println (real);
  }
}