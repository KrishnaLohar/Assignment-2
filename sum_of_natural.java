package basicprogram;
import java.util.scanner;
public class sum_of_natural
{

    public static void main(String args[])
    {
       int num,i,sum=0;
       Scanner sc=new Scanner (system.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       for(i=1;i<=num;i++)
       {
           sum=sum+i;
       }
       System.out.println("Sum of natural no from 1 to "+num+" is="+sum );
    }
}
