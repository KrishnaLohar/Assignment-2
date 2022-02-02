import java.util.scanner;
public class Counting_Digit_Number
{
     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int Count=0;
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        while(num!=0)
        {
            num=num/10;
            Count++;
        }
        System.out.println("Number of Digit Entered in Number are: "+num);

    }
}
