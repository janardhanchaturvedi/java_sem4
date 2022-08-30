import java.util.Scanner;

public class MiniMethod 
{
    
     public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number a and b");
         int a = sc.nextInt();
         int b = sc.nextInt();
         MiniMethod mm = new MiniMethod();
         int c =mm.Minvalue(a, b);
         System.out.println("Minimum are "+c); 
        
    }
    public  int Minvalue (int x , int y)
    {
        int a,b;
        
        if(x<y)
        {
            return x;
        }
        else
       return y;
       

    }
}
