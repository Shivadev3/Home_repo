package abstract_package;

public class Abstract_Child extends Abstract_Parent {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
/*Abstract_Child obj=new Abstract_Child();
obj.sum();
System.out.println(obj.difference());
obj.display();*/

//reference creation of abstract class
Abstract_Parent obj1=new Abstract_Child(5,6);

//obj1.display();   we cannot access child class property by creating the parent class object /reference
obj1.sum();
System.out.println(obj1.difference());


	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
	int a=5;
	int b=6;
	int c=a+b;
	System.out.println(c);
	}

	@Override
	public int difference() {
		int a=5;
		int b=6;
		int c=a-b;
		System.out.println(c);
		// TODO Auto-generated method stub
		return 0;
	}
public void display()
{
	System.out.println("this is");
}
	public Abstract_Child(int a,int b)
	{
		super(5,5);
	 int c=a+b;
	 System.out.println(c);
	}
}
