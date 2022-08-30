class A
{
public final int emp_id = 01; void getdata(int id)
{
emp_id = id;
}
}
class B extends A
{
void display()
{
System.out.println("The id of the employee is: "+emp_id);
}
}
class FinalVariable
{
public static void main(String args[])
{
B obj=new B(); obj.getdata(6); obj.display();
}
}
