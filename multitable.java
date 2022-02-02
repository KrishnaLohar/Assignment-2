package basicprogram;
import java.util.scanner;
public class multitable
{

    public static void main(String args[])
    {
       int num,i;
       Scanner sc=new Scanner (system.in);
       System.out.println("Enter the number to print multiplecation table:");
       num=sc.nextInt();
       for(i=1;i<=10;i++)
       System.out.println(num+"*"+i+"="+(num*i));
    }
}
