public class Question5
{
    public static void main(int n,int i)
    {
        switch (n)
        {
            case 1:
           
            {
                for(int k= 1; k<=i; k++)
                {
                    System.out.print(k+"");
                }
                System.out.println();
            }
            break;
            case 2:
           for(int l=i;l>=0;l--)
            {
                int al= 97;
                for(int k= 0; k<=l; k++)
                {
                    System.out.print((char)(al+k));
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Enter a valid integer");
        }
    }
}