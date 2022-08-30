import java.util.*;
public class GreatestThreeNumCheck {
    public static void main(String agrs[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number a");
        int a= input.nextInt();
        System.out.println("Enter the Number b");
        int b = input.nextInt();
        System.out.println("Enter the Number c");
        int c= input.nextInt();
        if(a>b)
        {
            if(a>c)
            
                
                    System.out.println("Number a is greater" +a);
                
                else 
                
                    System.out.println("Number C is Greater " +c);
                
            }
            else
            {
                if(b>c)
                {
                    System.out.println("Number B is greatest " +b);

                }
                else
                {
                    System.out.println("Number c is Greatest" +c);
                }
            }
        }

    
    }
    

