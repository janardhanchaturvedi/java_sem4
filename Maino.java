import java.util.*;
public class Maino {
    public static void main(String args[])
    {
        Scanner Jana = new Scanner(System.in);
        System.out.println("enter the num a and b");
        int a = Jana.nextInt();
        int b = Jana.nextInt();
        if(a>b)
        {
            System.out.println("b is smaller "+b);

        }
        else
        {
            System.out.println("A is smaller "+a);
        }

    }
}
