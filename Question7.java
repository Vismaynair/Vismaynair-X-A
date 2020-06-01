public class Question7
{
   public static void main(int Eng, int Sci, int Comp, int Commer, int total, int Maths, int rollNo, String name)
   {
       int a= (Eng+Sci+Comp+Maths+Commer);
       int per= (a*100)/total;
       int avg = a/5;
       if (per>=90)
       {
           System.out.println("Science with Computers");
        }
        else if (per<=89 && per>=80)
       {
           System.out.println("Science without Computers");
        }
        else if (per<=79 && per>=70)
       {
           System.out.println("Commerce with Maths");
        }
        else if (per<=69 && per>=60)
       {
           System.out.println("Commerce without Maths");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}