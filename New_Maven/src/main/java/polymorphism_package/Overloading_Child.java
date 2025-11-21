package polymorphism_package;

public class Overloading_Child extends Overloading_Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_Child obj1=new Overloading_Child();
		obj1.sum(4, 3);
	}

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		super.sum(a, b);
		int c=a+b;
		System.out.println(c);
	
	}

}
