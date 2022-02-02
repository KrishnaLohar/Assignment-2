package examples;
import java.util.scanner;
public class Sum_of_Last_And_First_Digit
{

    public static void main(String args[])
    {
       int num,sum,firstdigit,lastdigit;
       Scanner sc=new Scanner (system.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       lastdigit=num%10;
       System.out.println("last digit:"+lastdigit);
       for(;num>10;)
       {
           num=num/10;
       }
       firstdigit=num;
       System.out.println("first digit:"+firstdigit);
       System.out.println("Sum of First Digit And Last Digit is : "+(firstdigit+lastdigit));
    }
 }