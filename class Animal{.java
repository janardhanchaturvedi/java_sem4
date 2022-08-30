class ArthmeticDemo
{
    public static void main(String[] args) 
    {
        Try
        {
            int a=0 ,b=9;
            int c=b/a;
            System.out.println("the number is" +c);
        }
        catch(ArthmeticException e)
        {
            System.out.println(" the number cant be divisible by 0");
        }
    
    }
}