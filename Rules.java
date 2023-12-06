public class Rules
{
  public String rules(int f, double m, boolean e)
  {
    String s = "you have a flower bed that can hold " + f + " flowers" + "\n" + "you start with $" + m;
    String d = "\n" + "and every math question you get right, you get that amount in $" + "\n" + "every one you get wrong you lose that amount";
    String g = "\n" + "your goal is to fill your flower bed by buying the flowers from the shop"+ "\n";
    
    //tring e = String easy;
    if(e)
    {
      String h = "each flower cost $10";
      return s + d + g + h;
    }
    else
    {
      String h = "each flower cost $35";
      return s + d + g + h;
    }
  
  }
}