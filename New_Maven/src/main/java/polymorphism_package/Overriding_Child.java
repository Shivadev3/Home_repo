package polymorphism_package;

public class Overriding_Child extends Overriding_Parent {
public void sum(int a,int b)
{
	super.sum(7, 8);
	int c=a-b;
	System.out.println(c);
}
public int display(int a,int b)
{
	System.out.println(super.display(4, 5));
	int c=a+b;
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding_Child obj1=new Overriding_Child();
		obj1.sum(7, 8);
		System.out.println(obj1.display(4, 7));
	}

}
