package super_package;

public class Supermethod_Child extends Supermethod_Parent {
public void show()
{
	super.show(5);
	super.display();
	System.out.println("this is child method");
	this.display();
}
public void display()
{
	System.out.println("this method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supermethod_Child obj1=new Supermethod_Child();
//obj1.display();
obj1.show();

	}

}
