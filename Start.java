public class Start
{
  public String toString(String g)
  {
    return g + "easy or hard";
  }
  public static void beads(String s)
  {
    if(s.equals("easy"))
    {
      for(int i = 0; i < 2; i++)
      {
        for(int j = 5; j > 0; j--)
        {
          System.out.print("O");
        }
        System.out.println();
      }
    }
       else
         {
         for(int i = 0; i < 3; i++)
         {
           for(int j = 5; j > 0; j--)
           {
             System.out.print("O");
           }
           System.out.println();
         }
       }
  }
  }