public class Easyhard
{
  public String e;
  private int n;
  public int g(String e)
  {
    if (e.equals("easy"))
    {
      int n = (int) (Math.random()*13);
      return n;
    }
    else
    {
      return n + 1;
    }
  }
}