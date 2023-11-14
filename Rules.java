public class Rules
{
  private int f;
  private double m;
  public String rules(int f, double m)
  {
    String s = "you have a flower bed that can hold " + f + " flowers" + "\n" + "you start with $" + m;
    String d = "\n" + "and every math question you get right, you get that amount in $" + "\n" + "every one you get wrong you lose that amount";
    String g = "\n" + "your goal is to fill your flower bed by buying the flowers from the shop";
      
    return s + d + g;
  }
}