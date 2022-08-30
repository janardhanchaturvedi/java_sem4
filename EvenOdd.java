import java.util.*;
public class EvenOdd {
    public static void main (String args[])
    {
        System.out.println("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Entered Number is Even ");

        }
        else
        {
            System.out.println("Entered Numnber is Odd");
        }
    }
    
}
