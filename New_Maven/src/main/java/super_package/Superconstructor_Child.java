package super_package;

public class Superconstructor_Child extends Superconstructor_Parent {
public Superconstructor_Child()


{
	super(5);
	System.out.println("this is a constructor child");
}
public Superconstructor_Child(int b)
{
	System.out.println(b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superconstructor_Child obj1=new Superconstructor_Child();
		//Superconstructor_Parent obj2=new Superconstructor_Parent();
		Superconstructor_Child obj3=new Superconstructor_Child(2);
	}

}
