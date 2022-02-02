package basicprogram;
import java.util.Scanner;
public class Check_Count
{

    public static void main(String args[])
    {
       System.out.println("Enter the Number");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       sc.close();
       int count=0;
       for(;number!=0;)
       {
           number/=10;
           count++;
       }
       System.out.println("The Count of Number is: "+count);

    }
}
