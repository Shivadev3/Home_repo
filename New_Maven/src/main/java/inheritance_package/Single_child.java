package inheritance_package;

public class Single_child extends Single_Parent{
public void show(int a)
{
	System.out.println(a);
}
	public static void main(String[] args) {
		Single_child obj1=new Single_child();
		obj1.show(5);
		obj1.display();
	Single_Parent obj2=new Single_Parent();
	obj2.display();
	//obj2.Show(5); we can't access child class property by creating parent class object
		// TODO Auto-generated method stub

	}

}
