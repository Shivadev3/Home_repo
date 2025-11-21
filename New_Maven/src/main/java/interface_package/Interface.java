package interface_package;

public interface Interface {
public static final int a=2;
int v=5;

public abstract void sum();
default void show()
{
	// final variables cant assign a=3;
	System.out.println("default");
	// final variable cant assign v=6;

}

public static void difference(int a,int b)
{
System.out.println(a+b);	
}

}
