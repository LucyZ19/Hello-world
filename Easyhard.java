public class Easyhard
{
  public String e;
  public String g(String e)
  {
    if (e.equals("easy"))
    {
      int n = (int) (Math.random()*13);
      return "each flower cost $10 " + n;
    }
    else
    {
      return "each flower cost $35";
    }
  }
}