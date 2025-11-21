package super_package;

public class Super_Child extends Super_parent {

	String color="green";
public void display()
{
	System.out.println(super.color);
	System.out.println(color);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super_Child obj1=new Super_Child();
//System.out.println(obj1.color);
obj1.display();
	}

}
