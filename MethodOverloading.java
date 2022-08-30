import java.util.Scanner;

public class MethodOverloading 
{
    public static void sum(int x)
    {
        int add = x+x;
        System.out.println("the sum is "+add);
    }
    public static void sum(int x ,int y)
    {
        int add=x+y;
        System.out.println("the sum is the "+add);
    }
    public static void sum(int x , int y , int z )
    {
        int add = x+y+z;
        System.out.println("the sum is "+add);
        
    }
    public static void main ( String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number ");
        int c = sc.nextInt();
        System.out.println("The addition of Self Single Number is");
        sum(a);
        System.out.println("The addition of Two Number is");
        sum(a,b);
        System.out.println("The addition of three Number is");
        sum(a,b,c);
    }


    
}
