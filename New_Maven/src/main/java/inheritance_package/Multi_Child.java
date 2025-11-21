package inheritance_package;

public class Multi_Child extends Multi_inter{
public void show()
{
	System.out.println("this is a method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_Child obj1=new Multi_Child();
		obj1.show();
		obj1.hello();
		obj1.display();
				

	}

}
