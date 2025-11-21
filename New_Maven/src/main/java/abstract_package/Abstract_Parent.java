package abstract_package;

public abstract class Abstract_Parent {
public abstract void sum();
public abstract  int difference();
public void show()
{
	System.out.println("this is");
}
public Abstract_Parent()
{
	System.out.println("this is constructor");
}
public Abstract_Parent(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
}
