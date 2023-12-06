public class Easyhard
{
  public int g(String e)
  {
    if (e.equals("easy"))
    {
      int n = (int) (Math.random()*13);
      return n;
    }
    else
    {
      int n = (int) (Math.random()*13) + 12;
      return n + 1;
    }
  }
}