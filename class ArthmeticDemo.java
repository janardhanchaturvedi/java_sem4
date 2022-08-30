my_interface.java
public interface my_interface
{
void my_method(int val);
}
Practical28.java
class A implements my_interface
{
public void my_method(int i)
{
System.out.println("\n The value in the Class A:" +i);
}
public void another_method()
{
System.out.println("\n This is another method in the class A");
}
}
class Main
{
public static void main(String args[])
{
my_interface obj = new A();
//or A obj = new A() is also allowed
A obj1 = new A();
obj.my_method(100);
obj1.another_method();
}
}