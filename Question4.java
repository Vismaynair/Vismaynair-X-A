public class Question4
{
    public static void main(int i, double P, double r, double n)
    {
    
 switch(i)
     {
        case 1:
        //Term deposit
        double c = 1+(r/100);
        double m= Math.pow(c,n);
        double A= P*m;
	  System.out.println("The Term Deposit is "+ A);
	  break;
	case 2:
	//Recurring deposit
        c= P*n;
        m= n*(n+1);
        A= c + (P*(m/2)*(r/100)*(1/12));
        System.out.println("The Maturity value is "+ A);
        break;
        default:
	System.out.println("Invalid input. Please enter 1 or 2 for desired outcome");
}
}
}