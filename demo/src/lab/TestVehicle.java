package lab;
abstract class vechile
{
abstract void engine();
}
class car extends vechile
{
public void engine()
{
System.out.println("car has good engine");
}
}
class truck extends vechile
{
public void engine()
{
System.out.println("truck has bad engine");
}
}
public class TestVehicle
{
public static void main(String arr[])
{
vechile v=new car();
v.engine();
vechile n=new truck();
n.engine();
}
}

