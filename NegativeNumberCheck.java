import java.util.*;
public class NegativeNumberCheck {
    public static void main( String srgs[])
    {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0)
        {
            System.out.println("Enter Number is Negative"+a);

        }
        if(a>0)
        {
            System.out.println("entered NUmber is Positive "+a);
        }

        
    } 
    
}
